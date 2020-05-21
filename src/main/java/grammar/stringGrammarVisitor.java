// Generated from C:/Users/Acer/Downloads/lpis/StringZhenya/src\stringGrammar.g4 by ANTLR 4.8

package grammar;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link stringGrammarParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface stringGrammarVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(stringGrammarParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMain(stringGrammarParser.MainContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(stringGrammarParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#instruction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruction(stringGrammarParser.InstructionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ModMulDiv}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModMulDiv(stringGrammarParser.ModMulDivContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConversion}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConversion(stringGrammarParser.TypeConversionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code assignExpr}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignExpr(stringGrammarParser.AssignExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idExpr}
	 * labeled alternative in {@link stringGrammarParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdExpr(stringGrammarParser.IdExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate(stringGrammarParser.CreateContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#create_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_char(stringGrammarParser.Create_charContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#create_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_string(stringGrammarParser.Create_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#create_stringArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_stringArray(stringGrammarParser.Create_stringArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code emptyArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyArray(stringGrammarParser.EmptyArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdArray(stringGrammarParser.IdArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrArray(stringGrammarParser.StrArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallArray}
	 * labeled alternative in {@link stringGrammarParser#name_object_stringArray}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallArray(stringGrammarParser.FunctionCallArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectString(stringGrammarParser.NameObjectStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallString(stringGrammarParser.FunctionCallStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(stringGrammarParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprString(stringGrammarParser.ExprStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idString}
	 * labeled alternative in {@link stringGrammarParser#name_object_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdString(stringGrammarParser.IdStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nameObjectChar}
	 * labeled alternative in {@link stringGrammarParser#name_object_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNameObjectChar(stringGrammarParser.NameObjectCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallChar}
	 * labeled alternative in {@link stringGrammarParser#name_object_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallChar(stringGrammarParser.FunctionCallCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code idChar}
	 * labeled alternative in {@link stringGrammarParser#name_object_char}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdChar(stringGrammarParser.IdCharContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#if_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_stat(stringGrammarParser.If_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#condition_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_block(stringGrammarParser.Condition_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#stat_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block(stringGrammarParser.Stat_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#while_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_stat(stringGrammarParser.While_statContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#foreach_stat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeach_stat(stringGrammarParser.Foreach_statContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalityExpr}
	 * labeled alternative in {@link stringGrammarParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualityExpr(stringGrammarParser.EqualityExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code forEachElement}
	 * labeled alternative in {@link stringGrammarParser#condition_for_each}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForEachElement(stringGrammarParser.ForEachElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(stringGrammarParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code concatString}
	 * labeled alternative in {@link stringGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConcatString(stringGrammarParser.ConcatStringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printId}
	 * labeled alternative in {@link stringGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintId(stringGrammarParser.PrintIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printString}
	 * labeled alternative in {@link stringGrammarParser#print_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintString(stringGrammarParser.PrintStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(stringGrammarParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#param_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam_call(stringGrammarParser.Param_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArg}
	 * labeled alternative in {@link stringGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArg(stringGrammarParser.ParamCallArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramCallArgs}
	 * labeled alternative in {@link stringGrammarParser#arg_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamCallArgs(stringGrammarParser.ParamCallArgsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code voidFunction}
	 * labeled alternative in {@link stringGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVoidFunction(stringGrammarParser.VoidFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnFunction}
	 * labeled alternative in {@link stringGrammarParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnFunction(stringGrammarParser.ReturnFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#stat_block_with_return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStat_block_with_return(stringGrammarParser.Stat_block_with_returnContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#return_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_id(stringGrammarParser.Return_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(stringGrammarParser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArg}
	 * labeled alternative in {@link stringGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArg(stringGrammarParser.ParamArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code paramArgs}
	 * labeled alternative in {@link stringGrammarParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamArgs(stringGrammarParser.ParamArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link stringGrammarParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(stringGrammarParser.TypeContext ctx);
}