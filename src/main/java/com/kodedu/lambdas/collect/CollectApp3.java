package com.kodedu.lambdas.collect;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectApp3 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Hakan", null, "Burak", "Can", null, "Elif");

        // Convert name list to Map containing (name -> lengthOf(name))
        Map<String, Integer> map = names.stream()
                .filter(n -> n != null)
                .collect(Collectors.toMap(name -> name, name -> name.length()));

        System.out.println(map);

    }
}
