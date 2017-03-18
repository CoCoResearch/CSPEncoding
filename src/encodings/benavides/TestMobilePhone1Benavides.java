
package encodings.benavides;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;

public class TestMobilePhone1Benavides {
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
		SatFactory.addClauses(LogOp.implies(MobilePhone_Games, MobilePhone_UtilityFunction), solver);
		solver.post(IntConstraintFactory.arithm(MobilePhone_UtilityFunction, "=", MobilePhone_Alarm));
		BoolVar[] varsOrMobilePhone_Calls = new BoolVar[2];
		varsOrMobilePhone_Calls[0] = MobilePhone_Voice;
		varsOrMobilePhone_Calls[1] = MobilePhone_Data;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Calls, LogOp.or(varsOrMobilePhone_Calls)), solver);
		BoolVar[] varsOrMobilePhone_Messaging = new BoolVar[2];
		varsOrMobilePhone_Messaging[0] = MobilePhone_SMS;
		varsOrMobilePhone_Messaging[1] = MobilePhone_MMS;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Messaging, LogOp.or(varsOrMobilePhone_Messaging)), solver);
		SatFactory.addClauses(LogOp.implies(MobilePhone_JavaSupport, MobilePhone_Settings), solver);
		solver.post(IntConstraintFactory.arithm(MobilePhone_Settings, "=", MobilePhone_OS));
		BoolVar[] varsXorMobilePhone_OS = new BoolVar[2];
		varsXorMobilePhone_OS[0] = MobilePhone_Symbian;
		varsXorMobilePhone_OS[1] = MobilePhone_WinCE;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Symbian, LogOp.nor(MobilePhone_WinCE)), solver);
		SatFactory.addClauses(LogOp.implies(MobilePhone_OS, LogOp.or(varsXorMobilePhone_OS)), solver);
		BoolVar[] varsOrMobilePhone_Connectivity = new BoolVar[2];
		varsOrMobilePhone_Connectivity[0] = MobilePhone_Bluetooth;
		varsOrMobilePhone_Connectivity[1] = MobilePhone_Wifi;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Connectivity, LogOp.or(varsOrMobilePhone_Connectivity)), solver);
		SatFactory.addClauses(LogOp.implies(MobilePhone_UtilityFunction, MobilePhone_MobilePhone), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", 0), IntConstraintFactory.arithm(MobilePhone_UtilityFunction, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Calls, MobilePhone_UtilityFunction), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_UtilityFunction, "=", 0), IntConstraintFactory.arithm(MobilePhone_Calls, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Voice, MobilePhone_Calls), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Calls, "=", 0), IntConstraintFactory.arithm(MobilePhone_Voice, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Data, MobilePhone_Calls), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Calls, "=", 0), IntConstraintFactory.arithm(MobilePhone_Data, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Messaging, MobilePhone_UtilityFunction), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_UtilityFunction, "=", 0), IntConstraintFactory.arithm(MobilePhone_Messaging, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_SMS, MobilePhone_Messaging), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Messaging, "=", 0), IntConstraintFactory.arithm(MobilePhone_SMS, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_MMS, MobilePhone_Messaging), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Messaging, "=", 0), IntConstraintFactory.arithm(MobilePhone_MMS, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Games, MobilePhone_UtilityFunction), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_UtilityFunction, "=", 0), IntConstraintFactory.arithm(MobilePhone_Games, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Alarm, MobilePhone_UtilityFunction), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_UtilityFunction, "=", 0), IntConstraintFactory.arithm(MobilePhone_Alarm, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Settings, MobilePhone_MobilePhone), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", 0), IntConstraintFactory.arithm(MobilePhone_Settings, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_JavaSupport, MobilePhone_Settings), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Settings, "=", 0), IntConstraintFactory.arithm(MobilePhone_JavaSupport, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_OS, MobilePhone_Settings), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Settings, "=", 0), IntConstraintFactory.arithm(MobilePhone_OS, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Symbian, MobilePhone_OS), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_OS, "=", 0), IntConstraintFactory.arithm(MobilePhone_Symbian, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_WinCE, MobilePhone_OS), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_OS, "=", 0), IntConstraintFactory.arithm(MobilePhone_WinCE, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Connectivity, MobilePhone_MobilePhone), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", 0), IntConstraintFactory.arithm(MobilePhone_Connectivity, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Bluetooth, MobilePhone_Connectivity), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Connectivity, "=", 0), IntConstraintFactory.arithm(MobilePhone_Bluetooth, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Wifi, MobilePhone_Connectivity), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Connectivity, "=", 0), IntConstraintFactory.arithm(MobilePhone_Wifi, "=", 0));
		
		
		//Chatterbox.showSolutions(solver);
		Chatterbox.showStatistics(solver);
		solver.findAllSolutions();
		long end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - start));
	}
}

