package pl.sdacademy.java.advanced.exercieses.day2.Task16;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RunnerTest {

    @Test
    void shouldReturnIntermediateForGivenTimeOf200(){
        //when
        Runner result = Runner.getFitnessLevel(200);
        //then
        assertThat(result).isEqualTo(Runner.INTERMEDIATE);
//        Assertions.assertEquals(Runner.INTERMEDIATE, result);
    }
    @Test
    void shouldNotReturnIntermediateForGivenTimeOf300(){
        //then
        Assertions.assertThrows(IllegalArgumentException.class, () -> Runner.getFitnessLevel(1000));
    }
}