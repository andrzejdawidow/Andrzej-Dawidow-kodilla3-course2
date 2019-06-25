package com.kodilla3.stream3;

import com.kodilla3.stream3.lambda.ExecuteSaySomething;
import com.kodilla3.stream3.lambda.Executor;
import com.kodilla3.stream3.lambda.ExpressionExecutor;
import com.kodilla3.stream3.lambda.Processor;
import com.kodilla3.stream3.reference.FunctionalCalculator;
import com.kodilla3.stream3.beautifier.PoemBeautifier;

import static jdk.nashorn.internal.objects.NativeString.toUpperCase;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::multiplyAByB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);
        System.out.println();
        System.out.println("Zadanie 7_1_Upiekszacz_tekstow");
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        String someTekst1 = poemBeautifier.beautify("number1", a -> "super1 + " + a + " + super2");
        System.out.println(someTekst1);

        String someTekst2 = poemBeautifier.beautify("number2", a -> a + " " + toUpperCase(a));
        System.out.println(someTekst2);

        String someTekst3 = poemBeautifier.beautify("number3", a -> "***" + a + "***");
        System.out.println(someTekst3);

        String someTekst4 = poemBeautifier.beautify("number4", a -> "#A#B#C#" + a + "#A#B#C#");
        System.out.println(someTekst4);
    }
}
