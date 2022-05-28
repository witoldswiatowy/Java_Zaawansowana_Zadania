package pl.sdacademy.java.advanced.exercieses.day1.Task12_13;

import lombok.Getter;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@Setter
@Getter
public class Car {
    private final String name;
    private final String model;
    private final double price;
    private final int productionYears;
    private final List<Manufacturer> manufacturers;
    private final EngineType engineType;

    public Car(String name, String model, double price, int productionYears, List<Manufacturer> manufacturers, EngineType engineType) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.productionYears = productionYears;
        this.manufacturers = manufacturers;
        this.engineType = engineType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(car.price, price) == 0 && productionYears == car.productionYears && Objects.equals(name, car.name) && Objects.equals(model, car.model) && Objects.equals(manufacturers, car.manufacturers) && Objects.equals(engineType, car.engineType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, model, price, productionYears, manufacturers, engineType);
    }
}
