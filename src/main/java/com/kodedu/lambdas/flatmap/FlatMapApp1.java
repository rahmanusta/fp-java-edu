package com.kodedu.lambdas.flatmap;

import java.util.Arrays;
import java.util.List;

public class FlatMapApp1 {

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Yaşar Kemal", "Sabahattin Ali", "Ahmet Ümit");

        // Create 6 names from 3 author fullNames

        // Flat map = flatten + map

        names.stream()
//                .map(n -> Arrays.asList(n.split(" ")))
                .flatMap(n -> Arrays.asList(n.split(" ")).stream())
                .forEach(System.out::println);
    }
}
