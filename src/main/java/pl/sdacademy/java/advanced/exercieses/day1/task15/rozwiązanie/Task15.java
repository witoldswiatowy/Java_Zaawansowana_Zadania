package pl.sdacademy.java.advanced.exercieses.day1.task15.rozwiązanie;

public class Task15 {
    public static void main(String[] args) {
        CarRozwiązanie car = CarRozwiązanie.OPEL;
        for(CarRozwiązanie carToCompare : CarRozwiązanie.values()) {
            System.out.printf("Czy %s jest szybszy niz %s: %b\n", car, carToCompare, car.isFasterThan(carToCompare));
        }

        car = CarRozwiązanie.MERCEDES;
        for(CarRozwiązanie carToCompare : CarRozwiązanie.values()) {
            System.out.printf("Czy %s jest szybszy niz %s: %b\n", car, carToCompare, car.isFasterThan(carToCompare));
        }

        System.out.printf("Czy %s jest premium: %b\n", car, car.isPremium());
        System.out.printf("Czy %s jest premium: %b\n", CarRozwiązanie.OPEL, CarRozwiązanie.isPremium(CarRozwiązanie.OPEL));
    }
}
