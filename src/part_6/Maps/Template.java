package part_6.Maps;

import java.util.*;

public class Template {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        map.remove(2);
        System.out.println(map);
        map.clear();
        System.out.println(map.isEmpty());
        map.putAll(Map.of(1,"one", 2, "two", 3, "three"));
        System.out.println(map);

        Set<Integer> set = map.keySet();
        set.spliterator().forEachRemaining(item -> System.out.println(item));

        Collection<String> list = map.values();
        System.out.println(list);

        for(Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.printf("%s %s\n", entry.getKey(), entry.getValue());
        }
    }
}
