package part_5.generic_constructors;

public class GenericConstructor {

    private double value;

    <T extends Number> GenericConstructor(T newValue) {
        value = newValue.doubleValue();
    }

    void showValue() {
        System.out.println(value);
    }
}
