package pl.sdacademy.java.advanced.exercieses.day2.task19;

import lombok.Getter;
import lombok.Setter;
import pl.sdacademy.java.advanced.exercieses.day2.task18.Computer;

import java.util.Objects;

@Getter
@Setter
public class Laptop extends Computer {
    private int batery;

    public Laptop(String procesor, String ram, String graphic, String company, String model, int batery) {
        super(procesor, ram, graphic, company, model);
        this.batery = batery;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Laptop laptop = (Laptop) o;
        return batery == laptop.batery;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), batery);
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "procesor='" + getProcesor() + '\'' +
                ", ram='" + getRam() + '\'' +
                ", graphic='" + getGraphic() + '\'' +
                ", company='" + getCompany() + '\'' +
                ", model='" + getModel() + '\'' +
                "batery=" + batery +
                '}';
    }
}
