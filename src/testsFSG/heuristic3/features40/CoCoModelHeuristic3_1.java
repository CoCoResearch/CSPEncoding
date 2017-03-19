
package testsFSG.heuristic3.features40;

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

public class CoCoModelHeuristic3_1 {
	public static void main(String[] args) {
		Solver solver = new Solver();
		
		//--------------------------------------------
		//Features
		//--------------------------------------------
		int contFeatures = 40;
			
		BoolVar root1_root = (BoolVar) VariableFactory.fixed("feature_root1_root", 1, solver);
		BoolVar root1_F1 = VariableFactory.bool("feature_root1_F1", solver);
		BoolVar root1_F12 = VariableFactory.bool("feature_root1_F12", solver);
		BoolVar root1_F13 = VariableFactory.bool("feature_root1_F13", solver);
		BoolVar root1_F20 = VariableFactory.bool("feature_root1_F20", solver);
		BoolVar root1_F21 = VariableFactory.bool("feature_root1_F21", solver);
		BoolVar root1_F22 = VariableFactory.bool("feature_root1_F22", solver);
		BoolVar root1_F23 = VariableFactory.bool("feature_root1_F23", solver);
		BoolVar root1_F24 = VariableFactory.bool("feature_root1_F24", solver);
		BoolVar root1_F25 = VariableFactory.bool("feature_root1_F25", solver);
		BoolVar root1_F26 = VariableFactory.bool("feature_root1_F26", solver);
		BoolVar root1_F27 = VariableFactory.bool("feature_root1_F27", solver);
		BoolVar root1_F28 = VariableFactory.bool("feature_root1_F28", solver);
		BoolVar root1_F29 = VariableFactory.bool("feature_root1_F29", solver);
		BoolVar root1_F14 = VariableFactory.bool("feature_root1_F14", solver);
		BoolVar root1_F15 = VariableFactory.bool("feature_root1_F15", solver);
		BoolVar root1_F16 = VariableFactory.bool("feature_root1_F16", solver);
		BoolVar root1_F17 = VariableFactory.bool("feature_root1_F17", solver);
		BoolVar root1_F18 = VariableFactory.bool("feature_root1_F18", solver);
		BoolVar root1_F19 = VariableFactory.bool("feature_root1_F19", solver);
		BoolVar root1_F2 = VariableFactory.bool("feature_root1_F2", solver);
		BoolVar root1_F3 = VariableFactory.bool("feature_root1_F3", solver);
		BoolVar root1_F7 = VariableFactory.bool("feature_root1_F7", solver);
		BoolVar root1_F8 = VariableFactory.bool("feature_root1_F8", solver);
		BoolVar root1_F9 = VariableFactory.bool("feature_root1_F9", solver);
		BoolVar root1_F30 = VariableFactory.bool("feature_root1_F30", solver);
		BoolVar root1_F31 = VariableFactory.bool("feature_root1_F31", solver);
		BoolVar root1_F32 = VariableFactory.bool("feature_root1_F32", solver);
		BoolVar root1_F33 = VariableFactory.bool("feature_root1_F33", solver);
		BoolVar root1_F39 = VariableFactory.bool("feature_root1_F39", solver);
		BoolVar root1_F34 = VariableFactory.bool("feature_root1_F34", solver);
		BoolVar root1_F35 = VariableFactory.bool("feature_root1_F35", solver);
		BoolVar root1_F36 = VariableFactory.bool("feature_root1_F36", solver);
		BoolVar root1_F37 = VariableFactory.bool("feature_root1_F37", solver);
		BoolVar root1_F38 = VariableFactory.bool("feature_root1_F38", solver);
		BoolVar root1_F10 = VariableFactory.bool("feature_root1_F10", solver);
		BoolVar root1_F11 = VariableFactory.bool("feature_root1_F11", solver);
		BoolVar root1_F4 = VariableFactory.bool("feature_root1_F4", solver);
		BoolVar root1_F5 = VariableFactory.bool("feature_root1_F5", solver);
		BoolVar root1_F6 = VariableFactory.bool("feature_root1_F6", solver);
		
		//--------------------------------------------
		//Feature Attributes
		//--------------------------------------------
		HashMap<String, IntVar> featureAttrAtribute1 = new HashMap<String, IntVar>();
		HashMap<String, IntVar> featureAttrAtribute0 = new HashMap<String, IntVar>();
		
		featureAttrAtribute1.put("root1_F12", VariableFactory.enumerated("root1_F12Atribute1", new int[]{0, 89}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F12, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F12"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F12, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F12"), "!=", 0));
		featureAttrAtribute0.put("root1_F12", VariableFactory.enumerated("root1_F12Atribute0", new int[]{0, 68}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F12, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F12"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F12, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F12"), "!=", 0));
		featureAttrAtribute1.put("root1_F20", VariableFactory.enumerated("root1_F20Atribute1", new int[]{0, 76}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F20, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F20"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F20, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F20"), "!=", 0));
		featureAttrAtribute0.put("root1_F20", VariableFactory.enumerated("root1_F20Atribute0", new int[]{0, 21}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F20, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F20"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F20, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F20"), "!=", 0));
		featureAttrAtribute1.put("root1_F21", VariableFactory.enumerated("root1_F21Atribute1", new int[]{0, 39}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F21, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F21"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F21, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F21"), "!=", 0));
		featureAttrAtribute0.put("root1_F21", VariableFactory.enumerated("root1_F21Atribute0", new int[]{0, 15}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F21, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F21"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F21, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F21"), "!=", 0));
		featureAttrAtribute1.put("root1_F22", VariableFactory.enumerated("root1_F22Atribute1", new int[]{0, 96}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F22, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F22"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F22, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F22"), "!=", 0));
		featureAttrAtribute0.put("root1_F22", VariableFactory.enumerated("root1_F22Atribute0", new int[]{0, 54}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F22, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F22"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F22, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F22"), "!=", 0));
		featureAttrAtribute1.put("root1_F23", VariableFactory.enumerated("root1_F23Atribute1", new int[]{0, 32}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F23, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F23"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F23, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F23"), "!=", 0));
		featureAttrAtribute0.put("root1_F23", VariableFactory.enumerated("root1_F23Atribute0", new int[]{0, 64}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F23, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F23"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F23, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F23"), "!=", 0));
		featureAttrAtribute1.put("root1_F24", VariableFactory.enumerated("root1_F24Atribute1", new int[]{0, 26}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F24, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F24"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F24, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F24"), "!=", 0));
		featureAttrAtribute0.put("root1_F24", VariableFactory.enumerated("root1_F24Atribute0", new int[]{0, 10}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F24, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F24"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F24, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F24"), "!=", 0));
		featureAttrAtribute1.put("root1_F25", VariableFactory.enumerated("root1_F25Atribute1", new int[]{0, 72}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F25, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F25"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F25, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F25"), "!=", 0));
		featureAttrAtribute0.put("root1_F25", VariableFactory.enumerated("root1_F25Atribute0", new int[]{0, 95}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F25, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F25"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F25, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F25"), "!=", 0));
		featureAttrAtribute1.put("root1_F26", VariableFactory.enumerated("root1_F26Atribute1", new int[]{0, 90}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F26, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F26"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F26, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F26"), "!=", 0));
		featureAttrAtribute0.put("root1_F26", VariableFactory.enumerated("root1_F26Atribute0", new int[]{0, 57}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F26, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F26"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F26, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F26"), "!=", 0));
		featureAttrAtribute1.put("root1_F27", VariableFactory.enumerated("root1_F27Atribute1", new int[]{0, 98}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F27, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F27"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F27, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F27"), "!=", 0));
		featureAttrAtribute0.put("root1_F27", VariableFactory.enumerated("root1_F27Atribute0", new int[]{0, 96}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F27, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F27"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F27, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F27"), "!=", 0));
		featureAttrAtribute1.put("root1_F28", VariableFactory.enumerated("root1_F28Atribute1", new int[]{0, 38}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F28, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F28"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F28, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F28"), "!=", 0));
		featureAttrAtribute0.put("root1_F28", VariableFactory.enumerated("root1_F28Atribute0", new int[]{0, 10}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F28, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F28"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F28, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F28"), "!=", 0));
		featureAttrAtribute1.put("root1_F29", VariableFactory.enumerated("root1_F29Atribute1", new int[]{0, 73}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F29, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F29"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F29, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F29"), "!=", 0));
		featureAttrAtribute0.put("root1_F29", VariableFactory.enumerated("root1_F29Atribute0", new int[]{0, 50}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F29, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F29"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F29, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F29"), "!=", 0));
		featureAttrAtribute1.put("root1_F14", VariableFactory.enumerated("root1_F14Atribute1", new int[]{0, 17}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F14, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F14"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F14, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F14"), "!=", 0));
		featureAttrAtribute0.put("root1_F14", VariableFactory.enumerated("root1_F14Atribute0", new int[]{0, 84}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F14, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F14"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F14, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F14"), "!=", 0));
		featureAttrAtribute1.put("root1_F15", VariableFactory.enumerated("root1_F15Atribute1", new int[]{0, 68}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F15, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F15"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F15, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F15"), "!=", 0));
		featureAttrAtribute0.put("root1_F15", VariableFactory.enumerated("root1_F15Atribute0", new int[]{0, 63}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F15, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F15"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F15, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F15"), "!=", 0));
		featureAttrAtribute1.put("root1_F16", VariableFactory.enumerated("root1_F16Atribute1", new int[]{0, 36}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F16, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F16"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F16, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F16"), "!=", 0));
		featureAttrAtribute0.put("root1_F16", VariableFactory.enumerated("root1_F16Atribute0", new int[]{0, 86}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F16, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F16"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F16, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F16"), "!=", 0));
		featureAttrAtribute1.put("root1_F17", VariableFactory.enumerated("root1_F17Atribute1", new int[]{0, 90}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F17, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F17"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F17, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F17"), "!=", 0));
		featureAttrAtribute0.put("root1_F17", VariableFactory.enumerated("root1_F17Atribute0", new int[]{0, 36}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F17, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F17"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F17, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F17"), "!=", 0));
		featureAttrAtribute1.put("root1_F18", VariableFactory.enumerated("root1_F18Atribute1", new int[]{0, 21}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F18, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F18"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F18, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F18"), "!=", 0));
		featureAttrAtribute0.put("root1_F18", VariableFactory.enumerated("root1_F18Atribute0", new int[]{0, 34}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F18, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F18"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F18, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F18"), "!=", 0));
		featureAttrAtribute1.put("root1_F19", VariableFactory.enumerated("root1_F19Atribute1", new int[]{0, 28}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F19, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F19"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F19, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F19"), "!=", 0));
		featureAttrAtribute0.put("root1_F19", VariableFactory.enumerated("root1_F19Atribute0", new int[]{0, 57}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F19, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F19"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F19, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F19"), "!=", 0));
		featureAttrAtribute1.put("root1_F2", VariableFactory.enumerated("root1_F2Atribute1", new int[]{0, 37}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F2, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F2, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F2"), "!=", 0));
		featureAttrAtribute0.put("root1_F2", VariableFactory.enumerated("root1_F2Atribute0", new int[]{0, 15}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F2, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F2"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F2, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F2"), "!=", 0));
		featureAttrAtribute1.put("root1_F7", VariableFactory.enumerated("root1_F7Atribute1", new int[]{0, 28}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F7, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F7"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F7, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F7"), "!=", 0));
		featureAttrAtribute0.put("root1_F7", VariableFactory.enumerated("root1_F7Atribute0", new int[]{0, 76}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F7, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F7"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F7, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F7"), "!=", 0));
		featureAttrAtribute1.put("root1_F8", VariableFactory.enumerated("root1_F8Atribute1", new int[]{0, 77}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F8, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F8"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F8, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F8"), "!=", 0));
		featureAttrAtribute0.put("root1_F8", VariableFactory.enumerated("root1_F8Atribute0", new int[]{0, 96}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F8, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F8"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F8, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F8"), "!=", 0));
		featureAttrAtribute1.put("root1_F30", VariableFactory.enumerated("root1_F30Atribute1", new int[]{0, 90}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F30, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F30"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F30, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F30"), "!=", 0));
		featureAttrAtribute0.put("root1_F30", VariableFactory.enumerated("root1_F30Atribute0", new int[]{0, 55}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F30, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F30"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F30, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F30"), "!=", 0));
		featureAttrAtribute1.put("root1_F31", VariableFactory.enumerated("root1_F31Atribute1", new int[]{0, 17}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F31, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F31"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F31, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F31"), "!=", 0));
		featureAttrAtribute0.put("root1_F31", VariableFactory.enumerated("root1_F31Atribute0", new int[]{0, 64}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F31, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F31"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F31, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F31"), "!=", 0));
		featureAttrAtribute1.put("root1_F32", VariableFactory.enumerated("root1_F32Atribute1", new int[]{0, 67}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F32, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F32"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F32, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F32"), "!=", 0));
		featureAttrAtribute0.put("root1_F32", VariableFactory.enumerated("root1_F32Atribute0", new int[]{0, 64}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F32, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F32"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F32, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F32"), "!=", 0));
		featureAttrAtribute1.put("root1_F39", VariableFactory.enumerated("root1_F39Atribute1", new int[]{0, 83}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F39, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F39"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F39, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F39"), "!=", 0));
		featureAttrAtribute0.put("root1_F39", VariableFactory.enumerated("root1_F39Atribute0", new int[]{0, 61}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F39, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F39"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F39, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F39"), "!=", 0));
		featureAttrAtribute1.put("root1_F34", VariableFactory.enumerated("root1_F34Atribute1", new int[]{0, 17}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F34, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F34"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F34, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F34"), "!=", 0));
		featureAttrAtribute0.put("root1_F34", VariableFactory.enumerated("root1_F34Atribute0", new int[]{0, 28}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F34, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F34"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F34, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F34"), "!=", 0));
		featureAttrAtribute1.put("root1_F35", VariableFactory.enumerated("root1_F35Atribute1", new int[]{0, 48}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F35, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F35"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F35, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F35"), "!=", 0));
		featureAttrAtribute0.put("root1_F35", VariableFactory.enumerated("root1_F35Atribute0", new int[]{0, 70}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F35, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F35"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F35, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F35"), "!=", 0));
		featureAttrAtribute1.put("root1_F36", VariableFactory.enumerated("root1_F36Atribute1", new int[]{0, 39}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F36, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F36"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F36, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F36"), "!=", 0));
		featureAttrAtribute0.put("root1_F36", VariableFactory.enumerated("root1_F36Atribute0", new int[]{0, 97}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F36, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F36"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F36, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F36"), "!=", 0));
		featureAttrAtribute1.put("root1_F37", VariableFactory.enumerated("root1_F37Atribute1", new int[]{0, 48}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F37, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F37"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F37, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F37"), "!=", 0));
		featureAttrAtribute0.put("root1_F37", VariableFactory.enumerated("root1_F37Atribute0", new int[]{0, 62}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F37, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F37"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F37, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F37"), "!=", 0));
		featureAttrAtribute1.put("root1_F38", VariableFactory.enumerated("root1_F38Atribute1", new int[]{0, 28}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F38, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F38"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F38, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F38"), "!=", 0));
		featureAttrAtribute0.put("root1_F38", VariableFactory.enumerated("root1_F38Atribute0", new int[]{0, 96}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F38, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F38"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F38, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F38"), "!=", 0));
		featureAttrAtribute1.put("root1_F10", VariableFactory.enumerated("root1_F10Atribute1", new int[]{0, 98}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F10, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F10"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F10, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F10"), "!=", 0));
		featureAttrAtribute0.put("root1_F10", VariableFactory.enumerated("root1_F10Atribute0", new int[]{0, 81}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F10, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F10"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F10, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F10"), "!=", 0));
		featureAttrAtribute1.put("root1_F11", VariableFactory.enumerated("root1_F11Atribute1", new int[]{0, 52}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F11, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F11"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F11, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F11"), "!=", 0));
		featureAttrAtribute0.put("root1_F11", VariableFactory.enumerated("root1_F11Atribute0", new int[]{0, 41}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F11, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F11"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F11, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F11"), "!=", 0));
		featureAttrAtribute1.put("root1_F4", VariableFactory.enumerated("root1_F4Atribute1", new int[]{0, 42}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F4, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F4"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F4, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F4"), "!=", 0));
		featureAttrAtribute0.put("root1_F4", VariableFactory.enumerated("root1_F4Atribute0", new int[]{0, 12}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F4, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F4"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F4, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F4"), "!=", 0));
		featureAttrAtribute1.put("root1_F5", VariableFactory.enumerated("root1_F5Atribute1", new int[]{0, 67}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F5, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F5"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F5, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F5"), "!=", 0));
		featureAttrAtribute0.put("root1_F5", VariableFactory.enumerated("root1_F5Atribute0", new int[]{0, 25}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F5, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F5"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F5, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F5"), "!=", 0));
		featureAttrAtribute1.put("root1_F6", VariableFactory.enumerated("root1_F6Atribute1", new int[]{0, 74}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F6, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F6"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F6, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute1.get("root1_F6"), "!=", 0));
		featureAttrAtribute0.put("root1_F6", VariableFactory.enumerated("root1_F6Atribute0", new int[]{0, 43}, solver));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F6, "=", 0), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F6"), "=", 0));
		LogicalConstraintFactory.ifThen(IntConstraintFactory.arithm(root1_F6, "=", 1), IntConstraintFactory.arithm(featureAttrAtribute0.get("root1_F6"), "!=", 0));
		
		//--------------------------------------------
		//Tree Constraints
		//--------------------------------------------
		Constraint mandatoryroot1_root_root1_F1 = IntConstraintFactory.arithm(root1_root, "=", root1_F1);
		mandatoryroot1_root_root1_F1.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_root_root1_F1);
		Constraint optionalroot1_F1_root1_F12 = IntConstraintFactory.arithm(root1_F12, "<=", root1_F1);
		optionalroot1_F1_root1_F12.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F1_root1_F12);
		Constraint optionalroot1_F1_root1_F13 = IntConstraintFactory.arithm(root1_F13, "<=", root1_F1);
		optionalroot1_F1_root1_F13.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F1_root1_F13);
		Constraint mandatoryroot1_F13_root1_F20 = IntConstraintFactory.arithm(root1_F13, "=", root1_F20);
		mandatoryroot1_F13_root1_F20.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F13_root1_F20);
		Constraint mandatoryroot1_F13_root1_F21 = IntConstraintFactory.arithm(root1_F13, "=", root1_F21);
		mandatoryroot1_F13_root1_F21.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F13_root1_F21);
		Constraint mandatoryroot1_F13_root1_F22 = IntConstraintFactory.arithm(root1_F13, "=", root1_F22);
		mandatoryroot1_F13_root1_F22.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F13_root1_F22);
		Constraint optionalroot1_F13_root1_F23 = IntConstraintFactory.arithm(root1_F23, "<=", root1_F13);
		optionalroot1_F13_root1_F23.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F13_root1_F23);
		Constraint optionalroot1_F13_root1_F24 = IntConstraintFactory.arithm(root1_F24, "<=", root1_F13);
		optionalroot1_F13_root1_F24.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F13_root1_F24);
		IntVar sumOrroot1_F13_5 = VariableFactory.enumerated("sumOrroot1_F13", 0, 3, solver); 
		BoolVar[] varsOrroot1_F13_5 = new BoolVar[3];
		varsOrroot1_F13_5[0] = root1_F25;
		varsOrroot1_F13_5[1] = root1_F26;
		varsOrroot1_F13_5[2] = root1_F27;
		solver.post(IntConstraintFactory.sum(varsOrroot1_F13_5, sumOrroot1_F13_5));
		Constraint or1root1_F13_5 = IntConstraintFactory.arithm(sumOrroot1_F13_5, ">=", 1);
		or1root1_F13_5.setName(Utilities.OR_TC);
		
		Constraint or0root1_F13_5 = IntConstraintFactory.arithm(sumOrroot1_F13_5, "=", 0);
		or0root1_F13_5.setName(Utilities.OR_TC);
		LogicalConstraintFactory.ifThenElse(root1_F13, or1root1_F13_5, or0root1_F13_5);
			
		Constraint mandatoryroot1_F13_root1_F28 = IntConstraintFactory.arithm(root1_F13, "=", root1_F28);
		mandatoryroot1_F13_root1_F28.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F13_root1_F28);
		Constraint mandatoryroot1_F13_root1_F29 = IntConstraintFactory.arithm(root1_F13, "=", root1_F29);
		mandatoryroot1_F13_root1_F29.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F13_root1_F29);
		Constraint optionalroot1_F1_root1_F14 = IntConstraintFactory.arithm(root1_F14, "<=", root1_F1);
		optionalroot1_F1_root1_F14.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F1_root1_F14);
		Constraint mandatoryroot1_F1_root1_F15 = IntConstraintFactory.arithm(root1_F1, "=", root1_F15);
		mandatoryroot1_F1_root1_F15.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F1_root1_F15);
		Constraint optionalroot1_F1_root1_F16 = IntConstraintFactory.arithm(root1_F16, "<=", root1_F1);
		optionalroot1_F1_root1_F16.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F1_root1_F16);
		Constraint optionalroot1_F1_root1_F17 = IntConstraintFactory.arithm(root1_F17, "<=", root1_F1);
		optionalroot1_F1_root1_F17.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F1_root1_F17);
		Constraint mandatoryroot1_F1_root1_F18 = IntConstraintFactory.arithm(root1_F1, "=", root1_F18);
		mandatoryroot1_F1_root1_F18.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F1_root1_F18);
		Constraint mandatoryroot1_F1_root1_F19 = IntConstraintFactory.arithm(root1_F1, "=", root1_F19);
		mandatoryroot1_F1_root1_F19.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F1_root1_F19);
		Constraint mandatoryroot1_root_root1_F2 = IntConstraintFactory.arithm(root1_root, "=", root1_F2);
		mandatoryroot1_root_root1_F2.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_root_root1_F2);
		Constraint mandatoryroot1_root_root1_F3 = IntConstraintFactory.arithm(root1_root, "=", root1_F3);
		mandatoryroot1_root_root1_F3.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_root_root1_F3);
		Constraint mandatoryroot1_F3_root1_F7 = IntConstraintFactory.arithm(root1_F3, "=", root1_F7);
		mandatoryroot1_F3_root1_F7.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F3_root1_F7);
		Constraint optionalroot1_F3_root1_F8 = IntConstraintFactory.arithm(root1_F8, "<=", root1_F3);
		optionalroot1_F3_root1_F8.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F3_root1_F8);
		Constraint mandatoryroot1_F3_root1_F9 = IntConstraintFactory.arithm(root1_F3, "=", root1_F9);
		mandatoryroot1_F3_root1_F9.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F3_root1_F9);
		Constraint optionalroot1_F9_root1_F30 = IntConstraintFactory.arithm(root1_F30, "<=", root1_F9);
		optionalroot1_F9_root1_F30.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F9_root1_F30);
		Constraint optionalroot1_F9_root1_F31 = IntConstraintFactory.arithm(root1_F31, "<=", root1_F9);
		optionalroot1_F9_root1_F31.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F9_root1_F31);
		Constraint optionalroot1_F9_root1_F32 = IntConstraintFactory.arithm(root1_F32, "<=", root1_F9);
		optionalroot1_F9_root1_F32.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F9_root1_F32);
		Constraint optionalroot1_F9_root1_F33 = IntConstraintFactory.arithm(root1_F33, "<=", root1_F9);
		optionalroot1_F9_root1_F33.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F9_root1_F33);
		Constraint optionalroot1_F33_root1_F39 = IntConstraintFactory.arithm(root1_F39, "<=", root1_F33);
		optionalroot1_F33_root1_F39.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F33_root1_F39);
		Constraint optionalroot1_F9_root1_F34 = IntConstraintFactory.arithm(root1_F34, "<=", root1_F9);
		optionalroot1_F9_root1_F34.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F9_root1_F34);
		IntVar sumOrroot1_F9_5 = VariableFactory.enumerated("sumOrroot1_F9", 0, 2, solver); 
		BoolVar[] varsOrroot1_F9_5 = new BoolVar[2];
		varsOrroot1_F9_5[0] = root1_F35;
		varsOrroot1_F9_5[1] = root1_F36;
		solver.post(IntConstraintFactory.sum(varsOrroot1_F9_5, sumOrroot1_F9_5));
		Constraint or1root1_F9_5 = IntConstraintFactory.arithm(sumOrroot1_F9_5, ">=", 1);
		or1root1_F9_5.setName(Utilities.OR_TC);
		
		Constraint or0root1_F9_5 = IntConstraintFactory.arithm(sumOrroot1_F9_5, "=", 0);
		or0root1_F9_5.setName(Utilities.OR_TC);
		LogicalConstraintFactory.ifThenElse(root1_F9, or1root1_F9_5, or0root1_F9_5);
			
		Constraint mandatoryroot1_F9_root1_F37 = IntConstraintFactory.arithm(root1_F9, "=", root1_F37);
		mandatoryroot1_F9_root1_F37.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F9_root1_F37);
		Constraint mandatoryroot1_F9_root1_F38 = IntConstraintFactory.arithm(root1_F9, "=", root1_F38);
		mandatoryroot1_F9_root1_F38.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_F9_root1_F38);
		Constraint optionalroot1_F3_root1_F10 = IntConstraintFactory.arithm(root1_F10, "<=", root1_F3);
		optionalroot1_F3_root1_F10.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F3_root1_F10);
		Constraint optionalroot1_F3_root1_F11 = IntConstraintFactory.arithm(root1_F11, "<=", root1_F3);
		optionalroot1_F3_root1_F11.setName(Utilities.OPTIONAL_TC);
		solver.post(optionalroot1_F3_root1_F11);
		Constraint mandatoryroot1_root_root1_F4 = IntConstraintFactory.arithm(root1_root, "=", root1_F4);
		mandatoryroot1_root_root1_F4.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_root_root1_F4);
		Constraint mandatoryroot1_root_root1_F5 = IntConstraintFactory.arithm(root1_root, "=", root1_F5);
		mandatoryroot1_root_root1_F5.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_root_root1_F5);
		Constraint mandatoryroot1_root_root1_F6 = IntConstraintFactory.arithm(root1_root, "=", root1_F6);
		mandatoryroot1_root_root1_F6.setName(Utilities.MANDATORY_TC);
		solver.post(mandatoryroot1_root_root1_F6);
		
		//--------------------------------------------
		//Cross-Tree Constraints
		//--------------------------------------------
		Constraint excludesroot1_F20_root1_F20 = IntConstraintFactory.arithm(root1_F20, "+", root1_F34, "<=", 1);
		excludesroot1_F20_root1_F20.setName(Utilities.EXCLUDES_CTC);
		solver.post(excludesroot1_F20_root1_F20);
		Constraint excludesroot1_F27_root1_F27 = IntConstraintFactory.arithm(root1_F27, "+", root1_F30, "<=", 1);
		excludesroot1_F27_root1_F27.setName(Utilities.EXCLUDES_CTC);
		solver.post(excludesroot1_F27_root1_F27);
		Constraint requiresroot1_F27_root1_F34 = IntConstraintFactory.arithm(root1_F27, "<=", root1_F34);
		requiresroot1_F27_root1_F34.setName(Utilities.REQUIRES_CTC);
		solver.post(requiresroot1_F27_root1_F34);
		Constraint requiresroot1_F39_root1_F19 = IntConstraintFactory.arithm(root1_F39, "<=", root1_F19);
		requiresroot1_F39_root1_F19.setName(Utilities.REQUIRES_CTC);
		solver.post(requiresroot1_F39_root1_F19);
		
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
		
		IntStrategy strategy1 = IntStrategyFactory.custom(new FMVarSelectorBiVarArithmetic(), IntStrategyFactory.max_value_selector(), featureVars);
		IntStrategy strategy2 = IntStrategyFactory.custom(new FMVarSelectorOrAttr0(), IntStrategyFactory.max_value_selector(), featureVars);
		IntStrategy strategy3 = IntStrategyFactory.custom(new FMVarSelectorOrAttr1(), IntStrategyFactory.max_value_selector(), featureVars);
		IntStrategy strategy4 = IntStrategyFactory.custom(IntStrategyFactory.minDomainSize_var_selector(), new IntDomainMin(), attributeVars);
		IntStrategy strategy5 = IntStrategyFactory.custom(IntStrategyFactory.minDomainSize_var_selector(), new IntDomainMin(), totalVars);
		solver.set(IntStrategyFactory.sequencer(strategy1, strategy2, strategy3, IntStrategyFactory.domOverWDeg(featureVars, 1)), strategy4, strategy5);
		
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