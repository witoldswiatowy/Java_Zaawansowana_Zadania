package pl.sdacademy.java.advanced.exercieses.day1.Task20_21;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class ShapeTest {

    @Test
    void shouldCalculetPerimeterForTraingle(){
        //given
        Shape triangle = new Triangle(2,4,5);
        //when
        double result = triangle.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(11);
    }
    @Test
    void shouldCalculetPerimeterForHexagon(){
        //given
        Shape hexagon = new Hexagon(2);
        //when
        double result = hexagon.calculatePerimeter();
        //then
        assertThat(result).isEqualTo(12);
    }


}