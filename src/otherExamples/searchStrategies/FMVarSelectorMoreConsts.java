package otherExamples.searchStrategies;

import java.util.ArrayList;
import java.util.List;

import org.chocosolver.solver.search.strategy.selectors.VariableEvaluator;
import org.chocosolver.solver.search.strategy.selectors.VariableSelector;
import org.chocosolver.solver.variables.IntVar;

public class FMVarSelectorMoreConsts implements VariableSelector<IntVar>, VariableEvaluator<IntVar> {
	
	@Override
	public double evaluate(IntVar variable) {
		return variable.getPropagators().length;
	}

	@Override
	public IntVar getVariable(IntVar[] variables) {
		IntVar variable = null;
		
		if(variables.length > 0) {
			int globalMoreConstrained = variables[0].getPropagators().length;
			IntVar varMoreConstrained = variables[0];
			
			//Search the more constrained variable. If there are multiple
			//variables with the same number of constraints, it takes the
			//first one.
			for(int i = 1; i < variables.length; i++) {
				int localConstraints = variables[i].getPropagators().length;
				
				if(localConstraints > globalMoreConstrained) {
					varMoreConstrained = variables[i];
					globalMoreConstrained = localConstraints;
				}
			}
			
			variable = varMoreConstrained;
		}
		
		return variable;
	}
}
