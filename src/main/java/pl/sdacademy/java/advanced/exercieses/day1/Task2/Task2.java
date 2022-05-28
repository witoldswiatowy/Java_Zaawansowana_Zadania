package pl.sdacademy.java.advanced.exercieses.day1.Task2;

import java.util.ArrayList;
import java.util.List;

//A-B 65-90, a-b 97-122

public class Task2 {
    public static List <String> sortingMethod (List<String> listOfString){
        List<String> sorted = new ArrayList<>(listOfString);
        sorted.sort(new MyOwnComparator());
        return sorted;


//        return sorted.stream()
//                .sorted((o1, o2) -> o1.compareTo(o2))
//                .collect(Collectors.toList());
    }

}
