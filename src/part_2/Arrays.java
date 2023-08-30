package part_2;

public class Arrays {
    public static void main(String[] args) {
        short array1[] = new short[4];
        int array2[][] = new int[1][2];

        array1[0] = 20;
        array1[1] = 10;
        array1[2] = 5;
        array1[3] = 100;

        array2[0][0] = 1000;
        array2[0][1] = 2000;

        System.out.println(array1[1]);
        System.out.println(array2[0][1]);
        System.out.println(array1.length);

    }
}
