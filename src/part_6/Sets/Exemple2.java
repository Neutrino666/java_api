package part_6.Sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Exemple2 {

    public static void main(String[] args) {
//        Comparator1 comparator1 = new Comparator1();
//        Set<User> set = new TreeSet<>(comparator1);
        Comparator2 comparator2 = new Comparator2();
        Set<User> set = new TreeSet<>(comparator2);
        set.add(new User("Anna", 23));
        set.add(new User("Victor", 2));
        set.add(new User("Inna", 3223));
        set.add(new User("Nick", 231));
        set.add(new User("Max", 5));

        System.out.println(set);

    }
}
