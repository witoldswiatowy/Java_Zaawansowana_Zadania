package pl.sdacademy.java.advanced.exercieses.day2.Task20_21;

public class Rectangle extends Shape{

    private final int a;
    private final int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    protected double calculatePerimeter() {
        return (2*a) + (2*b);
    }
}
