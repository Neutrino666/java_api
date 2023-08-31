package part_6.Sets;

import java.util.Comparator;

public class Comparator2 implements Comparator<User> {
    @Override
    public int compare(User o1, User o2) {
        return o1.name.compareTo(o2.name);
    }
}
