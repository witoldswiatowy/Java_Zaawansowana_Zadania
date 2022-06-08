package pl.sdacademy.java.advanced.exercieses.day1.task15.rozwiązanie;

import pl.sdacademy.java.advanced.exercieses.day1.task15.Car;

import java.util.EnumSet;

public enum CarRozwiązanie {
    FERRARI(100, 100),
    PORSCHE(120, 90),
    MERCEDES(90, 80),
    BMW(89, 90),
    OPEL(70, 70),
    FIAT(50,50),
    TOYOTA(60, 55);

    private final double price;
    private final int power;
    private final static EnumSet<CarRozwiązanie> premiumCars = EnumSet.of(FERRARI, PORSCHE, MERCEDES);

    CarRozwiązanie(double price, int power) {
        this.price = price;
        this.power = power;
    }

    public boolean isPremium() {
        return premiumCars.contains(this);
    }

    static public boolean isPremium(CarRozwiązanie car) {
        return premiumCars.contains(car);
    }

    public boolean isRegular() {
        return !isPremium();
    }

    static public boolean isRegular(CarRozwiązanie car) {
        return !isPremium(car);
    }

    public boolean isFasterThan(CarRozwiązanie car) {
        return this.compareTo(car) < 0;
    }
}
