package pl.sdacademy.java.advanced.exercieses.day3.task29;

//        Zaimplementuj generyczną metodę partOf,
//        która na podstawie tablicy dowolnego typu oraz
//        wskazanej funkcji jako parametrów zwróci % elementów spełniających warunek.

import java.util.Collection;
import java.util.function.Predicate;

public class Task29<T> {

    public static <T> double partOf(Collection<T> collection, Predicate<T> predicate){
        long count = collection.stream()
                .filter(predicate)
                .count(); //zwraca liczbę elementów w strumieniu
        return 100.0 * count / collection.size();
    }

}
