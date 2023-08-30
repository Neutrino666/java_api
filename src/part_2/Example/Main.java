package part_2.Example;

import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        int a = 1;
        int b = a;
        a = 2;
        System.out.println("Значение переменной а " + a);
        System.out.println("Значение переменной b " + b);

        ClassA classA1;
        ClassA classA2;
        classA1 = new ClassA();
        classA2 = classA1;
        System.out.println("classA1 - " + classA1.firstField);
        System.out.println("classA2 - " + classA2.firstField);
        classA1.firstField = 2;
        System.out.println("classA1 - " + classA1.firstField);
        System.out.println("classA2 - " + classA2.firstField);
    }
}
