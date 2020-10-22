package com.kodedu.lambdas.performance;

import com.kodedu.lambdas.util.Perf;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PerfApp3 {

    public static void main(String[] args) {

        List<Integer> numbers = getNumbersBetween(1, 100);

        // Are parallel streams efficient ?

        Perf.start();
        numbers.stream().peek(PerfApp3::doSomeJob).collect(Collectors.toList());
        Perf.complete("Standard stream");
        numbers.stream().parallel().peek(PerfApp3::doSomeJob).collect(Collectors.toList());
        Perf.complete("Parallel stream");

    }

    private static void doSomeJob(int i) {
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> getNumbersBetween(int start, int end) {
        return IntStream.range(start, end).boxed().collect(Collectors.toList());
    }
}
