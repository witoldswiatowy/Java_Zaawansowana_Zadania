package pl.sdacademy.java.advanced.exercieses.day2.Task20_21;

public class Cube extends Shape3D {
    private final int a;


    public Cube(int a) {
        this.a = a;
    }

    @Override
    protected double calculatePerimeter() {
        return 12*a;
    }

    @Override
    protected double calculateVolume() {
//        return a * a * a;
        return Math.pow(a,3);
    }


}
