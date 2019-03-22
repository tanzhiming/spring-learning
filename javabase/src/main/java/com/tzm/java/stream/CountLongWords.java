package com.tzm.java.stream;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class CountLongWords {

    public static void main(String[] args) throws IOException {
        String content = new String(Files.readAllBytes(Paths.get("D:\\study\\spring-learning\\javabase\\target\\classes\\com\\tzm\\java\\stream\\alice30.txt")), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(content.split("\\PL+"));
//        for(String word: words) {
//            System.out.println(word);
//        }
        long count = 0;
        count = words.stream().filter(w -> w.length() > 12).count();
        System.out.println(count);

        count = words.parallelStream().filter(w -> w.length() > 12).count();
        System.out.println(count);
    }
}
