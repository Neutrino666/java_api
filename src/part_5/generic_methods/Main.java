package part_5.generic_methods;

public class Main {

    public static void main(String[] args) {

        GenericMethod genericMethod = new GenericMethod();
        Integer integers[] = {1, 2, 3, 4, 5,};
        Double doubles[] = {1., 2., 3., 4., 5.};
        String strings[] = {"a", "b", "abc", "abcd"};

        System.out.println(genericMethod.isIn(1, integers));
        System.out.println(genericMethod.isIn(1.0, doubles));
        System.out.println(genericMethod.isIn("abc", strings));

    }
}
