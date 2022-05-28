package pl.sdacademy.java.advanced.exercieses.day2.Task24;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pl.sdacademy.java.advanced.exercieses.day2.Task24.exceptions.BasketEmptyException;
import pl.sdacademy.java.advanced.exercieses.day2.Task24.exceptions.BasketFullException;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class BasketTest {
    private Basket basket;

    @BeforeEach
    void init () {
        basket = new Basket();
    }

    @Test
    void shouldNotBePossibleToAddNewItemWhenBasketIsFull(){
        //given
        initData();
        //when && then
        assertThatThrownBy(() -> basket.add())
                .isInstanceOf(BasketFullException.class)
                .hasMessage("Too many items int the basket!");
    }

    @Test
    void shouldNotBePossibleToRemoveItemWhenBasketIsEmpty(){
        //when && then
        assertThatThrownBy(() -> basket.remove())
                .isInstanceOf(BasketEmptyException.class)
                .hasMessage("Can't remove from empty basket");
    }

    private void initData() {
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
        basket.add();
    }

}