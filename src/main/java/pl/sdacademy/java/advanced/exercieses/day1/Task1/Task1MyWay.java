package pl.sdacademy.java.advanced.exercieses.day1.Task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task1MyWay {

    public static List<String> sortUsingAnonymousClass(List<String> unsorted) {
        List<String> sorted = new ArrayList<>(unsorted);
        Collections.sort(sorted);
        Collections.reverse(sorted);
        return sorted;
    }
}
