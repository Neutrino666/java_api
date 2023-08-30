package part_4.inheritance;

public class Mammals extends Vertebrates {

    boolean hasMilkGlands = true;
    String furColor;

    public Mammals(String furColor) {
        this.furColor = furColor;
    }

    public void walk() {
        System.out.println("Млекопитающее идёт");
    }
}
