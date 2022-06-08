package pl.sdacademy.java.advanced.exercieses.day1.task15;

public class CarMain {
    public static void main(String[] args) {

        System.out.println(Car.MERCEDES.isPremium());
        System.out.println(Car.BMW.isPremium());
        System.out.println(Car.OPEL.isPremium());
        System.out.println("1");

        System.out.println(Car.BMW.isRegular());
        System.out.println(Car.OPEL.isRegular());
        System.out.println(Car.FIAT.isRegular());
        System.out.println("2");

        Car car = Car.BMW;
        for (Car carCompareTo : Car.values()){
            System.out.printf("Czy %s jest szybszy niz %s: %b\n", car, carCompareTo, car.isFasterThan(carCompareTo));
        }
    }
}
