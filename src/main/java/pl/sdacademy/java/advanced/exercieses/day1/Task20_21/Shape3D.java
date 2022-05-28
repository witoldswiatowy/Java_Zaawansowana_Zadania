package pl.sdacademy.java.advanced.exercieses.day1.Task20_21;

public abstract class Shape3D extends Shape implements Fillable {
    protected abstract double calculateVolume();

    @Override
    public int fill(int value) {
        double maxVolume = calculateVolume();
        if (value > maxVolume) {
            return 1;
        } else if (value < maxVolume) {
            return -1;
        }
            return 0;
    }
}
