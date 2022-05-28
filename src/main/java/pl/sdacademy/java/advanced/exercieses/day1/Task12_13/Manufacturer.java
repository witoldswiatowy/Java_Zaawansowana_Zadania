package pl.sdacademy.java.advanced.exercieses.day1.Task12_13;

import lombok.Getter;

import java.util.Objects;

@Getter
public class Manufacturer {
    private final String name;
    private final int foundedInYear;
    private final String country;

    public Manufacturer(String name, int foundedInYear, String country) {
        this.name = name;
        this.foundedInYear = foundedInYear;
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manufacturer that = (Manufacturer) o;
        return foundedInYear == that.foundedInYear && Objects.equals(name, that.name) && Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, foundedInYear, country);
    }
}
