package pl.sdacademy.java.advanced.exercieses.day1.Task4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Storage {
    private Map<String, List<String>> mapOfStorage = new HashMap<>();

    public void addToStorage(String key, String value) {
        if (mapOfStorage.containsKey(key)) {
            mapOfStorage.get(key).add(value);

        } else {
            mapOfStorage.put(key, new ArrayList<String>());
            mapOfStorage.get(key).add(value);
        }
    }

    public List<String> printValues(String key) {
        return mapOfStorage.get(key);
    }

    public List<String> findValues(String searchedValue) {
        return mapOfStorage.entrySet()
                .stream()
                .filter(entry -> entry.getValue().contains(searchedValue))
                .map(entry -> entry.getKey())
//                .map(Map.Entry::getKey) //to jest to samo co wyzej
//                .toList(); //to jest dopiero od Java 17, a robi to samo co to nizej
                .collect(Collectors.toList());

    }

    public List<String> getValues(String key) {
        return mapOfStorage.get(key);
    }

    public static void main(String[] args) {
        Storage storage = new Storage();
        storage.addToStorage("0", "value0_0");
        storage.addToStorage("0", "value0_1");
        storage.addToStorage("1", "value1_0");
        storage.addToStorage("1", "value0_0");
        storage.addToStorage("2", "value2_0");

        System.out.println(storage.printValues("1"));

    }

}
