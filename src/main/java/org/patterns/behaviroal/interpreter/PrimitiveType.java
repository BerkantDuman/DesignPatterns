package org.patterns.behaviroal.interpreter;

public class PrimitiveType implements Expression {
    @Override
    public String interpret(String context) {

        if (context.equals("int") || context.equals("bool") || context.equals("string"))
            return context;
        return context + "1";
    }
}
