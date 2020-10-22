package com.kodedu.lambdas.collect;


import com.kodedu.lambdas.Student;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class CollectApp5 {

    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("Ali", "math", 3),
                new Student("Ali", "cs", 4.5),
                new Student("Ahu", "math", 4),
                new Student("Ahu", "cs", 5),
                new Student("Ahu", "cs", 3.5),
                new Student("Can", "cs", 3),
                new Student("Can", "math", 2)
        );

// Student list by student name
        Map<String, List<Student>> map = students.stream()
                .collect(Collectors.groupingBy(s -> s.name())); // define key + value (list of students)

// Student set by student name
        Map<String, Set<Student>> collect2 = students.stream()
                // define key + value (set of students)
                .collect(Collectors.groupingBy(s -> s.name(), Collectors.toSet()));

// Lesson set by student name
        Map<String, Set<String>> collect = students.stream()
                // defined key + value (set of lessons)
                .collect(Collectors.groupingBy(s -> s.name(),
                        Collectors.mapping(s -> s.lesson(), Collectors.toSet())));

// Find average grade for each lesson by student
        Map<String, Map<String, Double>> collect1 = students.stream()
                // defined key + value (lesson -> avg(grade) map)
                .collect(Collectors.groupingBy(Student::name,
                        Collectors.groupingBy(s -> s.lesson(),
                                Collectors.averagingDouble(s -> s.grade())
                        )
                ));
    }
}
