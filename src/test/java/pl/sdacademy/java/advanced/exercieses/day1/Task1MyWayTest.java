package pl.sdacademy.java.advanced.exercieses.day1;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class Task1MyWayTest {
    private final static List<String> UNSORTED = List.of("A", "B", "Z", "C", "D");
    private final static List<String> SORTED = List.of("Z", "D", "C", "B", "A");

    @Test
    void shouldReverseListOfString_usingAnonymousClass() {
        //When
        List<String> result = Task1.sortUsingAnonymousClass(UNSORTED);

        //then
        assertThat(result).isEqualTo(SORTED);
    }

}