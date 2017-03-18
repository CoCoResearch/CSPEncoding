
package encodings.coco;

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

public class TestJamesCoCo {
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
		
		
		//Chatterbox.showSolutions(solver);
		Chatterbox.showStatistics(solver);
		solver.findAllSolutions();
		long end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - start));
	}
}

