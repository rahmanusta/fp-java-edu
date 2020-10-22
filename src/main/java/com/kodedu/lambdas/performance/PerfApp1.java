package com.kodedu.lambdas.performance;

import com.kodedu.lambdas.util.Perf;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PerfApp1 {
    public static void main(String[] args) {

        // Difference between IntStream vs Stream<Integer> ?
        List<Integer> numbers = getNumbersBetween(1, 100000000);

        IntStream intStream = numbers.stream().mapToInt(e -> e);
        Stream<Integer> stream = numbers.stream();

        Perf.start();
        Integer sum1 = stream.reduce(0, (a, b) -> a + b);
        Perf.complete("Stream");
        int sum2 = intStream.sum();
        Perf.complete("Intstream");

    }

    private static List<Integer> getNumbersBetween(int start, int end) {
        return IntStream.range(start, end).boxed().collect(Collectors.toList());
    }
}
