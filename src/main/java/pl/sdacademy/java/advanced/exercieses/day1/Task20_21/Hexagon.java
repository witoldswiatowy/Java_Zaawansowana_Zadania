package pl.sdacademy.java.advanced.exercieses.day1.Task20_21;

public class Hexagon extends Shape {
    private final int a;

    public Hexagon(int a) {
        this.a = a;
    }

    @Override
    protected double calculatePerimeter() {
        return 6 * a;
    }
}
