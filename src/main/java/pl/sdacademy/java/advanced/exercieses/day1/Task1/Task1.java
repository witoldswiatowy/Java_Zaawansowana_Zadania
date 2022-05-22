package pl.sdacademy.java.advanced.exercieses.day1.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {

    public static List<String> sortUsingAnonymousClass(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
//                return o1.compareTo(o2); //od a do z
//                return o2.compareTo(o1); //od z do a
                return -o1.compareTo(o2); // od z do a

            }
        });
        return sorted;
    }

    public static List<String> sortUsingMyOwnComparator(final List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted, new MyOwnComparator());
        return sorted;
    }

    public static List<String> sortUsingStream(final List<String> unsorted){
        List<String> sorted = new ArrayList<>(unsorted);
        return sorted.stream()
//                .sorted(new MyOwnComparator())
//                .sorted(Comparator.reverseOrder()) //to podspodem robi o2.compareTp(o1)
                .sorted((o1,o2) -> o2.compareTo(o1))
                .collect(Collectors.toList());
    }
}
