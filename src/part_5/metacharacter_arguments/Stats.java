package part_5.metacharacter_arguments;

public class Stats<T extends Number> {

    T[] numbers;

    public Stats(T[] numbers) {
        this.numbers = numbers;
    }

    double aversge() {
        double sum = 0.0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i].doubleValue();
        }
        return sum / numbers.length;
    }

    boolean sameAvg(Stats<?> object) {
        if (aversge() == object.aversge()) {
            return true;
        }
        return false;
    }
}
