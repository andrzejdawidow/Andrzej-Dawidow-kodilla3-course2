package com.kodilla3.testing3;

//import com.kodilla3.testing3.user.SimpleUser;
import com.kodilla3.testing3.calculator.Calculator;

public class TestingMain3 {
    public static void main(String[] args){
        //Test 1
        Calculator simpleCalculator = new Calculator();
        int result = simpleCalculator.add(5, 5);
        if (result==(10)){
            System.out.println("add OK");
        } else {
            System.out.println("add Error!");
        }
        //Test2
        int result1 = simpleCalculator.subtract(5, 5);
        if (result1==(0)){
            System.out.println("subtract OK");
        } else {
            System.out.println("subtract Error!");
        }
    }
}
