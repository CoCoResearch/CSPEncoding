
package encodings.salinesi;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.VariableFactory;

public class TestMobilePhone1Salinesi {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Solver solver = new Solver();
		
		//--------------------------------------------
		//Features
		//--------------------------------------------
		int contFeatures = 18;
			
		BoolVar MobilePhone_MobilePhone = (BoolVar) VariableFactory.fixed("MobilePhone_MobilePhone", 1, solver);
		BoolVar MobilePhone_UtilityFunction = VariableFactory.bool("MobilePhone_UtilityFunction", solver);
		BoolVar MobilePhone_Calls = VariableFactory.bool("MobilePhone_Calls", solver);
		BoolVar MobilePhone_Voice = VariableFactory.bool("MobilePhone_Voice", solver);
		BoolVar MobilePhone_Data = VariableFactory.bool("MobilePhone_Data", solver);
		BoolVar MobilePhone_Messaging = VariableFactory.bool("MobilePhone_Messaging", solver);
		BoolVar MobilePhone_SMS = VariableFactory.bool("MobilePhone_SMS", solver);
		BoolVar MobilePhone_MMS = VariableFactory.bool("MobilePhone_MMS", solver);
		BoolVar MobilePhone_Games = VariableFactory.bool("MobilePhone_Games", solver);
		BoolVar MobilePhone_Alarm = VariableFactory.bool("MobilePhone_Alarm", solver);
		BoolVar MobilePhone_Settings = VariableFactory.bool("MobilePhone_Settings", solver);
		BoolVar MobilePhone_JavaSupport = VariableFactory.bool("MobilePhone_JavaSupport", solver);
		BoolVar MobilePhone_OS = VariableFactory.bool("MobilePhone_OS", solver);
		BoolVar MobilePhone_Symbian = VariableFactory.bool("MobilePhone_Symbian", solver);
		BoolVar MobilePhone_WinCE = VariableFactory.bool("MobilePhone_WinCE", solver);
		BoolVar MobilePhone_Connectivity = VariableFactory.bool("MobilePhone_Connectivity", solver);
		BoolVar MobilePhone_Bluetooth = VariableFactory.bool("MobilePhone_Bluetooth", solver);
		BoolVar MobilePhone_Wifi = VariableFactory.bool("MobilePhone_Wifi", solver);
		
		
		//--------------------------------------------
		//Tree Constraint
		//--------------------------------------------
		solver.post(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", MobilePhone_UtilityFunction));
		solver.post(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", MobilePhone_Settings));
		solver.post(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", MobilePhone_Connectivity));
		solver.post(IntConstraintFactory.arithm(MobilePhone_UtilityFunction, "=", MobilePhone_Calls));
		solver.post(IntConstraintFactory.arithm(MobilePhone_UtilityFunction, "=", MobilePhone_Messaging));
		solver.post(IntConstraintFactory.arithm(MobilePhone_Games, "<=", MobilePhone_UtilityFunction));
		solver.post(IntConstraintFactory.arithm(MobilePhone_UtilityFunction, "=", MobilePhone_Alarm));
		IntVar sumOrMobilePhone_Calls = VariableFactory.enumerated("sumOrMobilePhone_Calls", 0, 2, solver); 
		BoolVar[] varsOrMobilePhone_Calls = new BoolVar[2];
		varsOrMobilePhone_Calls[0] = MobilePhone_Voice;
		varsOrMobilePhone_Calls[1] = MobilePhone_Data;
		solver.post(IntConstraintFactory.sum(varsOrMobilePhone_Calls, sumOrMobilePhone_Calls));
		LogicalConstraintFactory.ifThenElse(MobilePhone_Calls, IntConstraintFactory.arithm(sumOrMobilePhone_Calls, ">=", 1), IntConstraintFactory.arithm(sumOrMobilePhone_Calls, "=", 0));
		IntVar sumOrMobilePhone_Messaging = VariableFactory.enumerated("sumOrMobilePhone_Messaging", 0, 2, solver); 
		BoolVar[] varsOrMobilePhone_Messaging = new BoolVar[2];
		varsOrMobilePhone_Messaging[0] = MobilePhone_SMS;
		varsOrMobilePhone_Messaging[1] = MobilePhone_MMS;
		solver.post(IntConstraintFactory.sum(varsOrMobilePhone_Messaging, sumOrMobilePhone_Messaging));
		LogicalConstraintFactory.ifThenElse(MobilePhone_Messaging, IntConstraintFactory.arithm(sumOrMobilePhone_Messaging, ">=", 1), IntConstraintFactory.arithm(sumOrMobilePhone_Messaging, "=", 0));
		solver.post(IntConstraintFactory.arithm(MobilePhone_JavaSupport, "<=", MobilePhone_Settings));
		solver.post(IntConstraintFactory.arithm(MobilePhone_Settings, "=", MobilePhone_OS));
		IntVar sumXorMobilePhone_OS = VariableFactory.fixed("sumXorMobilePhone_OS", 1, solver);
		BoolVar[] varsXorMobilePhone_OS = new BoolVar[2];
		varsXorMobilePhone_OS[0] = MobilePhone_Symbian;
		varsXorMobilePhone_OS[1] = MobilePhone_WinCE;
		LogicalConstraintFactory.ifThen(MobilePhone_OS, IntConstraintFactory.sum(varsXorMobilePhone_OS, sumXorMobilePhone_OS));
		IntVar sumOrMobilePhone_Connectivity = VariableFactory.enumerated("sumOrMobilePhone_Connectivity", 0, 2, solver); 
		BoolVar[] varsOrMobilePhone_Connectivity = new BoolVar[2];
		varsOrMobilePhone_Connectivity[0] = MobilePhone_Bluetooth;
		varsOrMobilePhone_Connectivity[1] = MobilePhone_Wifi;
		solver.post(IntConstraintFactory.sum(varsOrMobilePhone_Connectivity, sumOrMobilePhone_Connectivity));
		LogicalConstraintFactory.ifThenElse(MobilePhone_Connectivity, IntConstraintFactory.arithm(sumOrMobilePhone_Connectivity, ">=", 1), IntConstraintFactory.arithm(sumOrMobilePhone_Connectivity, "=", 0));
		IntVar sumParentChildMobilePhone_MobilePhone = VariableFactory.fixed("sumParentChildMobilePhone_MobilePhone", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_MobilePhone = new BoolVar[3];
		SatFactory.addClauses(LogOp.implies(MobilePhone_UtilityFunction, MobilePhone_MobilePhone), solver);
		varsParentChildMobilePhone_MobilePhone[0] = MobilePhone_UtilityFunction;
		IntVar sumParentChildMobilePhone_UtilityFunction = VariableFactory.fixed("sumParentChildMobilePhone_UtilityFunction", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_UtilityFunction = new BoolVar[4];
		SatFactory.addClauses(LogOp.implies(MobilePhone_Calls, MobilePhone_UtilityFunction), solver);
		varsParentChildMobilePhone_UtilityFunction[0] = MobilePhone_Calls;
		IntVar sumParentChildMobilePhone_Calls = VariableFactory.fixed("sumParentChildMobilePhone_Calls", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_Calls = new BoolVar[2];
		SatFactory.addClauses(LogOp.implies(MobilePhone_Voice, MobilePhone_Calls), solver);
		varsParentChildMobilePhone_Calls[0] = MobilePhone_Voice;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Data, MobilePhone_Calls), solver);
		varsParentChildMobilePhone_Calls[1] = MobilePhone_Data;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Calls, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_Calls, sumParentChildMobilePhone_Calls));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Messaging, MobilePhone_UtilityFunction), solver);
		varsParentChildMobilePhone_UtilityFunction[1] = MobilePhone_Messaging;
		IntVar sumParentChildMobilePhone_Messaging = VariableFactory.fixed("sumParentChildMobilePhone_Messaging", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_Messaging = new BoolVar[2];
		SatFactory.addClauses(LogOp.implies(MobilePhone_SMS, MobilePhone_Messaging), solver);
		varsParentChildMobilePhone_Messaging[0] = MobilePhone_SMS;
		SatFactory.addClauses(LogOp.implies(MobilePhone_MMS, MobilePhone_Messaging), solver);
		varsParentChildMobilePhone_Messaging[1] = MobilePhone_MMS;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Messaging, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_Messaging, sumParentChildMobilePhone_Messaging));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Games, MobilePhone_UtilityFunction), solver);
		varsParentChildMobilePhone_UtilityFunction[2] = MobilePhone_Games;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Alarm, MobilePhone_UtilityFunction), solver);
		varsParentChildMobilePhone_UtilityFunction[3] = MobilePhone_Alarm;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_UtilityFunction, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_UtilityFunction, sumParentChildMobilePhone_UtilityFunction));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Settings, MobilePhone_MobilePhone), solver);
		varsParentChildMobilePhone_MobilePhone[1] = MobilePhone_Settings;
		IntVar sumParentChildMobilePhone_Settings = VariableFactory.fixed("sumParentChildMobilePhone_Settings", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_Settings = new BoolVar[2];
		SatFactory.addClauses(LogOp.implies(MobilePhone_JavaSupport, MobilePhone_Settings), solver);
		varsParentChildMobilePhone_Settings[0] = MobilePhone_JavaSupport;
		SatFactory.addClauses(LogOp.implies(MobilePhone_OS, MobilePhone_Settings), solver);
		varsParentChildMobilePhone_Settings[1] = MobilePhone_OS;
		IntVar sumParentChildMobilePhone_OS = VariableFactory.fixed("sumParentChildMobilePhone_OS", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_OS = new BoolVar[2];
		SatFactory.addClauses(LogOp.implies(MobilePhone_Symbian, MobilePhone_OS), solver);
		varsParentChildMobilePhone_OS[0] = MobilePhone_Symbian;
		SatFactory.addClauses(LogOp.implies(MobilePhone_WinCE, MobilePhone_OS), solver);
		varsParentChildMobilePhone_OS[1] = MobilePhone_WinCE;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_OS, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_OS, sumParentChildMobilePhone_OS));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Settings, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_Settings, sumParentChildMobilePhone_Settings));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Connectivity, MobilePhone_MobilePhone), solver);
		varsParentChildMobilePhone_MobilePhone[2] = MobilePhone_Connectivity;
		IntVar sumParentChildMobilePhone_Connectivity = VariableFactory.fixed("sumParentChildMobilePhone_Connectivity", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_Connectivity = new BoolVar[2];
		SatFactory.addClauses(LogOp.implies(MobilePhone_Bluetooth, MobilePhone_Connectivity), solver);
		varsParentChildMobilePhone_Connectivity[0] = MobilePhone_Bluetooth;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Wifi, MobilePhone_Connectivity), solver);
		varsParentChildMobilePhone_Connectivity[1] = MobilePhone_Wifi;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Connectivity, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_Connectivity, sumParentChildMobilePhone_Connectivity));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_MobilePhone, sumParentChildMobilePhone_MobilePhone));
		
		
		//Chatterbox.showSolutions(solver);
		Chatterbox.showStatistics(solver);
		solver.findAllSolutions();
		long end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - start));
	}
}

