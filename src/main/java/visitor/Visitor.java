package visitor;


import grammar.stringGrammarBaseVisitor;
import grammar.stringGrammarParser;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.TerminalNode;
import visitor.exceptions.NotDefinedVariable;
import visitor.exceptions.NotValidCast;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static config.Config.COMPILE_PACKAGE_NAME;

public class Visitor extends stringGrammarBaseVisitor<String> {
    private String className;
    private Map<String, Type> globalVariable = new HashMap<>();
    private Map<String, Type> localVariable = new HashMap<>();
    private Map<String, Type> functionNames = new HashMap<>();


    public Visitor(String fileName){
        String fileNameForClass = getStringWithFirstCapital(fileName);
        this.className = replaceDot(fileNameForClass);
    }

    private String getStringWithFirstCapital(String string) {
        return string.substring(0,1).toUpperCase() + string.substring(1).toLowerCase();
    }

    private String replaceDot(String string) {
        return string.replaceAll("[.]", "_");
    }

    private boolean isGlobal(ParserRuleContext ctx){
        return ctx.getParent().getParent() instanceof stringGrammarParser.ParseContext;
    }

    private void addVariableToList(ParserRuleContext ctx, String name, Type type) {
        if (isGlobal(ctx)){
            globalVariable.put(name, type);
        } else {
            localVariable.put(name, type);
        }
    }

    private void addToLocalVariableList(String name, Type type){
        localVariable.put(name, type);
    }

    private void clearLocalVariableList(){
        localVariable.clear();
    }

    private void addToFunctionList(String name, Type type){
        functionNames.put(name, type);
    }

    private void checkVariable(String name) {
        if (!(globalVariable.containsKey(name) || localVariable.containsKey(name))){
            try {
                throw new NotDefinedVariable("Variable " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                logError(notDefinedVariable.getMessage());
                System.exit(-1);
            }
        }
    }

    private void checkFunction(String name) {
        if (!(functionNames.containsKey(name))){
            try {
                throw new NotDefinedVariable("Function " + name + " is not defined");
            } catch (NotDefinedVariable notDefinedVariable) {
                logError(notDefinedVariable.getMessage());
                System.exit(-2);
            }
        }
    }

    private void checkCast(String name, Type needType) {
        try {
            if (localVariable.containsKey(name)) {
                if (!(localVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            } else {
                if (!(globalVariable.get(name).equals(needType))) {
                    throw new NotValidCast("Variable " + name + " need have type " + needType);
                }
            }
        } catch (NotValidCast notValidCast) {
            logError(notValidCast.getMessage());
            System.exit(-3);
        }
    }

    private void logError(String message) {
        System.out.println("Compilation Error: " + message);
    }

    private void checkCastFunction(String name, Type needType){
        if (!(functionNames.get(name).equals(needType))){
            try {
                throw new NotValidCast("Function " + name + " need have type " + needType);
            } catch (NotValidCast notValidCast) {
                notValidCast.printStackTrace();
                System.exit(-4);
            }
        }

    }

    private Type getTypeVariable(String name){
        if (localVariable.containsKey(name)) {
            return localVariable.get(name);
        } else {
            return globalVariable.get(name);
        }
    }

    private boolean notExistLocaleVariable(String name){
        return !localVariable.containsKey(name);
    }

    @Override
    public String visitParse(stringGrammarParser.ParseContext ctx) {
        String buffer = "";
        buffer += "package " + COMPILE_PACKAGE_NAME + ";\n";
        buffer += "public class " + "Main" + " {\n";
        List<stringGrammarParser.CreateContext> createContextList = ctx.create();
        for (stringGrammarParser.CreateContext aCreateContextList : createContextList) {
            buffer += "static " + this.visit(aCreateContextList);
            buffer += "\n";
        }
        List<stringGrammarParser.FunctionContext> functionContextList = ctx.function();
        for (stringGrammarParser.FunctionContext aFunctionContextList : functionContextList) {
            buffer += this.visit(aFunctionContextList);
            buffer += "\n";
        }
        buffer += this.visit(ctx.main());
        buffer += "}\n";
        return buffer;
    }

    @Override
    public String visitMain(stringGrammarParser.MainContext ctx) {
        clearLocalVariableList();
        return  "public static void main(String[]args) throws Exception{\n" +
                this.visit(ctx.start()) +
                "}\n";
    }

    @Override
    public String visitStart(stringGrammarParser.StartContext ctx) {
        String buffer = "";
        for (int children = 0; children < ctx.getChildCount(); children++){
            buffer += "";
            buffer += this.visit(ctx.getChild(children));
            buffer += "\n";
        }
        return buffer;
    }
    @Override
    public String visitTypeConversion(stringGrammarParser.TypeConversionContext ctx) {
        String type = "";
        String buffer = visit(ctx.expr());
        if (ctx.tp.getType() == stringGrammarParser.STRING_TYPE) type = "MyString";
        return " MyString.conv(" + buffer + ".toString())";
    }
    @Override
    public String visitModMulDiv(stringGrammarParser.ModMulDivContext ctx) {
        String left = visit(ctx.expr(0));
        String right = visit(ctx.expr(1));
        if (ctx.op.getType() == stringGrammarParser.PLUS) return left + ".concatStr(" + left + ", " + right + ")";
        if (ctx.op.getType() == stringGrammarParser.MOD) return left + ".divStr(" + left + ", " + right + ")";
        if (ctx.op.getType() == stringGrammarParser.MUL) return left + ".mulStr(" + left + ", " + right + ")";
        return left + ".subStr(" + left + ", " + right + ")";
    }

    @Override
    public String visitIdExpr(stringGrammarParser.IdExprContext ctx) {
        String name = ctx.ID().getText();
        return name;
    }

    @Override
    public String visitAssignExpr(stringGrammarParser.AssignExprContext ctx) {
        String left = ctx.ID().getText();
        String right = visit(ctx.expr());
        return left + " =" + right + ";";
    }

    @Override
    public String visitCreate_string(stringGrammarParser.Create_stringContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)){
            addVariableToList(ctx, name, Type.STRING);
            newVariable = Type.STRING.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_string());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitNameObjectString(stringGrammarParser.NameObjectStringContext ctx) {
        stringGrammarParser.Create_stringContext context = (stringGrammarParser.Create_stringContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.STRING().getText() + ");";
    }

    @Override
    public String visitIdString(stringGrammarParser.IdStringContext ctx) {
        stringGrammarParser.Create_stringContext context = (stringGrammarParser.Create_stringContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.ID().getText() + ");";
    }

    @Override
    public String visitExprId(stringGrammarParser.ExprIdContext ctx) {
        stringGrammarParser.Create_stringContext context = (stringGrammarParser.Create_stringContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        String firstId = ctx.ID(0).getText();
        String secondId = ctx.ID(1).getText();
        switch (ctx.op.getText())
        {
            case "+":
                return type + ".concatStr(" + firstId + ", " + secondId + ");";
            case "-":
                return type + ".subStr(" + firstId + ", " + secondId + ");";
            case "/":
                return type + ".divStr(" + firstId + ", " + secondId + ");";
        }
        return type + ".mulStr(" + firstId + ", " + secondId + ");";
    }
    @Override
    public String visitExprString(stringGrammarParser.ExprStringContext ctx) {
        stringGrammarParser.Create_stringContext context = (stringGrammarParser.Create_stringContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        String firstStr = ctx.STRING(0).getText();
        String secondStr = ctx.STRING(1).getText();
        switch (ctx.op.getText())
        {
            case "+":
                return type + ".concatStr(" + firstStr + ", " + secondStr + ");";
            case "-":
                return type + ".subStr(" + firstStr + ", " + secondStr + ");";
            case "/":
                return type + ".divStr(" + firstStr + ", " + secondStr + ");";
        }
        return type + ".mulStr(" + firstStr + ", " + secondStr + ");";
    }

    @Override
    public String visitFunctionCallString(stringGrammarParser.FunctionCallStringContext ctx) {
        stringGrammarParser.Function_callContext context = ctx.function_call();
        String name = context.ID().getText();
        checkFunction(name);
        stringGrammarParser.Create_stringContext contextP = (stringGrammarParser.Create_stringContext) ctx.getParent();
        String left = contextP.ID().getText();
        checkCastFunction(name, getTypeVariable(left));
        return name + this.visit(context.param_call());
    }

    @Override
    public String visitParam_call(stringGrammarParser.Param_callContext ctx) {
        String args = "";
        if (ctx.arg_call() != null){
            args = this.visit(ctx.arg_call());
        }
        return "(" + args + ");";
    }

    @Override
    public String visitReturnFunction(stringGrammarParser.ReturnFunctionContext ctx) {
        clearLocalVariableList();
        String name = ctx.ID().getText();
        String returnType = ctx.type().getText();
        addToFunctionList(name, Type.getTypeByString(returnType));
        return "private static " + Type.getTypeByString(returnType).toString() + " " + name +
                this.visit(ctx.param()) +
                this.visit(ctx.stat_block_with_return());
    }

    @Override
    public String visitVoidFunction(stringGrammarParser.VoidFunctionContext ctx) {
        clearLocalVariableList();
        String name = ctx.ID().getText();
        addToFunctionList(name, Type.VOID);
        return "private static void " + name + this.visit(ctx.param()) + this.visit(ctx.stat_block());
    }

    @Override
    public String visitFunction_call(stringGrammarParser.Function_callContext ctx) {
        String name = ctx.ID().getText();
        checkFunction(name);
        return name + this.visit(ctx.param_call());
    }

    @Override
    public String visitParam(stringGrammarParser.ParamContext ctx) {
        String args = "";
        if (ctx.arg() != null){
            args = this.visit(ctx.arg());
        }
        return "(" + args + ")";
    }

    @Override
    public String visitParamCallArgs(stringGrammarParser.ParamCallArgsContext ctx) {
        String name = ctx.ID().getText();
        checkVariable(name);
        return name + ", " + this.visit(ctx.arg_call());
    }
    //
    @Override
    public String visitParamCallArg(stringGrammarParser.ParamCallArgContext ctx) {
        String name = ctx.ID().getText();
        checkVariable(name);
        return name;
    }
    //
    @Override
    public String visitParamArgs(stringGrammarParser.ParamArgsContext ctx) {
        String type = ctx.type().getText();
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        return Type.getTypeByString(type).toString() + " " + name + ", " + this.visit(ctx.arg());
    }
    //
    @Override
    public String visitParamArg(stringGrammarParser.ParamArgContext ctx) {
        String type = ctx.type().getText();
        String name = ctx.ID().getText();
        addToLocalVariableList(name, Type.getTypeByString(type));
        return Type.getTypeByString(type).toString() + " " + name;
    }

    @Override
    public String visitStat_block_with_return(stringGrammarParser.Stat_block_with_returnContext ctx) {
        return "{\n" + this.visit(ctx.start()) + this.visit(ctx.return_id()) +"}";
    }

    @Override
    public String visitReturn_id(stringGrammarParser.Return_idContext ctx) {
        String id = ctx.ID().getText();
        checkVariable(id);
        stringGrammarParser.ReturnFunctionContext context = (stringGrammarParser.ReturnFunctionContext) ctx.getParent().getParent();
        checkCast(id, Type.getTypeByString(context.type().getText()));
        return "return " + id + ";\n";
    }
    @Override
    public String visitCreate_char(stringGrammarParser.Create_charContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)){
            addVariableToList(ctx, name, Type.CHAR);
            newVariable = Type.CHAR.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_char());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitNameObjectChar(stringGrammarParser.NameObjectCharContext ctx) {
        stringGrammarParser.Create_charContext context = (stringGrammarParser.Create_charContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.SYMBOL().getText() + ");";
    }

    @Override
    public String visitFunctionCallChar(stringGrammarParser.FunctionCallCharContext ctx) {
        stringGrammarParser.Function_callContext context = ctx.function_call();
        String name = context.ID().getText();
        checkFunction(name);
        stringGrammarParser.Create_charContext contextP = (stringGrammarParser.Create_charContext) ctx.getParent();
        String left = contextP.ID().getText();
        checkCastFunction(name, getTypeVariable(left));
        return name + this.visit(context.param_call());
    }

    @Override
    public String visitIdChar(stringGrammarParser.IdCharContext ctx){
        stringGrammarParser.Create_charContext context = (stringGrammarParser.Create_charContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ctx.ID().getText() + ");";
    }

    @Override
    public String visitCreate_stringArray(stringGrammarParser.Create_stringArrayContext ctx) {
        String name = ctx.ID().getText();
        String newVariable = "";
        if (notExistLocaleVariable(name)){
            addVariableToList(ctx, name, Type.STRING_ARRAY);
            newVariable = Type.STRING_ARRAY.toString() + " ";
        }
        String nameObject = this.visit(ctx.name_object_stringArray());
        return newVariable + name + " = " + nameObject;
    }

    @Override
    public String visitEmptyArray(stringGrammarParser.EmptyArrayContext ctx) {
        stringGrammarParser.Create_stringArrayContext context = (stringGrammarParser.Create_stringArrayContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        return "new " + type + "(" + ");";

    }

    @Override
    public String visitIdArray(stringGrammarParser.IdArrayContext ctx) {
        stringGrammarParser.Create_stringArrayContext context = (stringGrammarParser.Create_stringArrayContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        String first = "new " + type + "(" + ");\n";
        String buf = "";
        List <TerminalNode> ids = ctx.ID();
        for (TerminalNode id : ids) {
            buf += name + ".add(" + id.getText() + ");" + "\n";
        }
        return first + buf;
    }

    @Override
    public String visitStrArray(stringGrammarParser.StrArrayContext ctx) {
        stringGrammarParser.Create_stringArrayContext context = (stringGrammarParser.Create_stringArrayContext) ctx.getParent();
        String name = context.ID().getText();
        Type type = getTypeVariable(name);
        String first = "new " + type + "(" + ");\n";
        String buf = "";
        List <TerminalNode> ids = ctx.STRING();
        for (TerminalNode id : ids) {
            buf += name + ".add(" + id.getText() + ");" + "\n";
        }
        return first + buf;
    }

    @Override
    public String visitFunctionCallArray(stringGrammarParser.FunctionCallArrayContext ctx) {
        stringGrammarParser.Function_callContext context = ctx.function_call();
        String name = context.ID().getText();
        checkFunction(name);
        stringGrammarParser.Create_stringArrayContext contextP = (stringGrammarParser.Create_stringArrayContext) ctx.getParent();
        String left = contextP.ID().getText();
        checkCastFunction(name, getTypeVariable(left));
        return name + this.visit(context.param_call());
    }

    @Override
    public String visitPrint(stringGrammarParser.PrintContext ctx){
        return "System.out.println(" + this.visit(ctx.print_expr()) + ");";
    }


    @Override
    public String visitPrintString(stringGrammarParser.PrintStringContext ctx) {
        return ctx.STRING().getText();
    }

    @Override
    public String visitPrintId(stringGrammarParser.PrintIdContext ctx) {
        String name = ctx.ID().toString();
        checkVariable(name);
        return name;
    }

    @Override
    public String visitConcatString(stringGrammarParser.ConcatStringContext ctx) {
        String string1 = this.visit(ctx.print_expr(0));
        String string2 = this.visit(ctx.print_expr(1));
        return string1 + " + " + string2;
    }

    @Override
    public String visitIf_stat(stringGrammarParser.If_statContext ctx) {
        String buffer = "";
        List<stringGrammarParser.Condition_blockContext> conditions =  ctx.condition_block();
        for(int index = 0; index < conditions.size(); index++) {
            String conditionString = this.visit(conditions.get(index).condition());
            String negation ="";
            if (conditions.get(index).NEGATION() != null){
                negation = "!";
            }
            buffer += "if (" + negation + conditionString + ")";
            buffer += this.visit(conditions.get(index).stat_block());
            if ((index + 1) < conditions.size()){
                buffer += "else ";
            }
        }
        if(ctx.stat_block() != null) {
            buffer += "else" + this.visit(ctx.stat_block());
        }
        return buffer;
    }

    @Override
    public String visitCondition_block(stringGrammarParser.Condition_blockContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public String visitEqualityExpr(stringGrammarParser.EqualityExprContext ctx) {
        String left = ctx.ID(0).getText();
        checkVariable(left);
        String right = ctx.ID(1).getText();
        checkVariable(right);
        switch (ctx.op.getType()) {
            case stringGrammarParser.EQ:
                return left + ".equals("+ right + ")";
            case stringGrammarParser.NEQ:
                return "!" + left + ".equals("+ right + ")";
            default:
                throw new RuntimeException("Unknown operator: " + ctx.op.getText());
        }
    }

    @Override
    public String visitStat_block(stringGrammarParser.Stat_blockContext ctx) {
        Map<String, Type> beforeStatBlock = new HashMap(localVariable);
        String block = "{\n" + this.visit(ctx.start()) +"}";
        localVariable = beforeStatBlock;
        return block;
    }

    @Override
    public String visitWhile_stat(stringGrammarParser.While_statContext ctx) {
        return "while (" + this.visit(ctx.condition_block().condition()) + ")" +
                this.visit(ctx.condition_block().stat_block());
    }

    @Override
    public String visitForeach_stat(stringGrammarParser.Foreach_statContext ctx) {
        Map<String, Type> beforeStatBlock = new HashMap(localVariable);
        String forBlock = "for (" + this.visit(ctx.condition_for_each()) + ")" + this.visit(ctx.stat_block());
        localVariable = beforeStatBlock;
        return forBlock;
    }

    @Override
    public String visitForEachElement(stringGrammarParser.ForEachElementContext ctx) {
        String left = ctx.ID(0).getText();
        //checkVariable(left);
        addToLocalVariableList(left, Type.STRING);
        String right = ctx.ID(1).getText();
        String returnType = ctx.op.getText();
        checkVariable(right);
        checkCast(right, Type.STRING_ARRAY);
        return Type.getTypeByString(returnType).toString() + " " + left + " : "+ right;
    }


    //@Override public String visitContain(stringGrammarParser.ContainContext ctx) {
    //    String left = ctx.ID(0).getText();
    //    checkVariable(left);
    //    checkCast(left, Type.SET);
    //    String right = ctx.ID(1).getText();
    //    checkVariable(right);
    //    return left + ".contains("+ right + ")";
    //}
//

//

//

//

//

//
    //@Override
    //public String visitReturnFunction(stringGrammarParser.ReturnFunctionContext ctx) {
    //    clearLocalVariableList();
    //    String name = ctx.ID().getText();
    //    String returnType = ctx.type().getText();
    //    returnType = getStringWithFirstCapital(returnType);
    //    addToFunctionList(name, Type.getTypeByString(returnType));
    //    return "private static " + returnType + " " + name +
    //            this.visit(ctx.param()) +
    //            this.visit(ctx.stat_block_with_return());
    //}
//

//

//

//
//

//

//

}//
