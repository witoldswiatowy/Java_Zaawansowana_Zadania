package pl.sdacademy.java.advanced.exercieses.day1.Task7;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class WeaponMagazineTest {
    private WeaponMagazine weaponMagazine;

    @BeforeEach
    void initData (){
        weaponMagazine = new WeaponMagazine(5);
    }

    @Test
    void shouldBePossibleToAddNewBulletWhenMagazineIsNotFull(){
       //when
        weaponMagazine.loadBullet("pocisk_1");
       //then
        assertThat(weaponMagazine.isLoaded()).isTrue();
    }

    @Test
    void shouldReturnFalseIfMagizineIsEmpty(){
        //when
        boolean result = weaponMagazine.isLoaded();
        //then
        assertThat(result).isFalse();
    }

    @Test
    void shouldBeNotPossibleToAddNewBulletWhenMagazineIsNotFull(){
        //given
        weaponMagazine.loadBullet("pocisk_1");
        weaponMagazine.loadBullet("pocisk_2");
        weaponMagazine.loadBullet("pocisk_3");
        weaponMagazine.loadBullet("pocisk_4");
        weaponMagazine.loadBullet("pocisk_5");
//        //when
//        weaponMagazine.loadBullet("pocisk_6"));
//        //then
//        assertThat(weaponMagazine.isLoaded()).isTrue();
        //then
        assertThatThrownBy(() -> weaponMagazine.loadBullet("pocisk_6"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("Magazine is full"); // to jest juz opcjonalne
    }

    @Test
    void shouldBePossibleToShotWhenMagazineInNotEmpty () {
        //given
        weaponMagazine.loadBullet("pocisk_1");
        weaponMagazine.loadBullet("pocisk_2");
        weaponMagazine.loadBullet("pocisk_3");
        //when
        String result = weaponMagazine.shot();
        //then
        assertThat(result).isEqualTo("pocisk_3");
    }

    @Test
    void shouldNotBePossibleToShotWhenMagazineInEmpty () {
        //given
        String expectedResult = "Pusty magazynek";
        //when
        String result = weaponMagazine.shot();
        //then
        assertThat(result).isEqualTo(expectedResult);
    }

    @Test
    void shouldNotBePossibleToShotWhenMagazineInEmpty2 () {
        //given
        weaponMagazine.loadBullet("pocisk_1");
        weaponMagazine.loadBullet("pocisk_2");
        weaponMagazine.loadBullet("pocisk_3");
        //when
        weaponMagazine.shot();
        weaponMagazine.shot();
        weaponMagazine.shot();
        //then
        assertThat(weaponMagazine.isLoaded()).isFalse();
    }
}