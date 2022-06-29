package pl.sdacademy.java.advanced.exercieses.day3.task31;

//      Zadanie 31:
//      Napisz program, który policzy wystąpienia każdego słowa w pliku tekstowym
//      a następnie wyniki zapisze w formie tabelki w nowym pliku.

    //Pomysł:
    //najpierw odczyt wszystkich słów z pliku
    //kazde nowe slowo jest oddzielone spacją
    //pobiera pierwsze slowo i sprawdza ile razy sie powtarza
    //zapisanie slowa i liczby powtorzen do mapy, obiektu z dwoma polami, listy
    //pobranie kolejnego slowa ktore nie znajduje sie na nowo budowanym pliku
    //sprawdzenie ostatniego pliku
    //DRUGA WERSJA: po pobraniu słowa przy sprawdzaniu ile razy slowo się powtórzyło byly by na bierzaco usuwane, tylko wtedy streamu nie zastosuje

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Task31 {
    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advanced/exercieses/day3/task31");
        Path inputeFile = dirPath.resolve("Manuscript.txt");

        if (!inputeFile.toFile().exists()){
            System.out.println("File not exist!");
            try {
                Files.createFile(inputeFile);
                System.out.println("File: " + inputeFile.getFileName() + " is create");
            } catch (IOException e) {
                System.out.println("File can not create " + e);
                e.printStackTrace();
            }
        }

        if(inputeFile.toFile().exists()){
            System.out.println("File exist");
            try {
                Writer writer = new FileWriter(inputeFile.toString(), true);
                writer.write("message\n");
//                writer.flush(); //zapisuje dane z buffora, ale nie zamyka strumienia, mozna dalej zapisywać kolejne zmiany
                writer.close(); //również zapisuje dane, chyba nawet wywołuje flush i zamyka strumien. Ale podobno gubi pewne dane
            } catch (IOException e) {
                e.printStackTrace();
            }

        }



        List <String> content = new ArrayList<>();
        try {
            content = Files.readAllLines(inputeFile);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("Exception during opening file: " + e);
        }


    }

    public static int howManyWordInText(String word) {

        return 0;
    }

}


