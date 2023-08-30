package part_4.inheritance;

public class Dog extends Mammals{
    public Dog(String furColor) {
        super(furColor);
    }

    @Override
    public void walk() {
        System.out.println("Собака идёт");
    }
}
