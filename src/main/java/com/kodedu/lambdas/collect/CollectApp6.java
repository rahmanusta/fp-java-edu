package com.kodedu.lambdas.collect;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectApp6 {

    public static void main(String[] args) throws IOException {

        // Print each folder exist in the current directory

        Stream<Path> stream = Files.walk(Paths.get("."));

        String files = stream.filter(Files::isDirectory)
                .map(p -> p.toFile().toString())
                .collect(Collectors.joining("\n"));

        System.out.println(files);
    }
}
