package io.regna.jvm;

import io.regna.core.RegnaCompilationException;
import io.regna.core.ParserFacade;
import io.regna.core.RegnaParser;
import org.antlr.v4.runtime.ParserRuleContext;

import java.util.ArrayList;
import java.util.HashMap;

public class MethodBuilder {

    private StringBuilder commands;
    private RegnaParser.FormalParamListContext pctx;
    ArrayList<String> param_names = new ArrayList<>();String parameters;
    HashMap<String, String> vars;

    public MethodBuilder(RegnaParser.FormalParamListContext ctx){
        pctx = ctx;
        commands = new StringBuilder();
        vars = new HashMap<>();
    }

    /**
     * Registers a command in the syntax of Javassist
     * @param command The command to save
     */
    public void registerCommand(String command){
//        for(int x = 0; x < param_names.size(); x++){
//            String param = param_names.get(x);
//            if(command.contains(param)){
//                command = command.replaceAll(param, "$"+x);
//            }
//        }
        commands.append(command);
    }

    /**
     * Get a string containing the params in Java Syntax,
     * ex: The params are <code>args : String[], num : int</code>
     *     Then, they will be converted into
     *     (String[] args, int num)
     * @return The Params in string form
     */
    private void identifyParams(){
        StringBuilder stringBuilder = new StringBuilder().append("(");
        if(pctx != null){
            int param_count = 1;
            if(pctx.formalParam() != null){
                for(RegnaParser.FormalParamContext param : pctx.formalParam()){
                    String param_name = param.id().getText();
                    String param_type = param.arid().getText();
                    if(param_count > 1){
                        stringBuilder.append(", ");
                    }
                    param_names.add(param_name);
                    stringBuilder.append(param_type + " " + param_name);
                    param_count++;
                }
            }
        }
        stringBuilder.append(")");
        parameters = stringBuilder.toString();
    }

    /**
     * Based on the data like registered commands, the method builder returns a method definition of the method in java
     * @param modifiers The method modifiers
     * @return The method definition
     */
    public String asMethodDef(String modifiers){
        StringBuilder sb = new StringBuilder();
        sb.append(modifiers + " ");
        identifyParams();
        sb.append(parameters);
        sb.append(" { " + commands.toString() + " }");
        return sb.toString();
    }

    public void registerVar(String type, String name, String value, final String constkey, ParserRuleContext ctx) throws RegnaCompilationException {
        if(!vars.containsKey(name)){
            vars.put(name, type);
            if((!constkey.isEmpty()) && value.equals("")) {
                throw new RegnaCompilationException(ctx.getStart().getLine(), ctx.getStop().getLine(), "Expected attribute value", RegnaCompilationException.getLineFromRule(ctx, ParserFacade.tokenStream));
            }
            String def = constkey + " " + type + " " + name + value + ";";
            //System.out.println(def);
            registerCommand(def);
        } else {
            throw new RegnaCompilationException(ctx.getStart().getLine(), ctx.getStart().getCharPositionInLine(), "Duplicate Local Variable", RegnaCompilationException.getLineFromRule(ctx, ParserFacade.tokenStream));
        }
    }

}
