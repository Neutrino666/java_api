package part_8;

import java.util.function.Consumer;

public class Example4 {

    public static void main(String[] args) {
        Consumer<Integer> consumer = integer -> System.out.println(integer);
        consumer.accept(5);
    }
}
