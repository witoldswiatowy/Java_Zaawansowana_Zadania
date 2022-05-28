package pl.sdacademy.java.advanced.exercieses.day2.Task20_21;

public class Triangle extends Shape {

    private final int a;
    private final int b;
    private final int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    protected double calculatePerimeter() {
        return a + b + c;
    }
}
