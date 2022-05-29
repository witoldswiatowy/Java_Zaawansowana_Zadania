package pl.sdacademy.java.advanced.exercieses.day3.task30;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Task30 {
    public static void main(String[] args) {
        Path dirPath = Path.of("src/main/java/pl/sdacademy/java/advanced/exercieses/day3/task30");
        Path inputeFile = dirPath.resolve("course.txt");

        if (!inputeFile.toFile().exists()){
            System.out.println("File not exist!");
            return;
        }

        List<String> contents = new ArrayList<>();
        try {
            contents = getFileContents(inputeFile);
        } catch (IOException e) {
            System.out.println("Exception during opening file: " + e);
        }
        List<String> reservedContents = reverseFileContents(contents);
        Path outputFile = reverseFileName(inputeFile);
        System.out.println(outputFile);

    }

    private static List<String>getFileContents (Path inputeFile) throws IOException {
        return Files.readAllLines(inputeFile);
    }

    private static List<String>reverseFileContents (List<String> content){
        return content.stream()
//                .map(s -> new StringBuilder(s).reverse().toString())        //możemy tu podać metody która wyciagniemy i wpakowac tu duza logige
//                .map(s -> reversString(s))                                  //a to jeszcze do method reference
                .map(Task30::reversString)
                .collect(Collectors.toList());
    }

    private static String reversString(String s) {
        return new StringBuilder(s).reverse().toString();
    }

    private static Path reverseFileName (Path inputFile){
        String fileName = inputFile.toFile().getName();
        String fileExtension = "";
        int index = fileName.indexOf(".");
        if (index > 0){      //jeżeli większe od zero to mamy rozszerzenie
            fileExtension = fileName.substring(index); //.txt
            fileName = fileName.substring(0, index); //course
        }
        String reversedInputFile = new StringBuilder(fileName)
                .reverse()
                .append(fileExtension)
                .toString();
        return inputFile.getParent().resolve(reversedInputFile);
    }
}
