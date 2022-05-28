package pl.sdacademy.java.advanced.exercieses.day1.Task20_21;

public class Cone extends Shape3D{
    private final int r;
    private final int h;

    public Cone(int r, int h) {
        this.r = r;
        this.h = h;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * Math.PI * r;
    }

    @Override
    protected double calculateVolume() {
        return (Math.PI * r*r)/3*h;
    }
}
