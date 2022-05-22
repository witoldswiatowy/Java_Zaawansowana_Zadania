package pl.sdacademy.java.advanced.exercieses.day1.Task8;

public class ParcelValidator implements Validator {

    private final int MAX_VOLUME = 300;
    private final int MIN_LENGHT = 30;

    @Override
    public boolean validate(Parcel input) {
        if (validatePerVolume(input) && validatePerLenght(input) && validatePerWeight(input)) {
            return true;
        } else {
            System.out.println("Paczka nie spełnia wymagań");
            return false;
        }
    }

    private boolean validatePerVolume(Parcel input) {
        return input.getXLenght() + input.getYLenght() + input.getZLenght() <= MAX_VOLUME;
    }

    private boolean validatePerLenght(Parcel input) {
        return input.getXLenght() >= MIN_LENGHT
                && input.getYLenght() >= MIN_LENGHT
                && input.getZLenght() >= MIN_LENGHT;
    }

    private boolean validatePerWeight(Parcel input) {
        if (!input.isExpress()) {
            return input.getWeight() < 30.0f;
        } else {
            return input.getWeight() < 15.0f;
        }
    }
}

