package part_8;

import java.util.function.Function;

public class Example2 {

    public static void main(String[] args) {

        Function<String, Integer> function = string -> string.length();
        System.out.println(function.apply("test"));
    }
}
