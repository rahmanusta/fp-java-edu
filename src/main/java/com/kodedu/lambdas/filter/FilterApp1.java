package com.kodedu.lambdas.filter;

import java.util.Arrays;
import java.util.List;

public class FilterApp1 {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Print numbers greater than 4

        numbers.stream()
                .filter(n -> n > 4)
                .forEach(System.out::println);


        // Find the numbers greater than 4 and divisible by 3

        numbers.stream()
                .filter(n -> n > 4)
                .filter(n -> n % 3 == 0)
                .forEach(System.out::println);

        // How many operation is done in filter methods ?

        numbers.stream()
                .filter(n -> {
                    System.out.println("Filter n> 4 :" + n);
                    return n > 4;
                })
                .filter(n -> {
                    System.out.println("Filter n % 3 == 0 :" + n);
                    return n % 3 == 0;
                });

    }
}
