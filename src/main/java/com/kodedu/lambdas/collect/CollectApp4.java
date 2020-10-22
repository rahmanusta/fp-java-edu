package com.kodedu.lambdas.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectApp4 {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 1, 1, 1, 3, 3, 2, 2, 4, 5, 6);

        // Create a Map containing how many times a number repeated

        Map<Integer, Long> group = numbers.stream()
                .collect(Collectors.groupingBy(k -> k, Collectors.counting()));

        System.out.println(group);
    }
}
