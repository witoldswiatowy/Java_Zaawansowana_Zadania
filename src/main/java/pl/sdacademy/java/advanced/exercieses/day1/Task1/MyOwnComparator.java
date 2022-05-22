package pl.sdacademy.java.advanced.exercieses.day1.Task1;

import java.util.Comparator;
import java.util.List;

public class MyOwnComparator implements Comparator<String> {

    @Override
    public int compare(String o1, String o2) {
        return -o1.compareTo(o2);
    }
}
