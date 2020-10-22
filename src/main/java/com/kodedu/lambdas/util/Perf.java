package com.kodedu.lambdas.util;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Perf {

    private static long startTime;

    public static void start() {
        startTime = System.currentTimeMillis();
    }

    public static long complete() {
        return complete("");
    }

    public static long complete(String comment) {
        long currentTime = System.currentTimeMillis();
        long difference = currentTime - startTime;
        System.out.println(String.format("%s\n\tCompleted in %s ms.", comment, difference));
        startTime = System.currentTimeMillis();
        return difference;
    }
}
