package part_5.simple;

public class SimpleGeneric<T> {

    T genericField;

    public SimpleGeneric() {
    }

    public SimpleGeneric(T genericField) {
        this.genericField = genericField;
    }

    public void print() {
        System.out.println(genericField);
    }

    public void getType() {
        System.out.println(genericField.getClass().getName());
    }
}
