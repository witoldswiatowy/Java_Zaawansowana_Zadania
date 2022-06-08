package pl.sdacademy.java.advanced.exercieses.day2.task18;

import lombok.Getter;
import lombok.Setter;

import java.util.Objects;

@Getter
@Setter
public class Computer {
    private String procesor;
    private String ram;
    private String graphic;
    private String company;
    private String model;

    public Computer(String procesor, String ram, String graphic, String company, String model) {
        this.procesor = procesor;
        this.ram = ram;
        this.graphic = graphic;
        this.company = company;
        this.model = model;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Computer computer = (Computer) o;
        return Objects.equals(procesor, computer.procesor) && Objects.equals(ram, computer.ram) && Objects.equals(graphic, computer.graphic) && Objects.equals(company, computer.company) && Objects.equals(model, computer.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(procesor, ram, graphic, company, model);
    }

    @Override
    public String toString() {
        return "Computer{" +
                "procesor='" + procesor + '\'' +
                ", ram='" + ram + '\'' +
                ", graphic='" + graphic + '\'' +
                ", company='" + company + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
