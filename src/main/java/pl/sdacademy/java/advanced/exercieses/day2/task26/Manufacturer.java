package pl.sdacademy.java.advanced.exercieses.day2.task26;

import lombok.Getter;

@Getter
public class Manufacturer {
    private final String name;
    private final int foundedInYear;

    public Manufacturer(String name, int foundedInYear) {
        this.name = name;
        this.foundedInYear = foundedInYear;
    }

    @Override
    public String toString() {
        return "Manufacturer{" +
                "name='" + name + '\'' +
                ", foundedInYear=" + foundedInYear +
                '}';
    }
}
