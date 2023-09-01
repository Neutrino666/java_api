package part_8;

public class Example7 {

    public static void main(String[] args) {
        String string1 = "hello ";
        String string2 = "world";
        System.out.println(string1 + string2);

        System.out.println(string1.charAt(4));
        byte[] array = string1.getBytes();
        for (byte b : array) {
            System.out.printf("%s ", b);
        }

    }
}
