package org.patterns.behaviroal.interpreter;

public class FirstLetterUnderScore implements Expression {

    private FirstLetterUpperCase firstLetterUpperCase = new FirstLetterUpperCase();

    @Override
    public String interpret(String context) {
        if(context.charAt(0) == '_')
            context = context.substring(1);

        return firstLetterUpperCase.interpret(context);
    }
}
