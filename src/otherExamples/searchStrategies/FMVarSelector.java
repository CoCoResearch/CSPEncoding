package otherExamples.searchStrategies;

import java.util.ArrayList;
import java.util.List;

import org.chocosolver.solver.search.strategy.selectors.VariableEvaluator;
import org.chocosolver.solver.search.strategy.selectors.VariableSelector;
import org.chocosolver.solver.variables.IntVar;

public class FMVarSelector implements VariableSelector<IntVar>, VariableEvaluator<IntVar> {

	@Override
	public double evaluate(IntVar variable) {
		return variable.getPropagators().length;
	}

	@Override
	public IntVar getVariable(IntVar[] variables) {
		IntVar variable = null;
		
		if(variables.length > 0) {
			int globalMinDomainSize = variables[0].getDomainSize();
			int globalMoreConstrained = variables[0].getPropagators().length;

			List<IntVar> varsMinDomainSize = new ArrayList<IntVar>();
			varsMinDomainSize.add(variables[0]);
			
			//Search variables with the smallest domain size.
			for(int i = 1; i < variables.length; i++) {
				int localDomainSize = variables[i].getDomainSize();
				
				if(localDomainSize >= 0 && localDomainSize < globalMinDomainSize) {
					varsMinDomainSize = new ArrayList<IntVar>();
					varsMinDomainSize.add(variables[i]);
				}
				else if(localDomainSize == globalMinDomainSize) {
					varsMinDomainSize.add(variables[i]);
				}
			}
			
			//Search the more constrained variable. If there are multiple
			//variables with the same number of constraints, it takes the
			//first one.
			if(varsMinDomainSize.size() > 0) {
				IntVar varMoreConstrained = varsMinDomainSize.get(0);
				
				for(int i = 1; i < varsMinDomainSize.size(); i++) {
					int localConstraints = varsMinDomainSize.get(i).getPropagators().length;
					
					if(localConstraints > globalMoreConstrained) {
						varMoreConstrained = varsMinDomainSize.get(i);
						globalMoreConstrained = localConstraints;
					}
				}
				
				variable = varMoreConstrained;
			}
		}
		
		return variable;
	}

}
