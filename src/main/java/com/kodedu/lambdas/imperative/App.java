package com.kodedu.lambdas.imperative;

import java.util.Arrays;
import java.util.List;

public class App {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Find the number if contained in the list

        // Imperative
        System.out.println(containsNumber(numbers, 5));

        // Declarative
        System.out.println(numbers.contains(5));

        // Declarative + FP
        System.out.println(
                numbers.stream()
                        .anyMatch(e -> e == 5)
        );

    }

    private static boolean containsNumber(List<Integer> numbers, int i) {
        boolean result = false;
        for (int j = 0, numbersSize = numbers.size(); j < numbersSize; j++) {
            Integer number = numbers.get(j);
            if (number == i) {
                result = true;
                break;
            }
        }
        return result;
    }
}
