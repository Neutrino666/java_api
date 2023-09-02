package part_9.work_with_date;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Example {

    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(2023, 8, 25);
        System.out.println(localDate.getYear());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.lengthOfYear());
        System.out.println(localDate.isLeapYear());
        System.out.println("___________________________________");
        System.out.println(localDate.get(ChronoField.YEAR));
        System.out.println(localDate.get(ChronoField.MONTH_OF_YEAR));
        System.out.println(localDate.get(ChronoField.DAY_OF_MONTH));
        System.out.println("___________________________________");
        System.out.println(LocalDate.now());

        LocalDate localDate1 = LocalDate.parse("2022-01-22");
        System.out.println(localDate1);
    }
}
