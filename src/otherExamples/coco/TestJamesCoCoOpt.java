
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
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

public class TestJamesCoCoOpt {
	public static void main(String[] args) {
Solver solver = new Solver();
		
		//--------------------------------------------
		//Features
		//--------------------------------------------
		int contFeatures = 14;
			
		BoolVar JAMES_JAMES = (BoolVar) VariableFactory.fixed("JAMES_JAMES", 1, solver);
		BoolVar JAMES_UserManagement = VariableFactory.bool("JAMES_UserManagement", solver);
		BoolVar JAMES_DB = VariableFactory.bool("JAMES_DB", solver);
		BoolVar JAMES_LDAP = VariableFactory.bool("JAMES_LDAP", solver);
		BoolVar JAMES_WSInterface = VariableFactory.bool("JAMES_WSInterface", solver);
		BoolVar JAMES_GUI = VariableFactory.bool("JAMES_GUI", solver);
		BoolVar JAMES_PC = VariableFactory.bool("JAMES_PC", solver);
		BoolVar JAMES_PDA = VariableFactory.bool("JAMES_PDA", solver);
		BoolVar JAMES_Core = VariableFactory.bool("JAMES_Core", solver);
		BoolVar JAMES_Modules = VariableFactory.bool("JAMES_Modules", solver);
		BoolVar JAMES_Calendar = VariableFactory.bool("JAMES_Calendar", solver);
		BoolVar JAMES_Forum = VariableFactory.bool("JAMES_Forum", solver);
		BoolVar JAMES_CongressManagement = VariableFactory.bool("JAMES_CongressManagement", solver);
		BoolVar JAMES_Repository = VariableFactory.bool("JAMES_Repository", solver);
		
		//--------------------------------------------
		//Feature Attributes
		//--------------------------------------------
		HashMap<String, IntVar> featureAttrCosts = new HashMap<String, IntVar>();
		
		featureAttrCosts.put("JAMES_DB", VariableFactory.enumerated("JAMES_DBCosts", new int[]{0, 10}, solver));
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_DB"), ">=", 5), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_DB"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_DB, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_DB"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_DB, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_DB"), "!=", 0));
		featureAttrCosts.put("JAMES_LDAP", VariableFactory.enumerated("JAMES_LDAPCosts", new int[]{0, 10}, solver));
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_LDAP"), ">=", 7), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_LDAP"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_LDAP, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_LDAP"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_LDAP, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_LDAP"), "!=", 0));
		featureAttrCosts.put("JAMES_WSInterface", VariableFactory.enumerated("JAMES_WSInterfaceCosts", new int[]{0, 21}, solver));
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_WSInterface"), ">=", 20), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_WSInterface"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_WSInterface, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_WSInterface"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_WSInterface, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_WSInterface"), "!=", 0));
		featureAttrCosts.put("JAMES_PC", VariableFactory.enumerated("JAMES_PCCosts", new int[]{0, 30}, solver));
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_PC"), ">=", 30), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_PC"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_PC, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_PC"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_PC, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_PC"), "!=", 0));
		featureAttrCosts.put("JAMES_PDA", VariableFactory.enumerated("JAMES_PDACosts", new int[]{0, 18}, solver));
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_PDA"), ">=", 18), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_PDA"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_PDA, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_PDA"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_PDA, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_PDA"), "!=", 0));
		featureAttrCosts.put("JAMES_Core", VariableFactory.enumerated("JAMES_CoreCosts", new int[]{0, 500}, solver));
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Core"), ">=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Core"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Core, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Core"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Core, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Core"), "!=", 0));
		featureAttrCosts.put("JAMES_Calendar", VariableFactory.enumerated("JAMES_CalendarCosts", new int[]{0, 50}, solver));
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Calendar"), ">=", 50), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Calendar"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Calendar, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Calendar"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Calendar, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Calendar"), "!=", 0));
		featureAttrCosts.put("JAMES_Forum", VariableFactory.enumerated("JAMES_ForumCosts", new int[]{0, 30}, solver));
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Forum"), ">=", 30), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Forum"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Forum, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Forum"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Forum, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Forum"), "!=", 0));
		featureAttrCosts.put("JAMES_CongressManagement", VariableFactory.enumerated("JAMES_CongressManagementCosts", new int[]{0, 20}, solver));
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_CongressManagement"), ">=", 20), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_CongressManagement"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_CongressManagement, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_CongressManagement"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_CongressManagement, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_CongressManagement"), "!=", 0));
		featureAttrCosts.put("JAMES_Repository", VariableFactory.enumerated("JAMES_RepositoryCosts", new int[]{0, 10}, solver));
		LogicalConstraintFactory.or(IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Repository"), ">=", 10), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Repository"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Repository, "=", 0), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Repository"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Repository, "=", 1), IntConstraintFactory.arithm(featureAttrCosts.get("JAMES_Repository"), "!=", 0));
		
		//--------------------------------------------
		//Tree Constraint
		//--------------------------------------------
		SatFactory.addClauses(LogOp.implies(JAMES_JAMES, JAMES_UserManagement), solver);
		SatFactory.addClauses(LogOp.implies(JAMES_JAMES, JAMES_GUI), solver);
		SatFactory.addClauses(LogOp.implies(JAMES_JAMES, JAMES_Core), solver);
		SatFactory.addClauses(LogOp.implies(JAMES_JAMES, JAMES_Modules), solver);
		BoolVar[] varsXorJAMES_UserManagement = new BoolVar[2];
		varsXorJAMES_UserManagement[0] = JAMES_DB;
		varsXorJAMES_UserManagement[1] = JAMES_LDAP;
		SatFactory.addClauses(LogOp.implies(JAMES_DB, LogOp.nor(JAMES_LDAP)), solver);
		SatFactory.addClauses(LogOp.implies(JAMES_UserManagement, LogOp.or(varsXorJAMES_UserManagement)), solver);
		BoolVar[] varsOrJAMES_GUI = new BoolVar[2];
		varsOrJAMES_GUI[0] = JAMES_PC;
		varsOrJAMES_GUI[1] = JAMES_PDA;
		SatFactory.addClauses(LogOp.implies(JAMES_GUI, LogOp.or(varsOrJAMES_GUI)), solver);
		BoolVar[] varsOrJAMES_Modules = new BoolVar[4];
		varsOrJAMES_Modules[0] = JAMES_Calendar;
		varsOrJAMES_Modules[1] = JAMES_Forum;
		varsOrJAMES_Modules[2] = JAMES_CongressManagement;
		varsOrJAMES_Modules[3] = JAMES_Repository;
		SatFactory.addClauses(LogOp.implies(JAMES_Modules, LogOp.or(varsOrJAMES_Modules)), solver);
		SatFactory.addClauses(LogOp.implies(JAMES_UserManagement, JAMES_JAMES), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_JAMES, "=", 0), IntConstraintFactory.arithm(JAMES_UserManagement, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_DB, JAMES_UserManagement), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_UserManagement, "=", 0), IntConstraintFactory.arithm(JAMES_DB, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_LDAP, JAMES_UserManagement), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_UserManagement, "=", 0), IntConstraintFactory.arithm(JAMES_LDAP, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_WSInterface, JAMES_JAMES), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_JAMES, "=", 0), IntConstraintFactory.arithm(JAMES_WSInterface, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_GUI, JAMES_JAMES), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_JAMES, "=", 0), IntConstraintFactory.arithm(JAMES_GUI, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_PC, JAMES_GUI), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_GUI, "=", 0), IntConstraintFactory.arithm(JAMES_PC, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_PDA, JAMES_GUI), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_GUI, "=", 0), IntConstraintFactory.arithm(JAMES_PDA, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_Core, JAMES_JAMES), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_JAMES, "=", 0), IntConstraintFactory.arithm(JAMES_Core, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_Modules, JAMES_JAMES), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_JAMES, "=", 0), IntConstraintFactory.arithm(JAMES_Modules, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_Calendar, JAMES_Modules), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Modules, "=", 0), IntConstraintFactory.arithm(JAMES_Calendar, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_Forum, JAMES_Modules), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Modules, "=", 0), IntConstraintFactory.arithm(JAMES_Forum, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_CongressManagement, JAMES_Modules), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Modules, "=", 0), IntConstraintFactory.arithm(JAMES_CongressManagement, "=", 0));
		SatFactory.addClauses(LogOp.implies(JAMES_Repository, JAMES_Modules), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Modules, "=", 0), IntConstraintFactory.arithm(JAMES_Repository, "=", 0));
		
		SatFactory.addClauses(LogOp.implies(JAMES_Repository, LogOp.nor(JAMES_PDA)), solver);
		SatFactory.addClauses(LogOp.implies(JAMES_CongressManagement, JAMES_PDA), solver);
		
		
		long start = System.currentTimeMillis();
		System.out.println("Started at: " + start);
		List<IntVar> varsCostsList = new ArrayList<IntVar>(featureAttrCosts.values());
		IntVar[] varsCosts = new IntVar[featureAttrCosts.values().size()];
			
		for(int i = 0; i < varsCostsList.size(); i++) {
			varsCosts[i] = (IntVar) varsCostsList.get(i);
		}		
		IntVar totalCosts = VariableFactory.enumerated("totalCosts", 0, 1000000, solver);
		solver.post(IntConstraintFactory.sum(varsCosts, totalCosts));
		
		Chatterbox.showStatistics(solver);
		//Chatterbox.showSolutions(solver);
		solver.findOptimalSolution(ResolutionPolicy.MINIMIZE, totalCosts);
		long end = System.currentTimeMillis();
		System.out.println("Ended at: " + end);
		System.out.println("Total time: " + (end - start));

	}
}

