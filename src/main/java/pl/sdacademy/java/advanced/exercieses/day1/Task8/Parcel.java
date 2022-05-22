package pl.sdacademy.java.advanced.exercieses.day1.Task8;


import lombok.Getter;

@Getter
public class Parcel {

    private int xLenght;
    private int yLenght;
    private int zLenght;
    private float weight;
    private boolean isExpress;

    public Parcel(int xLenght, int yLenght, int zLenght, float weight, boolean isExpress) {
        this.xLenght = xLenght;
        this.yLenght = yLenght;
        this.zLenght = zLenght;
        this.weight = weight;
        this.isExpress = isExpress;
    }
}
