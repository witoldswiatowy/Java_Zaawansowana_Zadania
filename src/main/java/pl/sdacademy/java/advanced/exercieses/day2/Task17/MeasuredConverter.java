package pl.sdacademy.java.advanced.exercieses.day2.Task17;

public class MeasuredConverter {

    public static double convert(double value, ConversionType conversionType){
        return conversionType.getConverter().apply(value);
    }
    public static double convert(double value, ConversionTypeOldSchool conversionType){
        return conversionType.getValue()*value;
    }
}
