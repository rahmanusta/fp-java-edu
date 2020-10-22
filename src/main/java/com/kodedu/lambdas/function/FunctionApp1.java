package com.kodedu.lambdas.function;

import java.util.function.Consumer;

public class FunctionApp1 {

    public static void main(String[] args) {

        // Create a Consumer<T> instance as anonymous class

        Consumer<String> consumer0 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };

        // Create Consumer<T> instance with lambda expressions

        Consumer<String> consumer1 = (s) -> System.out.println(s);

        consumer1.accept("Hello lambda expression!");

        // Create instance with method reference instead of lambda

        Consumer<String> consumer2 = System.out::println;

        consumer2.accept("Hello method reference!");


    }
}
