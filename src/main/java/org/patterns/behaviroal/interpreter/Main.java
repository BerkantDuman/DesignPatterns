package org.patterns.behaviroal.interpreter;

public class Main {

    public static void main(String[] args) {
        String context = "_Int";

        FirstLetterUnderScore firstLetterUnderScore = new FirstLetterUnderScore();
        String result = firstLetterUnderScore.interpret(context);
        System.out.println("Result: " + result);

    }
}
