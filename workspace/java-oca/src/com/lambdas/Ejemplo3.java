package com.lambdas;

import java.io.BufferedReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Ejemplo3 {

    public static void main(String[] args) {

        try (
            BufferedReader reader = Files.newBufferedReader(Paths.get("SomeLines.txt"), StandardCharsets.UTF_8)) {
            reader.lines().flatMap(line -> Stream.of(line.split(WORD_REGEXP))).distinct().map(String::toLowerCase).forEach(System.out::println);
        }

    }

}
