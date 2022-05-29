package pl.sdacademy.java.advanced.exercieses.day3.task27;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class JoinerTest {

    @Test
    void shouldReturnCorectStringFromStrings(){
        //given
        Joiner <String> joiner = new Joiner<>("+");
        String expectedResult = "a+b+c+d";
        //when
        String result = joiner.join("a", "b", "c", "d");
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorectStringFromIntiger(){
        //given
        Joiner <Integer> joiner = new Joiner<>("|");
        String expectedResult = "1|2|3|4";
        //when
        String result = joiner.join(1,2,3,4);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldReturnCorectStringFromFloat(){
        //given
        Joiner <Float> joiner = new Joiner<>("-");
        String expectedResult = "2.0-5.0";
        //when
        String result = joiner.join(2.0f,5.0f);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

}