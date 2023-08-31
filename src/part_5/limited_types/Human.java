package part_5.limited_types;

public class Human extends Mammals implements  UprightPosture {

    @Override
    protected void makeSound() {
        System.out.println("Я человек");
    }

    @Override
    public void run() {
        System.out.println("Человек бежит");
    }
}
