package part_8;

public class Example8 {
    public static void main(String[] args) {
        String s1 = "Hi world!";
        String s2 = "Hi world!";
        String s3 = "  Hello world! Here some message. TEXT ZTEXT  ";
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.startsWith("a"));
        System.out.println(s1.substring(2));
        System.out.println(s1.replace("Hi", "Foo"));
        System.out.println(s1.toUpperCase());
        String[] s = s3.split("[^a-rA-R ]");
        for (String el : s) {
            System.out.printf("_|%s|_", el);
        }
        System.out.println("\n" + s3.trim());
        System.out.println(String.join(" ", s1, "Next string:text\b\b\b\b", s3));
    }

}
