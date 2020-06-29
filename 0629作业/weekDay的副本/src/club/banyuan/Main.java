package club.banyuan;

import java.time.MonthDay;

public class Main {

    public static void main(String[] args) {
	// write your code here
        WeekDay weekDay=WeekDay.valueOf("MONDAY");
        System.out.println(weekDay.MONDAY);

        for (WeekDay weekday:WeekDay.values()) {
            System.out.println(weekday);
        }


        for (WeekDay weekday:WeekDay.values()) {
            System.out.println(weekday.toString());
        }

        WeekDay sat=WeekDay.SATURDAY;
        for (WeekDay day:WeekDay.values()) {
            //day.compareTo(sat);
            System.out.println(day.compareTo(sat));
        }
    }
}
