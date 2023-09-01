package part_8;

public class Example5 {

    public static void main(String[] args) {

        char[] array = {'a', 'b', 'c', 'd', 'e'};
        String s = new String(array, 2,array.length - 4);
        System.out.println(s);
        String newString = new String(array);
        System.out.println(newString);

    }
}