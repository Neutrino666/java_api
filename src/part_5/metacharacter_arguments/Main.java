package part_5.metacharacter_arguments;

public class Main {

    public static void main(String[] args) {
        Integer integers[] = {1, 2, 3, 4, 5};
        Stats<Integer> first = new Stats<>(integers);

        Float floats[] = {1.0f, 2.0f, 3.0f, 4.0f, 5.0f};
        Stats<Float> second = new Stats<>(floats);

        if (first.sameAvg(second)) {
            System.out.println("equals");
        }

    }
}
