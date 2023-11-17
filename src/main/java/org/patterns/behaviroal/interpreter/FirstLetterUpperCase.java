package org.patterns.behaviroal.interpreter;

public class FirstLetterUpperCase implements Expression {

    private PrimitiveType primitiveType = new PrimitiveType();

    @Override
    public String interpret(String context) {
        String upperCase = context.substring(0, 1).toLowerCase();
        context = upperCase + context.substring(1);
        return primitiveType.interpret(context);
    }
}
