package com.kodilla3.stream3;

import com.kodilla3.stream3.lambda.ExecuteSaySomething;
import com.kodilla3.stream3.lambda.Executor;
import com.kodilla3.stream3.lambda.ExpressionExecutor;
import com.kodilla3.stream3.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);
    }
}
