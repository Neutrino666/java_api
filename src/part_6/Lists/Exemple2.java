package part_6.Lists;

import java.util.LinkedList;

public class Exemple2 {

    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("first");
        list.add("second");
        list.add("third");
        list.addFirst("fourth");
        list.addLast("fifth");
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

    }
}
