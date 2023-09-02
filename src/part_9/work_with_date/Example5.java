package part_9.work_with_date;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Example5 {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALIAN);
        LocalDate date = LocalDate.parse("2022-10-23");
        String formatedDate = date.format(formatter);
        System.out.println(formatedDate);
        String formatedString = date.format(formatter);
        System.out.println(formatedString);
    }
}
