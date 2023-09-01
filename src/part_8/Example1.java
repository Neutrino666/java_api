package part_8;

import part_8.func_interfaces.ThridInterface;

import java.util.function.Predicate;

public class Example1 {

    public static void main(String[] args) {

        Predicate<Integer> predicate = integer -> integer > 6;
        System.out.println(predicate.test(7));
        System.out.println(predicate.test(1));
    }
}
