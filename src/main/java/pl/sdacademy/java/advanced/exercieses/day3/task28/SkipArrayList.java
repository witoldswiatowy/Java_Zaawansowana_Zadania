package pl.sdacademy.java.advanced.exercieses.day3.task28;

import java.util.ArrayList;
import java.util.List;

public class SkipArrayList<T> extends ArrayList<T> {

    public List<T> getEveryNthElement(int startIndeks, int valueToSkip) {
        List<T> everyNtElements = new ArrayList<>();
        int currentIndex = startIndeks;
        while (currentIndex < this.size()){
            T currentValue = this.get(currentIndex);
            everyNtElements.add(currentValue);
            currentIndex += valueToSkip + 1;
        }
        return everyNtElements;
    }

    public static void main(String[] args) {
        SkipArrayList <String> skipArrayList = new SkipArrayList<>();
        skipArrayList.add("a");
        skipArrayList.add("b");
        skipArrayList.add("c");
        skipArrayList.add("d");
        skipArrayList.add("e");
        skipArrayList.add("f");
        skipArrayList.add("g");

        System.out.println(skipArrayList);

        System.out.println(skipArrayList.getEveryNthElement(2,3));
    }

}
