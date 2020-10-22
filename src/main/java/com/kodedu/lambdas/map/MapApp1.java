package com.kodedu.lambdas.map;

import java.util.Arrays;
import java.util.List;

public class MapApp1 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Print the double of numbers greater than 4

        numbers.stream()
                .filter(n -> n > 4)
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
