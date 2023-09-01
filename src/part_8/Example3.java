package part_8;

import java.util.function.Supplier;

public class Example3 {

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello world!";
        System.out.println(supplier.get());
    }
}
