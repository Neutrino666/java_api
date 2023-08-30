package part_3;

public class MyFirstClass {

    private int number = 1;
    char letter = 'a';
    private boolean condition = true;
    String string = "Hello world";

    public MyFirstClass() {
    }

    public MyFirstClass(int number, char letter, boolean condition, String string) {
        this.number = number;
        this.letter = letter;
        this.condition = condition;
        this.string = string;
    }

    public MyFirstClass(char letter) {
        this.letter = letter;
    }

    void printInConsole() {
        System.out.println(number);
        System.out.println(letter);
        System.out.println(condition);
        System.out.println(string);
    }

    void incrementFieldNumber(int num) {
        this.number += num;
    }

    public int getNumber() {
        return number;
    }
}
