
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

public class TestMobilePhone2Salinesi {
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
		solver.post(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", MobilePhone_Hardware));
		solver.post(IntConstraintFactory.arithm(MobilePhone_VideoCall, "<=", MobilePhone_MobilePhone));
		solver.post(IntConstraintFactory.arithm(MobilePhone_TaskScheduler, "<=", MobilePhone_MobilePhone));
		solver.post(IntConstraintFactory.arithm(MobilePhone_Games, "<=", MobilePhone_MobilePhone));
		solver.post(IntConstraintFactory.arithm(MobilePhone_Connector3G, "<=", MobilePhone_Hardware));
		solver.post(IntConstraintFactory.arithm(MobilePhone_Hardware, "=", MobilePhone_Screen));
		solver.post(IntConstraintFactory.arithm(MobilePhone_Hardware, "=", MobilePhone_Processors));
		solver.post(IntConstraintFactory.arithm(MobilePhone_Hardware, "=", MobilePhone_RAM));
		solver.post(IntConstraintFactory.arithm(MobilePhone_GPS, "<=", MobilePhone_Hardware));
		solver.post(IntConstraintFactory.arithm(MobilePhone_Processors, "=", MobilePhone_CPU1));
		solver.post(IntConstraintFactory.arithm(MobilePhone_CPU2, "<=", MobilePhone_Processors));
		solver.post(IntConstraintFactory.arithm(MobilePhone_GPU, "<=", MobilePhone_Processors));
		IntVar sumOrMobilePhone_Games = VariableFactory.enumerated("sumOrMobilePhone_Games", 0, 3, solver); 
		BoolVar[] varsOrMobilePhone_Games = new BoolVar[3];
		varsOrMobilePhone_Games[0] = MobilePhone_Chess;
		varsOrMobilePhone_Games[1] = MobilePhone_CarRace3D;
		varsOrMobilePhone_Games[2] = MobilePhone_Tetris;
		solver.post(IntConstraintFactory.sum(varsOrMobilePhone_Games, sumOrMobilePhone_Games));
		LogicalConstraintFactory.ifThenElse(MobilePhone_Games, IntConstraintFactory.arithm(sumOrMobilePhone_Games, ">=", 1), IntConstraintFactory.arithm(sumOrMobilePhone_Games, "=", 0));
		IntVar sumParentChildMobilePhone_MobilePhone = VariableFactory.fixed("sumParentChildMobilePhone_MobilePhone", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_MobilePhone = new BoolVar[4];
		SatFactory.addClauses(LogOp.implies(MobilePhone_Hardware, MobilePhone_MobilePhone), solver);
		varsParentChildMobilePhone_MobilePhone[0] = MobilePhone_Hardware;
		IntVar sumParentChildMobilePhone_Hardware = VariableFactory.fixed("sumParentChildMobilePhone_Hardware", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_Hardware = new BoolVar[5];
		SatFactory.addClauses(LogOp.implies(MobilePhone_Connector3G, MobilePhone_Hardware), solver);
		varsParentChildMobilePhone_Hardware[0] = MobilePhone_Connector3G;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Screen, MobilePhone_Hardware), solver);
		varsParentChildMobilePhone_Hardware[1] = MobilePhone_Screen;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Processors, MobilePhone_Hardware), solver);
		varsParentChildMobilePhone_Hardware[2] = MobilePhone_Processors;
		IntVar sumParentChildMobilePhone_Processors = VariableFactory.fixed("sumParentChildMobilePhone_Processors", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_Processors = new BoolVar[3];
		SatFactory.addClauses(LogOp.implies(MobilePhone_CPU1, MobilePhone_Processors), solver);
		varsParentChildMobilePhone_Processors[0] = MobilePhone_CPU1;
		SatFactory.addClauses(LogOp.implies(MobilePhone_CPU2, MobilePhone_Processors), solver);
		varsParentChildMobilePhone_Processors[1] = MobilePhone_CPU2;
		SatFactory.addClauses(LogOp.implies(MobilePhone_GPU, MobilePhone_Processors), solver);
		varsParentChildMobilePhone_Processors[2] = MobilePhone_GPU;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Processors, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_Processors, sumParentChildMobilePhone_Processors));
		SatFactory.addClauses(LogOp.implies(MobilePhone_RAM, MobilePhone_Hardware), solver);
		varsParentChildMobilePhone_Hardware[3] = MobilePhone_RAM;
		SatFactory.addClauses(LogOp.implies(MobilePhone_GPS, MobilePhone_Hardware), solver);
		varsParentChildMobilePhone_Hardware[4] = MobilePhone_GPS;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Hardware, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_Hardware, sumParentChildMobilePhone_Hardware));
		SatFactory.addClauses(LogOp.implies(MobilePhone_VideoCall, MobilePhone_MobilePhone), solver);
		varsParentChildMobilePhone_MobilePhone[1] = MobilePhone_VideoCall;
		SatFactory.addClauses(LogOp.implies(MobilePhone_TaskScheduler, MobilePhone_MobilePhone), solver);
		varsParentChildMobilePhone_MobilePhone[2] = MobilePhone_TaskScheduler;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Games, MobilePhone_MobilePhone), solver);
		varsParentChildMobilePhone_MobilePhone[3] = MobilePhone_Games;
		IntVar sumParentChildMobilePhone_Games = VariableFactory.fixed("sumParentChildMobilePhone_Games", 0, solver); 
		BoolVar[] varsParentChildMobilePhone_Games = new BoolVar[3];
		SatFactory.addClauses(LogOp.implies(MobilePhone_Chess, MobilePhone_Games), solver);
		varsParentChildMobilePhone_Games[0] = MobilePhone_Chess;
		SatFactory.addClauses(LogOp.implies(MobilePhone_CarRace3D, MobilePhone_Games), solver);
		varsParentChildMobilePhone_Games[1] = MobilePhone_CarRace3D;
		SatFactory.addClauses(LogOp.implies(MobilePhone_Tetris, MobilePhone_Games), solver);
		varsParentChildMobilePhone_Games[2] = MobilePhone_Tetris;
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_Games, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_Games, sumParentChildMobilePhone_Games));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(MobilePhone_MobilePhone, "=", 0), IntConstraintFactory.sum(varsParentChildMobilePhone_MobilePhone, sumParentChildMobilePhone_MobilePhone));
		
		SatFactory.addClauses(LogOp.implies(MobilePhone_CPU2, MobilePhone_TaskScheduler), solver);
		SatFactory.addClauses(LogOp.implies(MobilePhone_CarRace3D, MobilePhone_GPU), solver);
		
		
		//Chatterbox.showSolutions(solver);
		Chatterbox.showStatistics(solver);
		solver.findAllSolutions();
		long end = System.currentTimeMillis();
		System.out.println("Total time: " + (end - start));
	}
}

