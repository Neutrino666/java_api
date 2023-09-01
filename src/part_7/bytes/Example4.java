package part_7.bytes;

import java.io.PrintWriter;

public class Example4 {

    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out, true);
        writer.println("Это строка");
        int a = 7;
        writer.println(a);
        double d = 3.;
        writer.println(d);
    }
}
