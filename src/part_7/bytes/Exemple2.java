package part_7.bytes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exemple2 {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        char c;
        System.out.println("Нажмите ctrl+D для выхода");
        do {
            c = (char) reader.read();
            System.out.println(c);
        } while (c != '\uFFFF');

    }
}
