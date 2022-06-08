package pl.sdacademy.java.advanced.exercieses.day2.task26;

import java.util.List;
import java.util.stream.Collectors;

public class Task26 {

    public static List<String> showAllModel(List<Car> carList) {
        return carList.stream()
                .map(m -> m.getModel())
                .collect(Collectors.toList());
    }

    public static void showAllCar (List<Car> carList){
         carList.stream()
                .forEach(System.out::println);
    }

    public static List<String> showAllManufacturerName(List<Car> carList){
        return carList.stream()
                .flatMap(m -> m.getManufacturers().stream())
                .map(n -> n.getName())
                .distinct()
                .collect(Collectors.toList());
    }
    public static List<Integer> showAllManufacturerFoundingYear(List<Car> carList){
        return carList.stream()
                .flatMap(m -> m.getManufacturers().stream())
                .map(n -> n.getFoundedInYear())
                .distinct()
                .collect(Collectors.toList());
    }


    public static List<String> showAllModelName (List<Car> carList){
        return carList.stream()
                .map(m -> m.getModel())
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<Integer> showAllCarWithEvenYears (List<Car> carList){
         return carList.stream()
                .filter(y -> y.getProductionYears() % 2 == 0)
                 .map(y -> y.getProductionYears())
                .collect(Collectors.toList());


    }


}
