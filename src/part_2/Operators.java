package part_2;

public class Operators {

    public static void main(String[] args) {
        for (int i = 0; i < 15; i++) {
            if (!(i % 2 == 0)) continue;
            System.out.println(i);
        }
    }
}
