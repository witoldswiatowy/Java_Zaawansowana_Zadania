package pl.sdacademy.java.advanced.exercieses.day1.Task6;

import java.util.Map;
import java.util.TreeMap;

public class Task6 {
    public static void main(String[] args) {
        TreeMap <String,Integer> inputeTreeMap = new TreeMap<>();
        inputeTreeMap.put("Jeden",1);
        inputeTreeMap.put("Zero",0);
        inputeTreeMap.put("Cztery",4);
        inputeTreeMap.put("Dwa",2);
        inputeTreeMap.put("Trzy",3);
        showMeFirstAndLastEntrySet(inputeTreeMap);

    }

        private static void showMeFirstAndLastEntrySet (TreeMap <String,Integer> inputeTreeMap){
            String result1 = inputeTreeMap.firstEntry().toString();
            String result2 = inputeTreeMap.lastEntry().toString();
            System.out.println(result1);
            System.out.println(result2);
        }
}
