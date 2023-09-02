package part_9.work_with_date;

import java.time.*;

public class Example4 {

    public static void main(String[] args) throws InterruptedException {

        Instant instant = Instant.ofEpochSecond(3);
        Instant instant1 = Instant.ofEpochSecond(3, 0);

        LocalTime localTime = LocalTime.now();
        Thread.sleep(1234);
        LocalTime localTime1 = LocalTime.now();

        LocalDate localDate = LocalDate.now();
        LocalDate localDate1 = LocalDate.now();

        Duration duration = Duration.between(localTime, localTime1);
        System.out.println(duration);
//        Duration duration1 = Duration.between(localDate, localDate1);

        Period period = Period.between(LocalDate.parse("2022-12-12"), LocalDate.parse("2023-01-30"));
        System.out.println(period);

        localDate1.minusDays(10);
        localDate1.plusWeeks(2);

    }
}
