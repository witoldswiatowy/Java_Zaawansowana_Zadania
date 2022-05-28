package pl.sdacademy.java.advanced.exercieses.day2.Task20_21;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.within;

class Shape3DTest {

    @Test
    void shouldCalculateValueForCube(){
        //given
        Shape3D cube = new Cube(2);
        //when
        double result = cube.calculateVolume();
        //then
        assertThat(result).isEqualTo(8);
    }
    @Test
    void shouldCalculateValueForCone(){
        //given
        Shape3D cone = new Cone(2,4);
        //when
        double result = cone.calculateVolume();
        //then
        assertThat(result).isCloseTo(16.75, within(0.01));
    }

    @Test
    void shouldCheckFillMethod(){
        //given
        Shape3D cube = new Cube(2);
        //when
        int result = cube.fill(8);
        //then
        assertThat(result).isEqualTo(0);
    }
    @Test
    void shouldCheckFillMethod_2(){
        //given
        Shape3D cube = new Cube(2);
        //when
        int result = cube.fill(10);
        //then
        assertThat(result).isEqualTo(1);
    }
    @Test
    void shouldCheckFillMethod_3(){
        //given
        Shape3D cube = new Cube(2);
        //when
        int result = cube.fill(2);
        //then
        assertThat(result).isEqualTo(-1);
    }
}