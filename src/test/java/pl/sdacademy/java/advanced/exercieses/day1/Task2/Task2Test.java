package pl.sdacademy.java.advanced.exercieses.day1.Task2;



import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Task2Test {
    private final static List<String> UNSORTED = List.of("A", "B", "b", "Z", "d", "C");
    private final static List<String> EXPECTED_RESULT = List.of("Z", "d", "C", "B", "b", "A");

    @Test
    void shouldReverseListOfStringsIgnoringCaseSensitive() {
        //when
        List<String> result = Task2.sortingMethod(UNSORTED);
        //then
        assertThat(result).isEqualTo(EXPECTED_RESULT);
    }

//    List<String> tmpList;
//
//    @BeforeEach
//            tmpList = new ArrayList <String>;
//        tmpList.add("Bdamz");
//        tmpList.add("bdamd");
//        tmpList.add("Bdamc");
//        tmpList.add("adamb");
//        tmpList.add("Adama");
//
//    @Test
//    void shouldSortedList ()


}