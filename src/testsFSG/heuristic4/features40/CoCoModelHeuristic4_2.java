
package testsFSG.heuristic4.features40;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.chocosolver.solver.ResolutionPolicy;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.constraints.IntConstraintFactory;
import org.chocosolver.solver.constraints.LogicalConstraintFactory;
import org.chocosolver.solver.search.loop.monitors.SMF;
import org.chocosolver.solver.search.loop.monitors.SearchMonitorFactory;
import org.chocosolver.solver.search.strategy.IntStrategyFactory;
import org.chocosolver.solver.search.strategy.selectors.values.IntDomainMin;
import org.chocosolver.solver.search.strategy.strategy.IntStrategy;
import org.chocosolver.solver.trace.Chatterbox;
import org.chocosolver.solver.variables.BoolVar;
import org.chocosolver.solver.variables.IntVar;
import org.chocosolver.solver.variables.Variable;
import org.chocosolver.solver.variables.VariableFactory;

import searchStrategies.FMVarSelectorBiVarArithmetic;
import searchStrategies.FMVarSelectorMorePercInstVars;
import searchStrategies.FMVarSelectorOrAttr0;
import searchStrategies.FMVarSelectorOrAttr1;
import searchStrategies.Utilities;

public class CoCoModelHeuristic4_2 {
	public static void main(String[] args) {
		Solver solver = new Solver();
		
		//--------------------------------------------
		//Features
		//--------------------------------------------
		int contFeatures = 40;
			
		BoolVar root1_root = (BoolVar) VariableFactory.fixed("feature_root1_root", 1, solver);
		BoolVar root1_F1 = VariableFactory.bool("feature_root1_F1", solver);
		BoolVar root1_F3 = VariableFactory.bool("feature_root1_F3", solver);
		BoolVar root1_F4 = VariableFactory.bool("feature_root1_F4", solver);
		BoolVar root1_F14 = VariableFactory.bool("feature_root1_F14", solver);
		BoolVar root1_F15 = VariableFactory.bool("feature_root1_F15", solver);
		BoolVar root1_F19 = VariableFactory.bool("feature_root1_F19", solver);
		BoolVar root1_F16 = VariableFactory.bool("feature_root1_F16", solver);
		BoolVar root1_F17 = VariableFactory.bool("feature_root1_F17", solver);
		BoolVar root1_F18 = VariableFactory.bool("feature_root1_F18", solver);
		BoolVar root1_F5 = VariableFactory.bool("feature_root1_F5", solver);
		BoolVar root1_F12 = VariableFactory.bool("feature_root1_F12", solver);
		BoolVar root1_F13 = VariableFactory.bool("feature_root1_F13", solver);
		BoolVar root1_F6 = VariableFactory.bool("feature_root1_F6", solver);
		BoolVar root1_F7 = VariableFactory.bool("feature_root1_F7", solver);
		BoolVar root1_F8 = VariableFactory.bool("feature_root1_F8", solver);
		BoolVar root1_F9 = VariableFactory.bool("feature_root1_F9", solver);
		BoolVar root1_F20 = VariableFactory.bool("feature_root1_F20", solver);
		BoolVar root1_F21 = VariableFactory.bool("feature_root1_F21", solver);
		BoolVar root1_F22 = VariableFactory.bool("feature_root1_F22", solver);
		BoolVar root1_F23 = VariableFactory.bool("feature_root1_F23", solver);
		BoolVar root1_F24 = VariableFactory.bool("feature_root1_F24", solver);
		BoolVar root1_F25 = VariableFactory.bool("feature_root1_F25", solver);
		BoolVar root1_F26 = VariableFactory.bool("feature_root1_F26", solver);
		BoolVar root1_F27 = VariableFactory.bool("feature_root1_F27", solver);
		BoolVar root1_F30 = VariableFactory.bool("feature_root1_F30", solver);
		BoolVar root1_F31 = VariableFactory.bool("feature_root1_F31", solver);
		BoolVar root1_F32 = VariableFactory.bool("feature_root1_F32", solver);
		BoolVar root1_F33 = VariableFactory.bool("feature_root1_F33", solver);
		BoolVar root1_F34 = VariableFactory.bool("feature_root1_F34", solver);
		BoolVar root1_F35 = VariableFactory.bool("feature_root1_F35", solver);
		BoolVar root1_F36 = VariableFactory.bool("feature_root1_F36", solver);
		BoolVar root1_F37 = VariableFactory.bool("feature_root1_F37", solver);
		BoolVar root1_F38 = VariableFactory.bool("feature_root1_F38", solver);
		BoolVar root1_F39 = VariableFactory.bool("feature_root1_F39", solver);
		BoolVar root1_F28 = VariableFactory.bool("feature_root1_F28", solver);
		BoolVar root1_F29 = VariableFactory.bool("feature_root1_F29", solver);
		BoolVar root1_F10 = VariableFactory.bool("feature_root1_F10", solver);
		BoolVar root1_F11 = VariableFactory.bool("feature_root1_F11", solver);
		BoolVar root1_F2 = VariableFactory.bool("feature_root1_F2", solver);
		
		//--------------------------------------------
		//Feature Attributes
		//--------------------------------------------
		HashMap<String, IntVar> featureAttrAtribute1 = new HashMap<String, IntVar>();
		HashMap<String, IntVar> featureAttrAtribute0 = new HashMap<String, IntVar>();
		
		featureAttrAtribute1.put("root1_F3", VariableFactory.enumerated("root1_F3Atribute1", new int[]{0, 39}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F3, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F3"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F3, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F3"), "!=", 0));
		featureAttrAtribute0.put("root1_F3", VariableFactory.enumerated("root1_F3Atribute0", new int[]{0, 96}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F3, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F3"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F3, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F3"), "!=", 0));
		featureAttrAtribute1.put("root1_F14", VariableFactory.enumerated("root1_F14Atribute1", new int[]{0, 54}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F14, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F14"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F14, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F14"), "!=", 0));
		featureAttrAtribute0.put("root1_F14", VariableFactory.enumerated("root1_F14Atribute0", new int[]{0, 6}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F14, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F14"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F14, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F14"), "!=", 0));
		featureAttrAtribute1.put("root1_F19", VariableFactory.enumerated("root1_F19Atribute1", new int[]{0, 64}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F19, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F19"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F19, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F19"), "!=", 0));
		featureAttrAtribute0.put("root1_F19", VariableFactory.enumerated("root1_F19Atribute0", new int[]{0, 62}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F19, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F19"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F19, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F19"), "!=", 0));
		featureAttrAtribute1.put("root1_F16", VariableFactory.enumerated("root1_F16Atribute1", new int[]{0, 64}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F16, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F16"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F16, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F16"), "!=", 0));
		featureAttrAtribute0.put("root1_F16", VariableFactory.enumerated("root1_F16Atribute0", new int[]{0, 91}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F16, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F16"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F16, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F16"), "!=", 0));
		featureAttrAtribute1.put("root1_F17", VariableFactory.enumerated("root1_F17Atribute1", new int[]{0, 33}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F17, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F17"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F17, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F17"), "!=", 0));
		featureAttrAtribute0.put("root1_F17", VariableFactory.enumerated("root1_F17Atribute0", new int[]{0, 10}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F17, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F17"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F17, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F17"), "!=", 0));
		featureAttrAtribute1.put("root1_F18", VariableFactory.enumerated("root1_F18Atribute1", new int[]{0, 81}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F18, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F18"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F18, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F18"), "!=", 0));
		featureAttrAtribute0.put("root1_F18", VariableFactory.enumerated("root1_F18Atribute0", new int[]{0, 82}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F18, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F18"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F18, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F18"), "!=", 0));
		featureAttrAtribute1.put("root1_F12", VariableFactory.enumerated("root1_F12Atribute1", new int[]{0, 31}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F12, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F12"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F12, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F12"), "!=", 0));
		featureAttrAtribute0.put("root1_F12", VariableFactory.enumerated("root1_F12Atribute0", new int[]{0, 50}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F12, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F12"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F12, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F12"), "!=", 0));
		featureAttrAtribute1.put("root1_F13", VariableFactory.enumerated("root1_F13Atribute1", new int[]{0, 68}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F13, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F13"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F13, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F13"), "!=", 0));
		featureAttrAtribute0.put("root1_F13", VariableFactory.enumerated("root1_F13Atribute0", new int[]{0, 32}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F13, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F13"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F13, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F13"), "!=", 0));
		featureAttrAtribute1.put("root1_F6", VariableFactory.enumerated("root1_F6Atribute1", new int[]{0, 12}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F6, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F6"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F6, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F6"), "!=", 0));
		featureAttrAtribute0.put("root1_F6", VariableFactory.enumerated("root1_F6Atribute0", new int[]{0, 11}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F6, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F6"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F6, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F6"), "!=", 0));
		featureAttrAtribute1.put("root1_F7", VariableFactory.enumerated("root1_F7Atribute1", new int[]{0, 25}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F7, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F7"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F7, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F7"), "!=", 0));
		featureAttrAtribute0.put("root1_F7", VariableFactory.enumerated("root1_F7Atribute0", new int[]{0, 2}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F7, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F7"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F7, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F7"), "!=", 0));
		featureAttrAtribute1.put("root1_F8", VariableFactory.enumerated("root1_F8Atribute1", new int[]{0, 71}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F8, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F8"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F8, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F8"), "!=", 0));
		featureAttrAtribute0.put("root1_F8", VariableFactory.enumerated("root1_F8Atribute0", new int[]{0, 43}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F8, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F8"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F8, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F8"), "!=", 0));
		featureAttrAtribute1.put("root1_F20", VariableFactory.enumerated("root1_F20Atribute1", new int[]{0, 50}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F20, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F20"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F20, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F20"), "!=", 0));
		featureAttrAtribute0.put("root1_F20", VariableFactory.enumerated("root1_F20Atribute0", new int[]{0, 64}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F20, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F20"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F20, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F20"), "!=", 0));
		featureAttrAtribute1.put("root1_F21", VariableFactory.enumerated("root1_F21Atribute1", new int[]{0, 17}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F21, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F21"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F21, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F21"), "!=", 0));
		featureAttrAtribute0.put("root1_F21", VariableFactory.enumerated("root1_F21Atribute0", new int[]{0, 31}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F21, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F21"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F21, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F21"), "!=", 0));
		featureAttrAtribute1.put("root1_F22", VariableFactory.enumerated("root1_F22Atribute1", new int[]{0, 32}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F22, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F22"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F22, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F22"), "!=", 0));
		featureAttrAtribute0.put("root1_F22", VariableFactory.enumerated("root1_F22Atribute0", new int[]{0, 99}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F22, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F22"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F22, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F22"), "!=", 0));
		featureAttrAtribute1.put("root1_F23", VariableFactory.enumerated("root1_F23Atribute1", new int[]{0, 60}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F23, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F23"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F23, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F23"), "!=", 0));
		featureAttrAtribute0.put("root1_F23", VariableFactory.enumerated("root1_F23Atribute0", new int[]{0, 1}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F23, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F23"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F23, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F23"), "!=", 0));
		featureAttrAtribute1.put("root1_F24", VariableFactory.enumerated("root1_F24Atribute1", new int[]{0, 49}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F24, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F24"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F24, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F24"), "!=", 0));
		featureAttrAtribute0.put("root1_F24", VariableFactory.enumerated("root1_F24Atribute0", new int[]{0, 33}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F24, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F24"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F24, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F24"), "!=", 0));
		featureAttrAtribute1.put("root1_F25", VariableFactory.enumerated("root1_F25Atribute1", new int[]{0, 66}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F25, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F25"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F25, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F25"), "!=", 0));
		featureAttrAtribute0.put("root1_F25", VariableFactory.enumerated("root1_F25Atribute0", new int[]{0, 74}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F25, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F25"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F25, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F25"), "!=", 0));
		featureAttrAtribute1.put("root1_F26", VariableFactory.enumerated("root1_F26Atribute1", new int[]{0, 82}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F26, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F26"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F26, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F26"), "!=", 0));
		featureAttrAtribute0.put("root1_F26", VariableFactory.enumerated("root1_F26Atribute0", new int[]{0, 48}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F26, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F26"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F26, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F26"), "!=", 0));
		featureAttrAtribute1.put("root1_F30", VariableFactory.enumerated("root1_F30Atribute1", new int[]{0, 78}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F30, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F30"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F30, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F30"), "!=", 0));
		featureAttrAtribute0.put("root1_F30", VariableFactory.enumerated("root1_F30Atribute0", new int[]{0, 17}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F30, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F30"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F30, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F30"), "!=", 0));
		featureAttrAtribute1.put("root1_F31", VariableFactory.enumerated("root1_F31Atribute1", new int[]{0, 92}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F31, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F31"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F31, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F31"), "!=", 0));
		featureAttrAtribute0.put("root1_F31", VariableFactory.enumerated("root1_F31Atribute0", new int[]{0, 37}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F31, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F31"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F31, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F31"), "!=", 0));
		featureAttrAtribute1.put("root1_F32", VariableFactory.enumerated("root1_F32Atribute1", new int[]{0, 36}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F32, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F32"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F32, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F32"), "!=", 0));
		featureAttrAtribute0.put("root1_F32", VariableFactory.enumerated("root1_F32Atribute0", new int[]{0, 56}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F32, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F32"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F32, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F32"), "!=", 0));
		featureAttrAtribute1.put("root1_F33", VariableFactory.enumerated("root1_F33Atribute1", new int[]{0, 43}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F33, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F33"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F33, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F33"), "!=", 0));
		featureAttrAtribute0.put("root1_F33", VariableFactory.enumerated("root1_F33Atribute0", new int[]{0, 11}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F33, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F33"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F33, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F33"), "!=", 0));
		featureAttrAtribute1.put("root1_F34", VariableFactory.enumerated("root1_F34Atribute1", new int[]{0, 4}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F34, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F34"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F34, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F34"), "!=", 0));
		featureAttrAtribute0.put("root1_F34", VariableFactory.enumerated("root1_F34Atribute0", new int[]{0, 85}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F34, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F34"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F34, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F34"), "!=", 0));
		featureAttrAtribute1.put("root1_F35", VariableFactory.enumerated("root1_F35Atribute1", new int[]{0, 76}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F35, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F35"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F35, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F35"), "!=", 0));
		featureAttrAtribute0.put("root1_F35", VariableFactory.enumerated("root1_F35Atribute0", new int[]{0, 56}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F35, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F35"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F35, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F35"), "!=", 0));
		featureAttrAtribute1.put("root1_F36", VariableFactory.enumerated("root1_F36Atribute1", new int[]{0, 27}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F36, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F36"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F36, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F36"), "!=", 0));
		featureAttrAtribute0.put("root1_F36", VariableFactory.enumerated("root1_F36Atribute0", new int[]{0, 66}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F36, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F36"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F36, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F36"), "!=", 0));
		featureAttrAtribute1.put("root1_F37", VariableFactory.enumerated("root1_F37Atribute1", new int[]{0, 8}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F37, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F37"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F37, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F37"), "!=", 0));
		featureAttrAtribute0.put("root1_F37", VariableFactory.enumerated("root1_F37Atribute0", new int[]{0, 26}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F37, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F37"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F37, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F37"), "!=", 0));
		featureAttrAtribute1.put("root1_F38", VariableFactory.enumerated("root1_F38Atribute1", new int[]{0, 40}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F38, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F38"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F38, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F38"), "!=", 0));
		featureAttrAtribute0.put("root1_F38", VariableFactory.enumerated("root1_F38Atribute0", new int[]{0, 32}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F38, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F38"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F38, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F38"), "!=", 0));
		featureAttrAtribute1.put("root1_F39", VariableFactory.enumerated("root1_F39Atribute1", new int[]{0, 46}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F39, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F39"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F39, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F39"), "!=", 0));
		featureAttrAtribute0.put("root1_F39", VariableFactory.enumerated("root1_F39Atribute0", new int[]{0, 13}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F39, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F39"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F39, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F39"), "!=", 0));
		featureAttrAtribute1.put("root1_F28", VariableFactory.enumerated("root1_F28Atribute1", new int[]{0, 67}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F28, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F28"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F28, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F28"), "!=", 0));
		featureAttrAtribute0.put("root1_F28", VariableFactory.enumerated("root1_F28Atribute0", new int[]{0, 45}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F28, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F28"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F28, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F28"), "!=", 0));
		featureAttrAtribute1.put("root1_F29", VariableFactory.enumerated("root1_F29Atribute1", new int[]{0, 73}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F29, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F29"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F29, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F29"), "!=", 0));
		featureAttrAtribute0.put("root1_F29", VariableFactory.enumerated("root1_F29Atribute0", new int[]{0, 92}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F29, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F29"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F29, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F29"), "!=", 0));
		featureAttrAtribute1.put("root1_F10", VariableFactory.enumerated("root1_F10Atribute1", new int[]{0, 44}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F10, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F10"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F10, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F10"), "!=", 0));
		featureAttrAtribute0.put("root1_F10", VariableFactory.enumerated("root1_F10Atribute0", new int[]{0, 18}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F10, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F10"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F10, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F10"), "!=", 0));
		featureAttrAtribute1.put("root1_F11", VariableFactory.enumerated("root1_F11Atribute1", new int[]{0, 16}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F11, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F11"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F11, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F11"), "!=", 0));
		featureAttrAtribute0.put("root1_F11", VariableFactory.enumerated("root1_F11Atribute0", new int[]{0, 5}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F11, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F11"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F11, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F11"), "!=", 0));
		featureAttrAtribute1.put("root1_F2", VariableFactory.enumerated("root1_F2Atribute1", new int[]{0, 43}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F2, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F2, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F2"), "!=", 0));
		featureAttrAtribute0.put("root1_F2", VariableFactory.enumerated("root1_F2Atribute0", new int[]{0, 99}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F2, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F2, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F2"), "!=", 0));
		
		//--------------------------------------------
		//Tree Constraints
		//--------------------------------------------
		Constraint optionalroot1_root_root1_F1 = IntConstraintFactory.arithm(root1_F1, "<=", root1_root);
		optionalroot1_root_root1_F1.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_root_root1_F1);
		Constraint mandatoryroot1_F1_root1_F3 = IntConstraintFactory.arithm(root1_F1, "=", root1_F3);
		mandatoryroot1_F1_root1_F3.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F1_root1_F3);
		Constraint mandatoryroot1_F1_root1_F4 = IntConstraintFactory.arithm(root1_F1, "=", root1_F4);
		mandatoryroot1_F1_root1_F4.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F1_root1_F4);
		Constraint mandatoryroot1_F4_root1_F14 = IntConstraintFactory.arithm(root1_F4, "=", root1_F14);
		mandatoryroot1_F4_root1_F14.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F4_root1_F14);
		Constraint mandatoryroot1_F4_root1_F15 = IntConstraintFactory.arithm(root1_F4, "=", root1_F15);
		mandatoryroot1_F4_root1_F15.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F4_root1_F15);
		Constraint mandatoryroot1_F15_root1_F19 = IntConstraintFactory.arithm(root1_F15, "=", root1_F19);
		mandatoryroot1_F15_root1_F19.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F15_root1_F19);
		Constraint optionalroot1_F4_root1_F16 = IntConstraintFactory.arithm(root1_F16, "<=", root1_F4);
		optionalroot1_F4_root1_F16.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F4_root1_F16);
		Constraint optionalroot1_F4_root1_F17 = IntConstraintFactory.arithm(root1_F17, "<=", root1_F4);
		optionalroot1_F4_root1_F17.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F4_root1_F17);
		Constraint mandatoryroot1_F4_root1_F18 = IntConstraintFactory.arithm(root1_F4, "=", root1_F18);
		mandatoryroot1_F4_root1_F18.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F4_root1_F18);
		IntVar sumOrroot1_F1_2 = VariableFactory.enumerated("sumOrroot1_F1", 0, 2, solver); 
		BoolVar[] varsOrroot1_F1_2 = new BoolVar[2];
		varsOrroot1_F1_2[0] = root1_F5;
		varsOrroot1_F1_2[1] = root1_F6;
		solver.post(IntConstraintFactory.sum(varsOrroot1_F1_2, sumOrroot1_F1_2));
		Constraint or1root1_F1_2 = IntConstraintFactory.arithm(sumOrroot1_F1_2, ">=", 1);
		or1root1_F1_2.setName(Utilities.OR_TC);
		
		Constraint or0root1_F1_2 = IntConstraintFactory.arithm(sumOrroot1_F1_2, "=", 0);
		or0root1_F1_2.setName(Utilities.OR_TC);
		LogicalConstraintFactory.ifThenElse(root1_F1, or1root1_F1_2, or0root1_F1_2);
			
		Constraint mandatoryroot1_F5_root1_F12 = IntConstraintFactory.arithm(root1_F5, "=", root1_F12);
		mandatoryroot1_F5_root1_F12.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F5_root1_F12);
		Constraint mandatoryroot1_F5_root1_F13 = IntConstraintFactory.arithm(root1_F5, "=", root1_F13);
		mandatoryroot1_F5_root1_F13.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F5_root1_F13);
		Constraint mandatoryroot1_F1_root1_F7 = IntConstraintFactory.arithm(root1_F1, "=", root1_F7);
		mandatoryroot1_F1_root1_F7.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F1_root1_F7);
		Constraint mandatoryroot1_F1_root1_F8 = IntConstraintFactory.arithm(root1_F1, "=", root1_F8);
		mandatoryroot1_F1_root1_F8.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F1_root1_F8);
		Constraint mandatoryroot1_F1_root1_F9 = IntConstraintFactory.arithm(root1_F1, "=", root1_F9);
		mandatoryroot1_F1_root1_F9.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F1_root1_F9);
		Constraint mandatoryroot1_F9_root1_F20 = IntConstraintFactory.arithm(root1_F9, "=", root1_F20);
		mandatoryroot1_F9_root1_F20.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F9_root1_F20);
		Constraint mandatoryroot1_F9_root1_F21 = IntConstraintFactory.arithm(root1_F9, "=", root1_F21);
		mandatoryroot1_F9_root1_F21.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F9_root1_F21);
		Constraint mandatoryroot1_F9_root1_F22 = IntConstraintFactory.arithm(root1_F9, "=", root1_F22);
		mandatoryroot1_F9_root1_F22.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F9_root1_F22);
		IntVar sumOrroot1_F9_3 = VariableFactory.enumerated("sumOrroot1_F9", 0, 2, solver); 
		BoolVar[] varsOrroot1_F9_3 = new BoolVar[2];
		varsOrroot1_F9_3[0] = root1_F23;
		varsOrroot1_F9_3[1] = root1_F24;
		solver.post(IntConstraintFactory.sum(varsOrroot1_F9_3, sumOrroot1_F9_3));
		Constraint or1root1_F9_3 = IntConstraintFactory.arithm(sumOrroot1_F9_3, ">=", 1);
		or1root1_F9_3.setName(Utilities.OR_TC);
		
		Constraint or0root1_F9_3 = IntConstraintFactory.arithm(sumOrroot1_F9_3, "=", 0);
		or0root1_F9_3.setName(Utilities.OR_TC);
		LogicalConstraintFactory.ifThenElse(root1_F9, or1root1_F9_3, or0root1_F9_3);
			
		IntVar sumOrroot1_F9_4 = VariableFactory.enumerated("sumOrroot1_F9", 0, 2, solver); 
		BoolVar[] varsOrroot1_F9_4 = new BoolVar[2];
		varsOrroot1_F9_4[0] = root1_F25;
		varsOrroot1_F9_4[1] = root1_F26;
		solver.post(IntConstraintFactory.sum(varsOrroot1_F9_4, sumOrroot1_F9_4));
		Constraint or1root1_F9_4 = IntConstraintFactory.arithm(sumOrroot1_F9_4, ">=", 1);
		or1root1_F9_4.setName(Utilities.OR_TC);
		
		Constraint or0root1_F9_4 = IntConstraintFactory.arithm(sumOrroot1_F9_4, "=", 0);
		or0root1_F9_4.setName(Utilities.OR_TC);
		LogicalConstraintFactory.ifThenElse(root1_F9, or1root1_F9_4, or0root1_F9_4);
			
		Constraint mandatoryroot1_F9_root1_F27 = IntConstraintFactory.arithm(root1_F9, "=", root1_F27);
		mandatoryroot1_F9_root1_F27.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F9_root1_F27);
		Constraint optionalroot1_F27_root1_F30 = IntConstraintFactory.arithm(root1_F30, "<=", root1_F27);
		optionalroot1_F27_root1_F30.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F27_root1_F30);
		Constraint mandatoryroot1_F27_root1_F31 = IntConstraintFactory.arithm(root1_F27, "=", root1_F31);
		mandatoryroot1_F27_root1_F31.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F27_root1_F31);
		IntVar sumOrroot1_F27_2 = VariableFactory.enumerated("sumOrroot1_F27", 0, 3, solver); 
		BoolVar[] varsOrroot1_F27_2 = new BoolVar[3];
		varsOrroot1_F27_2[0] = root1_F32;
		varsOrroot1_F27_2[1] = root1_F33;
		varsOrroot1_F27_2[2] = root1_F34;
		solver.post(IntConstraintFactory.sum(varsOrroot1_F27_2, sumOrroot1_F27_2));
		Constraint or1root1_F27_2 = IntConstraintFactory.arithm(sumOrroot1_F27_2, ">=", 1);
		or1root1_F27_2.setName(Utilities.OR_TC);
		
		Constraint or0root1_F27_2 = IntConstraintFactory.arithm(sumOrroot1_F27_2, "=", 0);
		or0root1_F27_2.setName(Utilities.OR_TC);
		LogicalConstraintFactory.ifThenElse(root1_F27, or1root1_F27_2, or0root1_F27_2);
			
		Constraint mandatoryroot1_F27_root1_F35 = IntConstraintFactory.arithm(root1_F27, "=", root1_F35);
		mandatoryroot1_F27_root1_F35.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F27_root1_F35);
		Constraint mandatoryroot1_F27_root1_F36 = IntConstraintFactory.arithm(root1_F27, "=", root1_F36);
		mandatoryroot1_F27_root1_F36.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F27_root1_F36);
		Constraint mandatoryroot1_F27_root1_F37 = IntConstraintFactory.arithm(root1_F27, "=", root1_F37);
		mandatoryroot1_F27_root1_F37.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F27_root1_F37);
		Constraint mandatoryroot1_F27_root1_F38 = IntConstraintFactory.arithm(root1_F27, "=", root1_F38);
		mandatoryroot1_F27_root1_F38.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F27_root1_F38);
		Constraint mandatoryroot1_F27_root1_F39 = IntConstraintFactory.arithm(root1_F27, "=", root1_F39);
		mandatoryroot1_F27_root1_F39.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F27_root1_F39);
		Constraint mandatoryroot1_F9_root1_F28 = IntConstraintFactory.arithm(root1_F9, "=", root1_F28);
		mandatoryroot1_F9_root1_F28.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F9_root1_F28);
		Constraint mandatoryroot1_F9_root1_F29 = IntConstraintFactory.arithm(root1_F9, "=", root1_F29);
		mandatoryroot1_F9_root1_F29.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F9_root1_F29);
		Constraint mandatoryroot1_F1_root1_F10 = IntConstraintFactory.arithm(root1_F1, "=", root1_F10);
		mandatoryroot1_F1_root1_F10.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F1_root1_F10);
		Constraint mandatoryroot1_F1_root1_F11 = IntConstraintFactory.arithm(root1_F1, "=", root1_F11);
		mandatoryroot1_F1_root1_F11.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F1_root1_F11);
		Constraint mandatoryroot1_root_root1_F2 = IntConstraintFactory.arithm(root1_root, "=", root1_F2);
		mandatoryroot1_root_root1_F2.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_root_root1_F2);
		
		//--------------------------------------------
		//Cross-Tree Constraints
		//--------------------------------------------
		Constraint requiresroot1_F14_root1_F7 = IntConstraintFactory.arithm(root1_F14, "<=", root1_F7);
		requiresroot1_F14_root1_F7.setName(Utilities.REQUIRES_CTC);
		solver.post(requiresroot1_F14_root1_F7);
		Constraint excludesroot1_F13_root1_F13 = IntConstraintFactory.arithm(root1_F13, "+", root1_F19, "<=", 1);
		excludesroot1_F13_root1_F13.setName(Utilities.EXCLUDES_CTC);
		solver.post(excludesroot1_F13_root1_F13);
		Constraint excludesroot1_F25_root1_F25 = IntConstraintFactory.arithm(root1_F25, "+", root1_F12, "<=", 1);
		excludesroot1_F25_root1_F25.setName(Utilities.EXCLUDES_CTC);
		solver.post(excludesroot1_F25_root1_F25);
		Constraint requiresroot1_F38_root1_F30 = IntConstraintFactory.arithm(root1_F38, "<=", root1_F30);
		requiresroot1_F38_root1_F30.setName(Utilities.REQUIRES_CTC);
		solver.post(requiresroot1_F38_root1_F30);
		
		//--------------------------------------------
		//Cross-Model Constraints
		//--------------------------------------------
		
		//--------------------------------------------
		//Solve
		//--------------------------------------------
		long start = System.currentTimeMillis();
		System.out.println("Started at: " + start);
		
		List<IntVar> varsAtribute0List = new ArrayList<IntVar>(featureAttrAtribute0.values());
		IntVar[] varsAtribute0 = new IntVar[featureAttrAtribute0.values().size()];
			
		for(int i = 0; i < varsAtribute0List.size(); i++) {
		varsAtribute0[i] = varsAtribute0List.get(i);
		}
		
		List<IntVar> varsAtribute1List = new ArrayList<IntVar>(featureAttrAtribute1.values());
		IntVar[] varsAtribute1 = new IntVar[featureAttrAtribute1.values().size()];
			
		for(int i = 0; i < varsAtribute1List.size(); i++) {
		varsAtribute1[i] = VariableFactory.minus(varsAtribute1List.get(i));
		}
		
		IntVar totalAtribute0 = VariableFactory.bounded("totalAtribute0", 0, 1000000, solver);
		solver.post(IntConstraintFactory.sum(varsAtribute0, totalAtribute0));
		IntVar totalAtribute1 = VariableFactory.bounded("totalAtribute1", -1000000, 0, solver);
		solver.post(IntConstraintFactory.sum(varsAtribute1, totalAtribute1));
		
		IntVar[] featureVars = getFeatureVars(solver, contFeatures);
		IntVar[] attributeVars = getAttributeVars(solver);
		IntVar[] totalVars = new IntVar[2];
		totalVars[0] = totalAtribute0;
		totalVars[1] = totalAtribute1;
		
		IntStrategy strategy1 = IntStrategyFactory.custom(new FMVarSelectorOrAttr0(), IntStrategyFactory.max_value_selector(), featureVars);
		IntStrategy strategy2 = IntStrategyFactory.custom(new FMVarSelectorOrAttr1(), IntStrategyFactory.max_value_selector(), featureVars);
		IntStrategy strategy3 = IntStrategyFactory.custom(IntStrategyFactory.minDomainSize_var_selector(), new IntDomainMin(), attributeVars);
		IntStrategy strategy4 = IntStrategyFactory.custom(IntStrategyFactory.minDomainSize_var_selector(), new IntDomainMin(), totalVars);
		solver.set(IntStrategyFactory.sequencer(strategy1, strategy2, IntStrategyFactory.domOverWDeg(featureVars, 1)), strategy3, strategy4);
		
		SearchMonitorFactory.limitSolution(solver, 1000);
		//Chatterbox.showSolutions(solver);
		solver.findParetoFront(ResolutionPolicy.MINIMIZE, totalAtribute0, totalAtribute1);
		Chatterbox.printStatistics(solver);
		
		
		long end = System.currentTimeMillis();
		System.out.println("Ended at: " + end);
		System.out.println("Total time: " + (end - start));
	}
	
	private static IntVar[] getFeatureVars(Solver solver, int contFeatures){
		IntVar[] featureVars = new IntVar[contFeatures];
		Variable[] varsSolver = solver.getVars();
		int index = 0;
		for(int i = 0; i < varsSolver.length; i++) {
			Variable current = varsSolver[i];
			if(current.getName().startsWith("feature_")) {
				featureVars[index] = (IntVar) current;
				index++;
			}
		}
		
		return featureVars;
	}
	
	private static IntVar[] getAttributeVars(Solver solver){
		IntVar[] attributeVars;
		List<IntVar> vars = new ArrayList<IntVar>();
		Variable[] varsSolver = solver.getVars();
		
		for(int i = 0; i < varsSolver.length; i++) {
			Variable current = varsSolver[i];
			if(current.getName().startsWith("root")) {
				vars.add((IntVar) current);
			}
		}
		
		attributeVars = vars.toArray(new IntVar[vars.size()]);
		return attributeVars;
	}
}