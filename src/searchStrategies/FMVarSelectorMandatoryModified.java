package searchStrategies;

import org.chocosolver.solver.constraints.Propagator;
import org.chocosolver.solver.search.strategy.selectors.VariableEvaluator;
import org.chocosolver.solver.search.strategy.selectors.VariableSelector;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.Variable;

public class FMVarSelectorMandatoryModified implements VariableSelector<IntVar>, VariableEvaluator<IntVar> {
	@Override
	public double evaluate(IntVar variable) {
		return variable.getPropagators().length;
	}

	@Override
	public IntVar getVariable(IntVar[] variables) {
		IntVar variable = null;
		
		if(variables.length > 0) {
			variable = getVarsInMandatoryRequiresConstraints(variables);
			
			/*if(variable == null) {
				variable = getVarMoreConstrained(variables);
				variable = getAnyVar(variables);
				if(variable == null){
					variable = getAnyVar(variables);
				}
			}*/
		}
		
		return variable;
	}
	
	private IntVar getVarsInMandatoryRequiresConstraints(IntVar[] variables){
		IntVar variable = null;
		boolean exists = false;
		
		for(int i = 0; i < variables.length && !exists; i++) {
			if(!variables[i].isInstantiated()) {
				Propagator[] propagators = variables[i].getPropagators();
				
				for(int j = 0; j < propagators.length && !exists; j++) {
					String constraintName = propagators[j].getConstraint().getName();
					
					if(constraintName.equals(Utilities.MANDATORY_TC) || constraintName.equals(Utilities.REQUIRES_CTC) 
						|| constraintName.equals(Utilities.REQUIRES_CMC) || constraintName.equals(Utilities.EXCLUDES_CTC) 
						|| constraintName.equals(Utilities.EXCLUDES_CMC)){
						IntVar[] vars = (IntVar[]) propagators[j].getVars();
						
						for(int k = 0; k < vars.length; k++) {
							if(vars[k].isInstantiated()) {
								variable = variables[i];
								//System.out.println("MANDATORY: " + variable);
								exists = true;
							}
						}
					}		
				}
			}
		}
		
		return variable;
	}
	
	private IntVar getVarMoreConstrained(IntVar[] variables) {
		IntVar variable = null;
		int globalMoreInstantiatedPerc = -1;
		
		for(int i = 0; i < variables.length; i++) {
			if(!variables[i].isInstantiated()) {
				int varsLength = 0;
				int instantVarsLength = 0;
				int localMoreInstantiatedPerc = 0;
				Propagator[] propagators = variables[i].getPropagators();
				
				for(int j = 0; j < propagators.length; j++) {
					varsLength += propagators[j].getNbVars();
					Variable[] vars = propagators[j].getVars();
					
					for(int k = 0; k < vars.length; k++) {
						if(vars[k].isInstantiated()) {
							instantVarsLength++;
						}
					}
				}
				
				if(varsLength > 0) {
					localMoreInstantiatedPerc = instantVarsLength/varsLength;
					if(localMoreInstantiatedPerc > globalMoreInstantiatedPerc) {
						variable = variables[i];
					}
				}
				else {
					variable = variables[i];
				}	
			}
		}	
		//System.out.println("OTHER: " + variable);
		return variable;
	}
	
	private IntVar getAnyVar(IntVar[] variables){
		IntVar variable = null;
		boolean found = false;
		
		for(int i = 0; i < variables.length && !found; i++) {
			if(!variables[i].isInstantiated()){
				variable = variables[i];
				found = true;
			}
		}
		//System.out.println("ANY: " + variable);
		return variable;
	}
}
