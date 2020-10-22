package com.kodedu.lambdas.map;

import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class MapApp3 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Ali", "Veli", "Can", "Elif");

        // Transform names to uppercase and print
        names.stream()
                .map(n -> n.toUpperCase())
                .forEach(System.out::println);
    }
}
