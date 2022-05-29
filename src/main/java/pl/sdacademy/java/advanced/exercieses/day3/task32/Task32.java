package pl.sdacademy.java.advanced.exercieses.day3.task32;

import java.io.*;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class Task32 {
    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advanced/exercieses/day3/task32");
        Path inputFile = dirPath.resolve("cars.txt");

        List<Car> cars = List.of(
                new Car("Volvo", 300_000, true),
                new Car("GLS", 100_000, false),
                new Car("x500", 50_000, false)
        );

//        save(inputFile,cars);
        List<Car> result = load(inputFile);
        System.out.println(result);
        System.out.println(result.size());

    }

    private static void save (Path inputFile, List<Car> content){

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(inputFile.toFile()))) {
//            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(inputFile.toFile())); //chowamy to do bloku linijke wyzej try Or Reasorchers i to juz zamyka streama
            oos.writeObject(content);
        } catch (IOException e) {
            System.out.println("Exception during save file: " + e );
        }
    }

    private static List<Car> load (Path file){
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file.toFile()))) {
            return  (List<Car>) ois.readObject();
        } catch (IOException e) {
            System.out.println("Exception during opening file: " + e);
        } catch (ClassNotFoundException e) {
            System.out.println("Exception during creating list of cars: " + e);
        }
        return Collections.emptyList();
    }

}
