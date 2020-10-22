package com.kodedu.lambdas.map;

import java.util.Arrays;
import java.util.List;

public class MapApp4 {

    public static void main(String[] args) {
        List<String> names = Arrays.asList("Sabahattin Ali", "Yaşar Kemal", "Nazım Hikmet");

        // Transform String`name and surname` to Author(name,surname)

        record Author(String name, String surname) {
        }

        names.stream()
                .map(n -> n.split(" "))
                .map(n -> new Author(n[0], n[1]))
                .forEach(System.out::println);
    }
}
