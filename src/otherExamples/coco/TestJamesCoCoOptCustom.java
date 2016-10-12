
package otherExamples.coco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.chocosolver.solver.ResolutionPolicy;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.search.strategy.IntStrategyFactory;
import org.chocosolver.solver.search.strategy.selectors.values.IntDomainMin;
import org.chocosolver.solver.search.strategy.strategy.IntStrategy;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

import otherExamples.searchStrategies.FMVarSelector;

public class TestJamesCoCoOptCustom {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Solver solver = new Solver();
		
		//--------------------------------------------
		//Features
		//--------------------------------------------
		int contFeatures = 14;
		
		BoolVar[] features = new BoolVar[contFeatures];
		
		features[0] = (BoolVar) VariableFactory.fixed("JAMES_JAMES", 1, solver);
		features[1] = VariableFactory.bool("JAMES_UserManagement", solver);
		features[2] = VariableFactory.bool("JAMES_DB", solver);
		features[3] = VariableFactory.bool("JAMES_LDAP", solver);
		features[4] = VariableFactory.bool("JAMES_WSInterface", solver);
		features[5] = VariableFactory.bool("JAMES_GUI", solver);
		features[6] = VariableFactory.bool("JAMES_PC", solver);
		features[7] = VariableFactory.bool("JAMES_PDA", solver);
		features[8] = VariableFactory.bool("JAMES_Core", solver);
		features[9] = VariableFactory.bool("JAMES_Modules", solver);
		features[10] = VariableFactory.bool("JAMES_Calendar", solver);
		features[11] = VariableFactory.bool("JAMES_Forum", solver);
		features[12] = VariableFactory.bool("JAMES_CongressManagement", solver);
		features[13] = VariableFactory.bool("JAMES_Repository", solver);
		
		//--------------------------------------------
		//Feature Attributes
		//--------------------------------------------
		IntVar[] featureAttrCosts = new IntVar [10];
		
		featureAttrCosts[0] = VariableFactory.enumerated("JAMES_DBCosts", 0, 10, solver);
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts[0], ">=", 5), IntConstraintFactory.arithm(featureAttrCosts[0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[2], "=", 0), IntConstraintFactory.arithm(featureAttrCosts[0], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[2], "=", 1), IntConstraintFactory.arithm(featureAttrCosts[0], "!=", 0));
		featureAttrCosts[1] = VariableFactory.enumerated("JAMES_LDAPCosts", 0, 10, solver);
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts[1], ">=", 7), IntConstraintFactory.arithm(featureAttrCosts[1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[3], "=", 0), IntConstraintFactory.arithm(featureAttrCosts[1], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[3], "=", 1), IntConstraintFactory.arithm(featureAttrCosts[1], "!=", 0));
		featureAttrCosts[2] = VariableFactory.enumerated("JAMES_WSInterfaceCosts", 0, 21, solver);
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts[2], ">=", 20), IntConstraintFactory.arithm(featureAttrCosts[2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[4], "=", 0), IntConstraintFactory.arithm(featureAttrCosts[2], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[4], "=", 1), IntConstraintFactory.arithm(featureAttrCosts[2], "!=", 0));
		featureAttrCosts[3] = VariableFactory.enumerated("JAMES_PCCosts", 0, 30, solver);
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts[3], ">=", 30), IntConstraintFactory.arithm(featureAttrCosts[3], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[6], "=", 0), IntConstraintFactory.arithm(featureAttrCosts[3], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[6], "=", 1), IntConstraintFactory.arithm(featureAttrCosts[3], "!=", 0));
		featureAttrCosts[4] = VariableFactory.enumerated("JAMES_PDACosts", 0, 18, solver);
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts[4], ">=", 18), IntConstraintFactory.arithm(featureAttrCosts[4], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[7], "=", 0), IntConstraintFactory.arithm(featureAttrCosts[4], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[7], "=", 1), IntConstraintFactory.arithm(featureAttrCosts[4], "!=", 0));
		featureAttrCosts[5] = VariableFactory.enumerated("JAMES_CoreCosts", 0, 500, solver);
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts[5], ">=", 0), IntConstraintFactory.arithm(featureAttrCosts[5], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[8], "=", 0), IntConstraintFactory.arithm(featureAttrCosts[5], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[8], "=", 1), IntConstraintFactory.arithm(featureAttrCosts[5], "!=", 0));
		featureAttrCosts[6] = VariableFactory.enumerated("JAMES_CalendarCosts", 0, 50, solver);
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts[6], ">=", 50), IntConstraintFactory.arithm(featureAttrCosts[6], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[10], "=", 0), IntConstraintFactory.arithm(featureAttrCosts[6], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[10], "=", 1), IntConstraintFactory.arithm(featureAttrCosts[6], "!=", 0));
		featureAttrCosts[7] = VariableFactory.enumerated("JAMES_ForumCosts", 0, 30, solver);
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts[7], ">=", 30), IntConstraintFactory.arithm(featureAttrCosts[7], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[11], "=", 0), IntConstraintFactory.arithm(featureAttrCosts[7], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[11], "=", 1), IntConstraintFactory.arithm(featureAttrCosts[7], "!=", 0));
		featureAttrCosts[8] = VariableFactory.enumerated("JAMES_CongressManagementCosts", 0, 20, solver);
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts[8], ">=", 20), IntConstraintFactory.arithm(featureAttrCosts[8], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[12], "=", 0), IntConstraintFactory.arithm(featureAttrCosts[8], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[12], "=", 1), IntConstraintFactory.arithm(featureAttrCosts[8], "!=", 0));
		featureAttrCosts[9] = VariableFactory.enumerated("JAMES_RepositoryCosts", 0, 10, solver);
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts[9], ">=", 10), IntConstraintFactory.arithm(featureAttrCosts[9], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[13], "=", 0), IntConstraintFactory.arithm(featureAttrCosts[9], "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[13], "=", 1), IntConstraintFactory.arithm(featureAttrCosts[9], "!=", 0));
		
		//--------------------------------------------
		//Tree Constraint
		//--------------------------------------------
		SatFactory.addClauses(LogOp.implies(features[0], features[1]), solver);
		SatFactory.addClauses(LogOp.implies(features[0], features[5]), solver);
		SatFactory.addClauses(LogOp.implies(features[0], features[8]), solver);
		SatFactory.addClauses(LogOp.implies(features[0], features[9]), solver);
		BoolVar[] varsXorJAMES_UserManagement = new BoolVar[2];
		varsXorJAMES_UserManagement[0] = features[2];
		varsXorJAMES_UserManagement[1] = features[3];
		SatFactory.addClauses(LogOp.implies(features[2], LogOp.nor(features[3])), solver);
		SatFactory.addClauses(LogOp.implies(features[1], LogOp.or(varsXorJAMES_UserManagement)), solver);
		BoolVar[] varsOrJAMES_GUI = new BoolVar[2];
		varsOrJAMES_GUI[0] = features[6];
		varsOrJAMES_GUI[1] = features[7];
		SatFactory.addClauses(LogOp.implies(features[5], LogOp.or(varsOrJAMES_GUI)), solver);
		BoolVar[] varsOrJAMES_Modules = new BoolVar[4];
		varsOrJAMES_Modules[0] = features[10];
		varsOrJAMES_Modules[1] = features[11];
		varsOrJAMES_Modules[2] = features[12];
		varsOrJAMES_Modules[3] = features[13];
		SatFactory.addClauses(LogOp.implies(features[9], LogOp.or(varsOrJAMES_Modules)), solver);
		SatFactory.addClauses(LogOp.implies(features[1], features[0]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[0], "=", 0), IntConstraintFactory.arithm(features[1], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[2], features[1]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[1], "=", 0), IntConstraintFactory.arithm(features[2], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[3], features[1]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[1], "=", 0), IntConstraintFactory.arithm(features[3], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[4], features[0]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[0], "=", 0), IntConstraintFactory.arithm(features[4], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[5], features[0]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[0], "=", 0), IntConstraintFactory.arithm(features[5], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[6], features[5]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[5], "=", 0), IntConstraintFactory.arithm(features[6], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[7], features[5]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[5], "=", 0), IntConstraintFactory.arithm(features[7], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[8], features[0]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[0], "=", 0), IntConstraintFactory.arithm(features[8], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[9], features[0]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[0], "=", 0), IntConstraintFactory.arithm(features[9], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[10], features[9]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[9], "=", 0), IntConstraintFactory.arithm(features[10], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[11], features[9]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[9], "=", 0), IntConstraintFactory.arithm(features[11], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[12], features[9]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[9], "=", 0), IntConstraintFactory.arithm(features[12], "=", 0));
		SatFactory.addClauses(LogOp.implies(features[13], features[9]), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(features[9], "=", 0), IntConstraintFactory.arithm(features[13], "=", 0));
		
		SatFactory.addClauses(LogOp.implies(features[13], LogOp.nor(features[7])), solver);
		SatFactory.addClauses(LogOp.implies(features[12], features[7]), solver);
		
		
		IntVar totalCosts = VariableFactory.enumerated("totalCosts", 0, 1000000, solver);
		solver.post(IntConstraintFactory.sum(featureAttrCosts, totalCosts));
		
		IntStrategy strategy1 = IntStrategyFactory.custom(IntStrategyFactory.minDomainSize_var_selector(), new IntDomainMin(), features);
		IntStrategy strategy2 = IntStrategyFactory.custom(new FMVarSelector(), new IntDomainMin(), featureAttrCosts);
		IntStrategy strategy3 = IntStrategyFactory.custom(IntStrategyFactory.minDomainSize_var_selector(), new IntDomainMin(), totalCosts);
		solver.set(strategy1, strategy2, strategy3);
		
		//Chatterbox.showSolutions(solver);
		Chatterbox.showStatistics(solver);
		solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, totalCosts);
		long end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - start));
	}
}

