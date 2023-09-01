package part_7.files;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Example {

    public static void main(String[] args) {

        int input;
        FileInputStream fileStream;
        try {

            fileStream = new FileInputStream("src/textFile.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Данный файл не был найден в системе");
            System.out.println(e);
            return;
        }

        try {
            do {
                input = fileStream.read();
                if (input != -1) {
                    System.out.println((char) input);
                }
            } while (input != -1);
        } catch (IOException e) {
            System.out.println("Ошибка чтения из файла");
        } finally {
            try {
                fileStream.close();
            } catch (IOException e) {
                System.out.println("Ошибка закрытия файла");
            }
        }

    }
}
