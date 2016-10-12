
package otherExamples.salinesi;

import java.util.HashMap;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

public class TestJamesSalinesi {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
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
		//Tree Constraint
		//--------------------------------------------
		solver.post(IntConstraintFactory.arithm(JAMES_JAMES, "=", JAMES_UserManagement));
		solver.post(IntConstraintFactory.arithm(JAMES_WSInterface, "<=", JAMES_JAMES));
		solver.post(IntConstraintFactory.arithm(JAMES_JAMES, "=", JAMES_GUI));
		solver.post(IntConstraintFactory.arithm(JAMES_JAMES, "=", JAMES_Core));
		solver.post(IntConstraintFactory.arithm(JAMES_JAMES, "=", JAMES_Modules));
		IntVar sumXorJAMES_UserManagement = VariableFactory.fixed("sumXorJAMES_UserManagement", 1, solver);
		BoolVar[] varsXorJAMES_UserManagement = new BoolVar[2];
		varsXorJAMES_UserManagement[0] = JAMES_DB;
		varsXorJAMES_UserManagement[1] = JAMES_LDAP;
		LogicalConstraintFactory.ifThen(JAMES_UserManagement, IntConstraintFactory.sum(varsXorJAMES_UserManagement, sumXorJAMES_UserManagement));
		IntVar sumOrJAMES_GUI = VariableFactory.enumerated("sumOrJAMES_GUI", 0, 2, solver); 
		BoolVar[] varsOrJAMES_GUI = new BoolVar[2];
		varsOrJAMES_GUI[0] = JAMES_PC;
		varsOrJAMES_GUI[1] = JAMES_PDA;
		solver.post(IntConstraintFactory.sum(varsOrJAMES_GUI, sumOrJAMES_GUI));
		LogicalConstraintFactory.ifThenElse(JAMES_GUI, IntConstraintFactory.arithm(sumOrJAMES_GUI, ">=", 1), IntConstraintFactory.arithm(sumOrJAMES_GUI, "=", 0));
		IntVar sumOrJAMES_Modules = VariableFactory.enumerated("sumOrJAMES_Modules", 0, 4, solver); 
		BoolVar[] varsOrJAMES_Modules = new BoolVar[4];
		varsOrJAMES_Modules[0] = JAMES_Calendar;
		varsOrJAMES_Modules[1] = JAMES_Forum;
		varsOrJAMES_Modules[2] = JAMES_CongressManagement;
		varsOrJAMES_Modules[3] = JAMES_Repository;
		solver.post(IntConstraintFactory.sum(varsOrJAMES_Modules, sumOrJAMES_Modules));
		LogicalConstraintFactory.ifThenElse(JAMES_Modules, IntConstraintFactory.arithm(sumOrJAMES_Modules, ">=", 1), IntConstraintFactory.arithm(sumOrJAMES_Modules, "=", 0));
		IntVar sumParentChildJAMES_JAMES = VariableFactory.fixed("sumParentChildJAMES_JAMES", 0, solver); 
		BoolVar[] varsParentChildJAMES_JAMES = new BoolVar[5];
		SatFactory.addClauses(LogOp.implies(JAMES_UserManagement, JAMES_JAMES), solver);
		varsParentChildJAMES_JAMES[0] = JAMES_UserManagement;
		IntVar sumParentChildJAMES_UserManagement = VariableFactory.fixed("sumParentChildJAMES_UserManagement", 0, solver); 
		BoolVar[] varsParentChildJAMES_UserManagement = new BoolVar[2];
		SatFactory.addClauses(LogOp.implies(JAMES_DB, JAMES_UserManagement), solver);
		varsParentChildJAMES_UserManagement[0] = JAMES_DB;
		SatFactory.addClauses(LogOp.implies(JAMES_LDAP, JAMES_UserManagement), solver);
		varsParentChildJAMES_UserManagement[1] = JAMES_LDAP;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_UserManagement, "=", 0), IntConstraintFactory.sum(varsParentChildJAMES_UserManagement, sumParentChildJAMES_UserManagement));
		SatFactory.addClauses(LogOp.implies(JAMES_WSInterface, JAMES_JAMES), solver);
		varsParentChildJAMES_JAMES[1] = JAMES_WSInterface;
		SatFactory.addClauses(LogOp.implies(JAMES_GUI, JAMES_JAMES), solver);
		varsParentChildJAMES_JAMES[2] = JAMES_GUI;
		IntVar sumParentChildJAMES_GUI = VariableFactory.fixed("sumParentChildJAMES_GUI", 0, solver); 
		BoolVar[] varsParentChildJAMES_GUI = new BoolVar[2];
		SatFactory.addClauses(LogOp.implies(JAMES_PC, JAMES_GUI), solver);
		varsParentChildJAMES_GUI[0] = JAMES_PC;
		SatFactory.addClauses(LogOp.implies(JAMES_PDA, JAMES_GUI), solver);
		varsParentChildJAMES_GUI[1] = JAMES_PDA;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_GUI, "=", 0), IntConstraintFactory.sum(varsParentChildJAMES_GUI, sumParentChildJAMES_GUI));
		SatFactory.addClauses(LogOp.implies(JAMES_Core, JAMES_JAMES), solver);
		varsParentChildJAMES_JAMES[3] = JAMES_Core;
		SatFactory.addClauses(LogOp.implies(JAMES_Modules, JAMES_JAMES), solver);
		varsParentChildJAMES_JAMES[4] = JAMES_Modules;
		IntVar sumParentChildJAMES_Modules = VariableFactory.fixed("sumParentChildJAMES_Modules", 0, solver); 
		BoolVar[] varsParentChildJAMES_Modules = new BoolVar[4];
		SatFactory.addClauses(LogOp.implies(JAMES_Calendar, JAMES_Modules), solver);
		varsParentChildJAMES_Modules[0] = JAMES_Calendar;
		SatFactory.addClauses(LogOp.implies(JAMES_Forum, JAMES_Modules), solver);
		varsParentChildJAMES_Modules[1] = JAMES_Forum;
		SatFactory.addClauses(LogOp.implies(JAMES_CongressManagement, JAMES_Modules), solver);
		varsParentChildJAMES_Modules[2] = JAMES_CongressManagement;
		SatFactory.addClauses(LogOp.implies(JAMES_Repository, JAMES_Modules), solver);
		varsParentChildJAMES_Modules[3] = JAMES_Repository;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_Modules, "=", 0), IntConstraintFactory.sum(varsParentChildJAMES_Modules, sumParentChildJAMES_Modules));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(JAMES_JAMES, "=", 0), IntConstraintFactory.sum(varsParentChildJAMES_JAMES, sumParentChildJAMES_JAMES));
		
		SatFactory.addClauses(LogOp.implies(JAMES_Repository, LogOp.nor(JAMES_PDA)), solver);
		SatFactory.addClauses(LogOp.implies(JAMES_CongressManagement, JAMES_PDA), solver);
		
		
		//Chatterbox.showSolutions(solver);
		Chatterbox.showStatistics(solver);
		solver.findAllSolutions();
		long end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - start));
	}
}

