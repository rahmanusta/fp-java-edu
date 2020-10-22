package com.kodedu.lambdas.function;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class FunctionApp2 {

    public static void main(String[] args) {

        // Create a BiFunction<Integerx3> instance which sums a + b
        BiFunction<Integer, Integer, Integer> biFunction = (a, b) -> a + b;
        System.out.println(biFunction.apply(3, 5));

        // Simplify BiFunction usage with BinaryOperator
        BinaryOperator<Integer> sumFunction = (a, b) -> a + b;

        // Pass function to higher-order function called executeSum
        executeSum(sumFunction, 3, 5);

        // Return a function from higher-order function called supplyFunction
        supplyFunction().apply(3, 5);

    }

    private static BinaryOperator<Integer> supplyFunction() {
        return (a, b) -> a + b;
    }

    private static Integer executeSum(BinaryOperator<Integer> function, int a, int b) {
        return function.apply(a, b);
    }
}
