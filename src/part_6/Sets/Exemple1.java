package part_6.Sets;

import java.util.*;

public class Exemple1 {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
//        Set<Integer> set = new LinkedHashSet<>();
        set.add(9);
        set.add(2);
        set.add(7);
        set.add(4);
        set.addAll(Set.of(5, 6));
        System.out.println(set);
        System.out.println(set.contains(1));
        System.out.println(set.containsAll(Set.of(6, 1)));
        System.out.println(set.isEmpty());
        set.remove(1);
        set.removeAll(Set.of(4,6));
        System.out.println(set);
        System.out.println(set.add(7));

        System.out.println(set);
        System.out.println(set);
        System.out.println(set);

        for (Integer item : set) {
            System.out.println(item );
        }
        System.out.println("\n\n");

        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
//            iterator.remove();   // Удалит из set value
        }

        System.out.println(set);
//        System.out.println("\n\n");
//        Spliterator<Integer> spliterator = set.spliterator();
//        spliterator.forEachRemaining(item -> System.out.println(item - 2));


    }
}
