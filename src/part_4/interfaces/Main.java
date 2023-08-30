package part_4.interfaces;

public class Main {

    public static void main(String[] args) {
//        Bird bird = new Bird();
//        Plane plane = new Plane();
//        bird.fly();
//        plane.fly();

        Flyable bird = new Bird();
        Flyable plane = new Plane();
        bird.fly();
        plane.fly();
        Landing bird1 = new Bird();
        Landing plane1 = new Plane();
        bird1.landing();
        plane1.landing();

    }
}
