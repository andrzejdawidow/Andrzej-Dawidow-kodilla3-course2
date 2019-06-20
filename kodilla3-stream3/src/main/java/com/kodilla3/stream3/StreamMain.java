package com.kodilla3.stream3;

import com.kodilla3.stream3.lambda.ExecuteSaySomething;
import com.kodilla3.stream3.lambda.Executor;
import com.kodilla3.stream3.lambda.Processor;

public class StreamMain {
    public static void main(String[] args) {
        Processor processor = new Processor();
        Executor codeToExecute = () -> System.out.println("This is an example text.");
        processor.execute(codeToExecute);
    }
}
