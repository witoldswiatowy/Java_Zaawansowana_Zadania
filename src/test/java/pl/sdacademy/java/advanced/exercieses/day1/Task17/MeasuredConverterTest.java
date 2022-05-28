package pl.sdacademy.java.advanced.exercieses.day1.Task17;

import org.junit.jupiter.api.Test;

import java.nio.file.LinkPermission;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;
import static org.junit.jupiter.api.Assertions.*;

class MeasuredConverterTest {

    @Test
    void shouldConvertMeterToYards() {
        //given
        double initialValue = 20.0;
        //when
        double result = MeasuredConverter.convert(initialValue, ConversionType.METERS_TO_YARD);
        //then
        assertThat(result).isCloseTo(21.87,within(0.01));
    }

    @Test
    void shouldConvertMeterToYardsByOldSchool() {
        //given
        double initialValue = 20.0;
        //when
        double result = MeasuredConverter.convert(initialValue, ConversionTypeOldSchool.METERS_TO_YARD);
        //then
        assertThat(result).isCloseTo(21.87,within(0.01));
    }
}