package part_4.interfaces;

public class Plane implements Flyable, Landing {
    @Override
    public void landing() {
        System.out.println("Самолет приземляется");
    }

    @Override
    public void fly() {
        System.out.println("Самолет летит");
    }
}
