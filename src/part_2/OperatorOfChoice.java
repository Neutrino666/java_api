package part_2;

public class OperatorOfChoice {

    public static void main(String[] args) {
        int a = 1;
        boolean condition = true;
        if (condition) {
            System.out.println("Условие истинно");
        } else if (a == 2) {
            System.out.println("a равна " + a);
        } else {
            System.out.println("Не прошел проверку");
        }

        switch (a - 1) {
            case 0: {
                System.out.println("Переменная а равна 0");
                break;
            }
            case 1: {
                System.out.println("Переменная а равна 1");
                break;
            }
            case 2: {
                System.out.println("Переменная а равна 2");
                break;
            }
            default: {
                System.out.println("Не прошел проверку");
            }
        }
    }
}
