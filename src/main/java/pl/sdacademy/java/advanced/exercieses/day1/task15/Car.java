package pl.sdacademy.java.advanced.exercieses.day1.task15;

public enum Car{
    FERRARI(300_000,5000),
    PORSCHE(250_000, 4500),
    MERCEDES(200_000, 4000),
    BMW(150_000, 3500),
    OPEL(50_000, 500),
    FIAT(40_000, 400),
    TOYOTA(30_000, 300);

    private static final int BOUND_OF_LUXARY = 140_000;
    double price;
    int power;

    Car(double price, int power) {
        this.price = price;
        this.power = power;
    }

    boolean isPremium (){
        return price > BOUND_OF_LUXARY;
    }

    boolean isRegular (){
//        return price < BOUND_OF_LUXARY;
        return !isPremium();
    }

    boolean isFasterThan(Car car) {
        return this.power > car.power;
//        return false;
    }


}
