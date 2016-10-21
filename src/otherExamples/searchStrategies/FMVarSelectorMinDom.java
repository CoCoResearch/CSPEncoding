package otherExamples.searchStrategies;

import java.util.ArrayList;
import java.util.List;

import org.chocosolver.solver.search.strategy.selectors.VariableEvaluator;
import org.chocosolver.solver.search.strategy.selectors.VariableSelector;
import org.chocosolver.solver.variables.IntVar;

public class FMVarSelectorMinDom implements VariableSelector<IntVar>, VariableEvaluator<IntVar> {
	
	@Override
	public double evaluate(IntVar variable) {
		return variable.getPropagators().length;
	}

	@Override
	public IntVar getVariable(IntVar[] variables) {
		IntVar variable = null;
		
		if(variables.length > 0) {
			int globalMinDomainSize = variables[0].getDomainSize();
			variable = variables[0];
			
			//Search variable with the smallest domain size. If there are multiple
			//variables with the same domain size, it takes the first one.
			for(int i = 1; i < variables.length; i++) {
				int localDomainSize = variables[i].getDomainSize();
				
				if(localDomainSize < globalMinDomainSize) {
					globalMinDomainSize = variables[i].getDomainSize();
					variable = variables[i];
				}
			}
		}
		
		return variable;
	}
}
