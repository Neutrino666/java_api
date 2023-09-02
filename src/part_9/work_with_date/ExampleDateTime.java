package part_9.work_with_date;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ExampleDateTime {

    public static void main(String[] args) {

        LocalDateTime localDateTime = LocalDateTime.of(2023, Month.FEBRUARY, 23, 21, 59);
        LocalDate localDate = LocalDate.of(2023, 5, 12);
        LocalTime localTime = LocalTime.of(12, 23);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        LocalDateTime localDateTime2 = localDate.atTime(localTime);
        LocalDateTime localDateTime3 = localTime.atDate(localDate);

//        localDateTime.toLocalDate(); // вернет дату
//        localDateTime.toLocalTime(); // вернет время

    }
}
