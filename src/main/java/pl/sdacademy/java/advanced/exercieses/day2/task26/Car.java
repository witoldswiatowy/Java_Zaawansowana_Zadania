package pl.sdacademy.java.advanced.exercieses.day2.task26;

import lombok.Getter;

import java.util.List;

@Getter
public class Car {
    private final String name;
    private final String model;
    private final List<Manufacturer> manufacturers;
    private final String type;
    private final int productionYears;
    private final double price;
    private final Discription discription;

    public Car(String name, String model, List<Manufacturer> manufacturers, String type, int productionYears, double price, Discription discription) {
        this.name = name;
        this.model = model;
        this.manufacturers = manufacturers;
        this.type = type;
        this.productionYears = productionYears;
        this.price = price;
        this.discription = discription;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", " + manufacturers +
                ", type='" + type + '\'' +
                ", productionYears=" + productionYears +
                ", price=" + price +
                ", " + discription +
                '}';
    }
}
