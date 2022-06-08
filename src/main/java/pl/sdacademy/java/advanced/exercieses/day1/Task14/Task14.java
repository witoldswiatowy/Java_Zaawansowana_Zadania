package pl.sdacademy.java.advanced.exercieses.day1.Task14;

import java.util.*;
import java.util.stream.Collectors;

public class Task14 {
    public static void main(String[] args) {

        List<Integer> randomArrayOfInts = generateRandomList(100, 1000);
        System.out.println(randomArrayOfInts);

        List<Integer> listWithUniqualValue = getUniqualValue(randomArrayOfInts);
        System.out.println(listWithUniqualValue);

        List<Integer> listWithMultipleValue = valueHowHaveMultiple(randomArrayOfInts);
        System.out.println(listWithMultipleValue);

    }

    public static List<Integer> generateRandomList(int bound, int lenght) {
        Random rnd = new Random();
        List<Integer> randomList = new ArrayList<>();
        for (int i = 0; i < lenght; i++) {
            randomList.add(rnd.nextInt(bound));
        }
        return randomList.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> getUniqualValue(List<Integer> arrayOfInts) {
        return arrayOfInts.stream()
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    public static List<Integer> valueHowHaveMultiple(List<Integer> arrayOfInts) {
        return getMap(arrayOfInts).entrySet().stream()
                .filter(key -> key.getValue() >= 2)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());
    }

    public static Map<Integer, Integer> getMap(List<Integer> arrayOfInts) {
        Map<Integer, Integer> myMap = new HashMap<>();
        for (int i = 0; i < arrayOfInts.size(); i++) {
            myMap.put(i, arrayOfInts.get(i));
        }
        return myMap;
//        arrayOfInts.stream()
//                .forEach(e -> myMap.put(e,));?????????????????????
    }

}