package com.kodedu.lambdas.misc;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Stream;

public class Collect {

    public static void main(String[] args) {
        Stream.of(1, 2, 3, 4, 5).collect(ArrayList::new, ArrayList::add, ArrayList::addAll);

        List<Integer> list = Stream.of(1, 2)
                .parallel() // Comment this to see difference
                .collect(() -> {
                    MyList myList = new MyList();
                    System.out.println("New array created " + myList);
                    return myList;
                }, (arrayList, e) -> {
                    System.out.println(arrayList + " Accumulating element :" + e);
                    arrayList.add(e);
                }, (list1, list2) -> {
                    System.out.println("Combining " + list1 + " and " + list2);
                    list1.addAll(list2);
                });

        System.out.println("Final list " + list);
    }

    static class MyList extends ArrayList {

        private static final AtomicInteger counter = new AtomicInteger(0);
        private volatile int value;

        public MyList() {
            value = counter.incrementAndGet();
        }

        @Override
        public synchronized String toString() {
            return String.format("List%s{%s} - %s", value, super.toString(), Thread.currentThread().getName());
        }
    }
}
