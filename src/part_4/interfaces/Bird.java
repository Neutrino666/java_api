package part_4.interfaces;

public class Bird implements Flyable, Landing{
    @Override
    public void landing() {
        System.out.println("Птица садиться");
    }

    @Override
    public void fly() {
        System.out.println("Птица летит");
    }
}
