package pl.sdacademy.java.advanced.exercieses.day1;

import java.util.*;
import java.util.stream.Collectors;

public class Task3 {

    public static void main(String[] args) {
        Map<String, Integer> input = new HashMap<>();
        input.put("Java", 18);
        input.put("Python", 1);
        input.put("C#", 10);
        input.put("Pascal", 5);
        input.put("PHP", 0);
        System.out.println(printMap(input));
    }


        public static String printMap (Map<String,Integer>input){
            return input.entrySet()
                    .stream()
                    .map(entry -> "Klucz: " + entry.getKey() + ", Klucz: " + entry.getValue())
//                    .collect(Collectors.joining(", " + System.lineSeparator(), "", "."));
                    .collect(Collectors.joining(", " + "\n", "", "."));


    }
}
