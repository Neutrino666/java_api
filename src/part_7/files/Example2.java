package part_7.files;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Example2 {

    public static void main(String[] args) {

        int input;

        try (FileInputStream inputStream = new FileInputStream("textFile.txt");
             FileOutputStream outputStream = new FileOutputStream("copyToFile.txt")) {

            do {
                input = inputStream.read();
                if (input != -1) {
                    outputStream.write(input);
                }
            } while (input != -1);
        } catch (IOException e) {
            System.out.println("Ошибка ввода вывода");
        }
    }
}
