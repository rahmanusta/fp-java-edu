package com.kodedu.lambdas.collect;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CollectApp1 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Convert numbers to List containing numbers greater than 4

        List<Integer> list = numbers.stream()
                .filter(n -> n > 4)
                .collect(Collectors.toList());

        System.out.println(list);
    }
}
