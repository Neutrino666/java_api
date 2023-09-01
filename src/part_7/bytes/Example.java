package part_7.bytes;

import java.io.IOException;

public class Example {

    public static void main(String[] args) throws IOException {

        int input = System.in.read();
        System.out.println(input);
        System.err.println((char) input);

    }
}
