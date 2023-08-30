package part_4.inheritance;

public class Main {

    public static void main(String[] args) {
//        Cat cat = new Cat("white");
//        System.out.println(cat.isAlive);
//        System.out.println(cat.furColor);
//        cat.walk();
//        cat.colorFromParent();
//        cat.walkFromParent();

//        Mammals cat = new Cat("Black");
//        Mammals dog = new Dog("Brown");
//
//        cat.walk();
//        dog.walk();

        SomeClass someClass = new ClassA();
        someClass.method1();
        someClass.fromAbstractClass();
        System.out.println(someClass.a);

    }
}
