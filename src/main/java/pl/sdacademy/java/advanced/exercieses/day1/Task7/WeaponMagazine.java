package pl.sdacademy.java.advanced.exercieses.day1.Task7;

import java.util.ArrayDeque;
import java.util.Deque;

public class WeaponMagazine {
    private Deque<String> weaponMagazine;
    private final int maxNumberOfBulletInMagazine;

    public WeaponMagazine(int capacity) {
        weaponMagazine = new ArrayDeque<>();
        maxNumberOfBulletInMagazine = capacity;
    }

    public void loadBullet(String bullet) {
        if (maxNumberOfBulletInMagazine == weaponMagazine.size()) {
            throw new IllegalArgumentException("Magazine is full");
        }
        weaponMagazine.push(bullet);
    }

    public boolean isLoaded(){
        return !weaponMagazine.isEmpty();
    }

  public String shot() {
//        if (isLoaded()){
//            return weaponMagazine.pop();
//        }
//        return "Pusty magazynek";
      return isLoaded() ? weaponMagazine.pop() : "Pusty magazynek";
  }

}
