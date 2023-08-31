package part_5.simple;

public class Main {

    public static void main(String[] args) {
        // Обобщения гарантируют сохранность типов
//        NonGenericClass nonGenericClass = new NonGenericClass("Hello");
//
//        SimpleGeneric<String> genericClass = new SimpleGeneric<>("Hello");
//        SimpleGeneric<Integer> genericClass1 = new SimpleGeneric<>(12);
//        SimpleGeneric<Float> genericClass2 = new SimpleGeneric<>(12F);
//
//        genericClass.getType();
//        genericClass1.getType();
//        genericClass2.getType();

//        TwoGenericTypes<Character, Double> twoGenericTypes = new TwoGenericTypes<>('h', 1.);
//        twoGenericTypes.showTypes();
//        twoGenericTypes.print();

        // Object не гарантирует сохранность типов. Пример:
        NonGenericClass first = new NonGenericClass(true);
        NonGenericClass second = new NonGenericClass(10L);
        second = first;
        int v = (byte) second.firstField;

    }
}
