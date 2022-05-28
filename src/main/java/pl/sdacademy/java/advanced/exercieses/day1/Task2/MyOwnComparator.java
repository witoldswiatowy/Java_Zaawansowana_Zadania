package pl.sdacademy.java.advanced.exercieses.day1.Task2;

import java.util.Comparator;
import java.util.Locale;

public class MyOwnComparator implements Comparator <String> {
    @Override
    public int compare(String o1, String o2) {
//        o1.toUpperCase();
//        o2.toUpperCase(); // z wyciągniętym tym nie działa to
        return -o1.toUpperCase().compareTo(o2.toUpperCase());
    }
//A-B 65-90, a-b 97-122
}
