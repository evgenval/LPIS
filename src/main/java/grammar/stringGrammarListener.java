// Generated from C:/Users/Acer/Downloads/lpis/StringZhenya/src\stringGrammar.g4 by ANTLR 4.8

package grammar;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link stringGrammarParser}.
 */
public interface stringGrammarListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(stringGrammarParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(stringGrammarParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void enterMain(stringGrammarParser.MainContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#main}.
	 * @param ctx the parse tree
	 */
	void exitMain(stringGrammarParser.MainContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(stringGrammarParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(stringGrammarParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void enterInstruction(stringGrammarParser.InstructionContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#instruction}.
	 * @param ctx the parse tree
	 */
	void exitInstruction(stringGrammarParser.InstructionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterModMulDiv(stringGrammarParser.ModMulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitModMulDiv(stringGrammarParser.ModMulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterTypeConversion(stringGrammarParser.TypeConversionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitTypeConversion(stringGrammarParser.TypeConversionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAssignExpr(stringGrammarParser.AssignExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAssignExpr(stringGrammarParser.AssignExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterIdExpr(stringGrammarParser.IdExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitIdExpr(stringGrammarParser.IdExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#create}.
	 * @param ctx the parse tree
	 */
	void enterCreate(stringGrammarParser.CreateContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#create}.
	 * @param ctx the parse tree
	 */
	void exitCreate(stringGrammarParser.CreateContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#create_char}.
	 * @param ctx the parse tree
	 */
	void enterCreate_char(stringGrammarParser.Create_charContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#create_char}.
	 * @param ctx the parse tree
	 */
	void exitCreate_char(stringGrammarParser.Create_charContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#create_string}.
	 * @param ctx the parse tree
	 */
	void enterCreate_string(stringGrammarParser.Create_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#create_string}.
	 * @param ctx the parse tree
	 */
	void exitCreate_string(stringGrammarParser.Create_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#create_stringArray}.
	 * @param ctx the parse tree
	 */
	void enterCreate_stringArray(stringGrammarParser.Create_stringArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#create_stringArray}.
	 * @param ctx the parse tree
	 */
	void exitCreate_stringArray(stringGrammarParser.Create_stringArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code emptyArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 */
	void enterEmptyArray(stringGrammarParser.EmptyArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code emptyArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 */
	void exitEmptyArray(stringGrammarParser.EmptyArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 */
	void enterIdArray(stringGrammarParser.IdArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 */
	void exitIdArray(stringGrammarParser.IdArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 */
	void enterStrArray(stringGrammarParser.StrArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 */
	void exitStrArray(stringGrammarParser.StrArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallArray(stringGrammarParser.FunctionCallArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallArray(stringGrammarParser.FunctionCallArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectString(stringGrammarParser.NameObjectStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectString(stringGrammarParser.NameObjectStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallString(stringGrammarParser.FunctionCallStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallString(stringGrammarParser.FunctionCallStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 */
	void enterExprId(stringGrammarParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 */
	void exitExprId(stringGrammarParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 */
	void enterExprString(stringGrammarParser.ExprStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 */
	void exitExprString(stringGrammarParser.ExprStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 */
	void enterIdString(stringGrammarParser.IdStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 */
	void exitIdString(stringGrammarParser.IdStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nameObjectChar}
	 * labeled alternative in {@link stringGrammarParser#name_object_char}.
	 * @param ctx the parse tree
	 */
	void enterNameObjectChar(stringGrammarParser.NameObjectCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nameObjectChar}
	 * labeled alternative in {@link stringGrammarParser#name_object_char}.
	 * @param ctx the parse tree
	 */
	void exitNameObjectChar(stringGrammarParser.NameObjectCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallChar}
	 * labeled alternative in {@link stringGrammarParser#name_object_char}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallChar(stringGrammarParser.FunctionCallCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallChar}
	 * labeled alternative in {@link stringGrammarParser#name_object_char}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallChar(stringGrammarParser.FunctionCallCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code idChar}
	 * labeled alternative in {@link stringGrammarParser#name_object_char}.
	 * @param ctx the parse tree
	 */
	void enterIdChar(stringGrammarParser.IdCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code idChar}
	 * labeled alternative in {@link stringGrammarParser#name_object_char}.
	 * @param ctx the parse tree
	 */
	void exitIdChar(stringGrammarParser.IdCharContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void enterIf_stat(stringGrammarParser.If_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 */
	void exitIf_stat(stringGrammarParser.If_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void enterCondition_block(stringGrammarParser.Condition_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 */
	void exitCondition_block(stringGrammarParser.Condition_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void enterStat_block(stringGrammarParser.Stat_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 */
	void exitStat_block(stringGrammarParser.Stat_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void enterWhile_stat(stringGrammarParser.While_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 */
	void exitWhile_stat(stringGrammarParser.While_statContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#foreach_stat}.
	 * @param ctx the parse tree
	 */
	void enterForeach_stat(stringGrammarParser.Foreach_statContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#foreach_stat}.
	 * @param ctx the parse tree
	 */
	void exitForeach_stat(stringGrammarParser.Foreach_statContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link stringGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterEqualityExpr(stringGrammarParser.EqualityExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link stringGrammarParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitEqualityExpr(stringGrammarParser.EqualityExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code forEachElement}
	 * labeled alternative in {@link stringGrammarParser#condition_for_each}.
	 * @param ctx the parse tree
	 */
	void enterForEachElement(stringGrammarParser.ForEachElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code forEachElement}
	 * labeled alternative in {@link stringGrammarParser#condition_for_each}.
	 * @param ctx the parse tree
	 */
	void exitForEachElement(stringGrammarParser.ForEachElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(stringGrammarParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(stringGrammarParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code concatString}
	 * labeled alternative in {@link stringGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterConcatString(stringGrammarParser.ConcatStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code concatString}
	 * labeled alternative in {@link stringGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitConcatString(stringGrammarParser.ConcatStringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printId}
	 * labeled alternative in {@link stringGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintId(stringGrammarParser.PrintIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link stringGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintId(stringGrammarParser.PrintIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printString}
	 * labeled alternative in {@link stringGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void enterPrintString(stringGrammarParser.PrintStringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link stringGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 */
	void exitPrintString(stringGrammarParser.PrintStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(stringGrammarParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(stringGrammarParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#param_call}.
	 * @param ctx the parse tree
	 */
	void enterParam_call(stringGrammarParser.Param_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#param_call}.
	 * @param ctx the parse tree
	 */
	void exitParam_call(stringGrammarParser.Param_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link stringGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArg(stringGrammarParser.ParamCallArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link stringGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArg(stringGrammarParser.ParamCallArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link stringGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void enterParamCallArgs(stringGrammarParser.ParamCallArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link stringGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 */
	void exitParamCallArgs(stringGrammarParser.ParamCallArgsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link stringGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterVoidFunction(stringGrammarParser.VoidFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link stringGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitVoidFunction(stringGrammarParser.VoidFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link stringGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void enterReturnFunction(stringGrammarParser.ReturnFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link stringGrammarParser#function}.
	 * @param ctx the parse tree
	 */
	void exitReturnFunction(stringGrammarParser.ReturnFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void enterStat_block_with_return(stringGrammarParser.Stat_block_with_returnContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 */
	void exitStat_block_with_return(stringGrammarParser.Stat_block_with_returnContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#return_id}.
	 * @param ctx the parse tree
	 */
	void enterReturn_id(stringGrammarParser.Return_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#return_id}.
	 * @param ctx the parse tree
	 */
	void exitReturn_id(stringGrammarParser.Return_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(stringGrammarParser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(stringGrammarParser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link stringGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArg(stringGrammarParser.ParamArgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link stringGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArg(stringGrammarParser.ParamArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link stringGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void enterParamArgs(stringGrammarParser.ParamArgsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link stringGrammarParser#arg}.
	 * @param ctx the parse tree
	 */
	void exitParamArgs(stringGrammarParser.ParamArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link stringGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(stringGrammarParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link stringGrammarParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(stringGrammarParser.TypeContext ctx);
}