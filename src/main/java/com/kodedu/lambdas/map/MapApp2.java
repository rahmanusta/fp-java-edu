package com.kodedu.lambdas.map;

import java.util.Arrays;
import java.util.List;

public class MapApp2 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Print the average of numbers greater than 4

        System.out.println(
                numbers.stream()
                        .filter(n -> n > 4)
                        .mapToDouble(n -> n * 1.0)
                        .average()
        );
    }
}
