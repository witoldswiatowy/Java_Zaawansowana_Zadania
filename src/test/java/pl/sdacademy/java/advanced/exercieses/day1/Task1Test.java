package pl.sdacademy.java.advanced.exercieses.day1;

import org.junit.jupiter.api.Test;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;

class Task1Test {
    private final static List<String> UNSORTED = List.of("A", "B", "Z", "C", "D");
    private final static List<String> SORTED = List.of("Z", "D", "C", "B", "A");

    @Test
    void shouldReverseListOfString_usingAnonymousClass() {
        //When
        List<String> result = Task1.sortUsingAnonymousClass(UNSORTED);

        //then
        assertThat(result).isEqualTo(SORTED);
    }

    @Test
    void shouldReverseListOfString_usingMyOwnComparator() {
        //When
        List<String> result = Task1.sortUsingMyOwnComparator(UNSORTED);

        //then
        assertThat(result).isEqualTo(SORTED);
    }

    @Test
    void shouldReverseListOfString_usingStream() {
        //When
        List<String> result = Task1.sortUsingStream(UNSORTED);

        //then
        assertThat(result).isEqualTo(SORTED);
    }


}