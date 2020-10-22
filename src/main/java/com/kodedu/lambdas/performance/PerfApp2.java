package com.kodedu.lambdas.performance;

import com.kodedu.lambdas.util.Perf;

import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfApp2 {

    public static void main(String[] args) {

        // Are parallel streams efficient ?

        List<Integer> numbers = getNumbersBetween(1, 10000000);

        // Collect numbers serial vs parallel

        Perf.start();
        numbers.stream().collect(Collectors.toList());
        Perf.complete("Standard stream");
        numbers.stream().parallel().collect(Collectors.toList());
        Perf.complete("Parallel stream");

    }

    private static List<Integer> getNumbersBetween(int start, int end) {
        return IntStream.range(start, end).boxed().collect(Collectors.toList());
    }
}
