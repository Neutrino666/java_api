package part_7.files;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Example3 {

    public static void main(String[] args) {
        File file = new File("./");
        List<String> list = Arrays.asList(file.list());
        list.spliterator().forEachRemaining(item -> System.out.println(item));
        System.out.println(file.isFile());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());
        Arrays.stream(file.list()).spliterator().forEachRemaining(item -> System.out.println(item));
    }
}
