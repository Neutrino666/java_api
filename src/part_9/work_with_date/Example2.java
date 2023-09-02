package part_9.work_with_date;

import java.time.Clock;
import java.time.LocalTime;

public class Example2 {

    public static void main(String[] args) {

        LocalTime localTime = LocalTime.of(15,55,23);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());
        System.out.println(localTime.getSecond());
        System.out.println(LocalTime.now());

        LocalTime localTime1 = LocalTime.parse("12:23:11");
        System.out.println(localTime1);

    }
}
