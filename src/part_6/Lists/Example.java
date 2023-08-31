package part_6.Lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Spliterator;

public class Example {

    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add("1 элемент");
//        list.add("2 элемент");
//        list.add("3 элемент");
//        System.out.println(list);
//        list.addAll(List.of("4 элемент", "5 элемент"));
//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.get(1));
//        list.remove("3 элемент");
//        System.out.println(list.size());
//        System.out.println(list);
//        list.removeAll(List.of("1 элемент", "2 элемент"));
//        System.out.println(list + "\n" + list.size());
//        System.out.println(list.contains("4 элемент"));
//        System.out.println(list.containsAll(List.of("4 элемент", "5 элемент")));
//        System.out.println(list.isEmpty());
//        list.clear();
//        System.out.println(list.isEmpty());
//        System.out.println(list);
//        list.addAll(List.of("1 элемент", "1 элемент", "1 элемент"));
//        System.out.println(list);
//        Object[] objArray = list.toArray();
//        String[] strArray = list.toArray(new String[0]);
//        System.out.println(objArray);
//        System.out.println(strArray);

        List<String> list = new ArrayList<>();
        list.add("1 элемент");
        list.add("2 элемент");
        list.add("3 элемент");
        System.out.println(list);
        list.addAll(List.of("4 элемент", "5 элемент"));

//        for(String item : list) {
//            System.out.println(item);
//        }

//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        Spliterator<String> spliterator = list.spliterator();
//        while (spliterator.tryAdvance(item -> System.out.println(item)));
        spliterator.forEachRemaining(item -> System.out.println(item.length()));

    }
}
