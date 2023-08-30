package part_3;

import java.io.IOException;

public class Main {

//    public static void main(String[] args) {
////        MyFirstClass firstClass = new MyFirstClass();
////        firstClass.printInConsole();
////        firstClass.incrementFieldNumber(10);
//////        firstClass.printInConsole();
////        System.out.println("Значение поля number " + firstClass.getNumber());
//
//        MyFirstClass firstClass = new MyFirstClass('a');
//        MyFirstClass secondClass = new MyFirstClass(3, 'b', false, "Тест 2");
//        System.out.println(firstClass.getNumber());
//        System.out.println(secondClass.getNumber());
//        System.out.println(firstClass.letter);
//        System.out.println(secondClass.letter);
//
//    }

//    public static void main(String[] args) throws IOException {
//        throw new IOException("текст нашего сообщения об ошибке");
//    }

    public static void main(String[] args) {
        try {
            System.out.println(7 / 0);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка - " + e.getMessage());
        } finally {
            System.out.println("обязательное действие после try");
        }
    }
}
