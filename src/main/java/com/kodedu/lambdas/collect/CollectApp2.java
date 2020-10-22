package com.kodedu.lambdas.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectApp2 {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 1, 1, 2, 3, 4, 5, 7, 8, 10);

        // Convert List to Set containing numbers less than 7

        Set<Integer> set = numbers.stream()
                .filter(n -> n < 7)
                .collect(Collectors.toSet());

        System.out.println(set);
    }
}
