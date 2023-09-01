package part_8;

import part_8.func_interfaces.FirstInterface;
import part_8.func_interfaces.SecondInterface;
import part_8.func_interfaces.ThridInterface;

public class Main {

    public static void main(String[] args) {

//        // Реализация с помощью лямбда выражения. Т.к. в данном случае сигнатура совпадает - данный код корректен.
//        FirstInterface firstInterface = () -> System.out.println("Hello world");
//        firstInterface.simpleMethod();
//
//        SecondInterface secondInterface = () -> (5 * 100 / 50 * 5) % 11;
//        System.out.println(secondInterface.simpleMethod());
//
//        ThridInterface thridInterface = (string) -> string.length();
//        System.out.println(thridInterface.simpleMethod("test"));
//
//        ThridInterface thridInterface1 = string -> {
//            System.out.printf("В качестве параметра пришла строка: '%s'", string);
//            return string.length();
//        };
//        thridInterface1.simpleMethod("некоторый текст");

        // 2ой пример
        ThridInterface thridInterface = string -> string.length();
        lambdaParameter(thridInterface, "test test");
        lambdaParameter(string -> string.length() + 10, "test test");


    }

    public static void lambdaParameter(ThridInterface thridInterface, String string) {
        System.out.println(thridInterface.simpleMethod(string));
    }
}
