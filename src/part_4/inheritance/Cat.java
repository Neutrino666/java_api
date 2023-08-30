package part_4.inheritance;

public class Cat extends  Mammals {

    String furColor = "black";
    String name;
    int age;

    public Cat() {
        this("Мурзик", 5, "brown");
    }

    public Cat(String furColor) {
        super(furColor);
    }

    public Cat(String name, int age, String furColor) {
        super(furColor);
        this.name = name;
        this.age = age;
    }

    @Override
    public void walk() {
        System.out.println("Кошка идёт");
    }

    public void colorFromParent() {
        System.out.println(super.furColor);
    }

    public void walkFromParent() {
        super.walk();
    }

    public void specificMethod() {
        System.out.println("Уникальный метод класса Cat");
    }
}
