
package encodings.coco;

import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.constraints.SatFactory;
import org.chocosolver.solver.constraints.nary.cnf.LogOp;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.VariableFactory;

public class TestMobilePhone2CoCo {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();
		
		Solver solver = new Solver();
		
		//--------------------------------------------
		//Features
		//--------------------------------------------
		int contFeatures = 16;
			
		BoolVar MobilePhone_MobilePhone = (BoolVar) VariableFactory.fixed("MobilePhone_MobilePhone", 1, solver);
		BoolVar MobilePhone_Hardware = VariableFactory.bool("MobilePhone_Hardware", solver);
		BoolVar MobilePhone_Connector3G = VariableFactory.bool("MobilePhone_Connector3G", solver);
		BoolVar MobilePhone_Screen = VariableFactory.bool("MobilePhone_Screen", solver);
		BoolVar MobilePhone_Processors = VariableFactory.bool("MobilePhone_Processors", solver);
		BoolVar MobilePhone_CPU1 = VariableFactory.bool("MobilePhone_CPU1", solver);
		BoolVar MobilePhone_CPU2 = VariableFactory.bool("MobilePhone_CPU2", solver);
		BoolVar MobilePhone_GPU = VariableFactory.bool("MobilePhone_GPU", solver);
		BoolVar MobilePhone_RAM = VariableFactory.bool("MobilePhone_RAM", solver);
		BoolVar MobilePhone_GPS = VariableFactory.bool("MobilePhone_GPS", solver);
		BoolVar MobilePhone_VideoCall = VariableFactory.bool("MobilePhone_VideoCall", solver);
		BoolVar MobilePhone_TaskScheduler = VariableFactory.bool("MobilePhone_TaskScheduler", solver);
		BoolVar MobilePhone_Games = VariableFactory.bool("MobilePhone_Games", solver);
		BoolVar MobilePhone_Chess = VariableFactory.bool("MobilePhone_Chess", solver);
		BoolVar MobilePhone_CarRace3D = VariableFactory.bool("MobilePhone_CarRace3D", solver);
		BoolVar MobilePhone_Tetris = VariableFactory.bool("MobilePhone_Tetris", solver);
		
		
		//--------------------------------------------
		//Tree Constraint
		//--------------------------------------------
		SatFactory.addClauses(LogOp.implies(MobilePhone_MobilePhone, MobilePhone_Hardware), solver);
		SatFactory.addClauses(LogOp.implies(MobilePhone_Hardware, MobilePhone_Screen), solver);
		SatFactory.addClauses(LogOp.implies(MobilePhone_Hardware, MobilePhone_Processors), solver);
		SatFactory.addClauses(LogOp.implies(MobilePhone_Hardware, MobilePhone_RAM), solver);
		SatFactory.addClauses(LogOp.implies(MobilePhone_Processors, MobilePhone_CPU1), solver);
		BoolVar[] varsOrMobilePhone_Games = new BoolVar[3];
		varsOrMobilePhone_Games[0] = MobilePhone_Chess;
		varsOrMobilePhone_Games[1] = MobilePhone_CarRace3D;
		varsOrMobilePhone_Games[2] = MobilePhone_Tetris;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Games, LogOp.or(varsOrMobilePhone_Games)), solver);
		SatFactory.addClauses(LogOp.implies(MobilePhone_Hardware, MobilePhone_MobilePhone), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", 0), IntConstraintFactory.arithm(MobilePhone_Hardware, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Connector3G, MobilePhone_Hardware), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Hardware, "=", 0), IntConstraintFactory.arithm(MobilePhone_Connector3G, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Screen, MobilePhone_Hardware), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Hardware, "=", 0), IntConstraintFactory.arithm(MobilePhone_Screen, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Processors, MobilePhone_Hardware), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Hardware, "=", 0), IntConstraintFactory.arithm(MobilePhone_Processors, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_CPU1, MobilePhone_Processors), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Processors, "=", 0), IntConstraintFactory.arithm(MobilePhone_CPU1, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_CPU2, MobilePhone_Processors), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Processors, "=", 0), IntConstraintFactory.arithm(MobilePhone_CPU2, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_GPU, MobilePhone_Processors), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Processors, "=", 0), IntConstraintFactory.arithm(MobilePhone_GPU, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_RAM, MobilePhone_Hardware), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Hardware, "=", 0), IntConstraintFactory.arithm(MobilePhone_RAM, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_GPS, MobilePhone_Hardware), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Hardware, "=", 0), IntConstraintFactory.arithm(MobilePhone_GPS, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_VideoCall, MobilePhone_MobilePhone), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", 0), IntConstraintFactory.arithm(MobilePhone_VideoCall, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_TaskScheduler, MobilePhone_MobilePhone), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", 0), IntConstraintFactory.arithm(MobilePhone_TaskScheduler, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Games, MobilePhone_MobilePhone), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", 0), IntConstraintFactory.arithm(MobilePhone_Games, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Chess, MobilePhone_Games), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Games, "=", 0), IntConstraintFactory.arithm(MobilePhone_Chess, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_CarRace3D, MobilePhone_Games), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Games, "=", 0), IntConstraintFactory.arithm(MobilePhone_CarRace3D, "=", 0));
		SatFactory.addClauses(LogOp.implies(MobilePhone_Tetris, MobilePhone_Games), solver);
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Games, "=", 0), IntConstraintFactory.arithm(MobilePhone_Tetris, "=", 0));
		
		SatFactory.addClauses(LogOp.implies(MobilePhone_CPU2, MobilePhone_TaskScheduler), solver);
		SatFactory.addClauses(LogOp.implies(MobilePhone_CarRace3D, MobilePhone_GPU), solver);
		
		
		//Chatterbox.showSolutions(solver);
		Chatterbox.showStatistics(solver);
		solver.findAllSolutions();
		long end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - start));
	}
}

