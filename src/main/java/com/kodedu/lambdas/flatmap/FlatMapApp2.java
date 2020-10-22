package com.kodedu.lambdas.flatmap;

import java.util.List;

public class FlatMapApp2 {

    record Person(String name, List<Address> addressList) {
    }

    record Address(String value) {
    }

    public static void main(String[] args) {
        // Flat map = flatten + map

        List<Person> personList = List.of(
                new Person("Ayşe", List.of(new Address("Krakow"), new Address("İstanbul"))),
                new Person("Elif", List.of(new Address("İstanbul"), new Address("Ankara"))),
                new Person("Can", List.of(new Address("İzmir")))
        );

        // Print addresses of each person
        personList.stream()
                .map(p -> p.addressList())
                .forEach(System.out::println);

        // Print each address separately
    }
}
