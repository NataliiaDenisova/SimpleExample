package for_tests;

import java.util.Calendar;

/**
 * Created by Natali on 25.02.2018.
 */
// p. 328

public class TestCalendar {
    public static void main(String[] args){
        Calendar c = Calendar.getInstance();
        c.set(2004, 0, 7, 16, 40);
        long day1 = c.getTimeInMillis();
        day1 += 1000 * 60 * 60;
        c.setTimeInMillis(day1);

        System.out.println("Our date: " + c.getTime());

        System.out.println("Новый час " + c.get(c.HOUR_OF_DAY));
        c.add(c.DATE, 2);
        System.out.println("Добавить 2 дней " + c.getTime());
        c.roll(c.DATE, 35);
        System.out.println("Прокрутить 35 дней " + c.getTime());
        c.set(c.DATE, 1);
        System.out.println("Установить дату в 1 " + c.getTime());


    }
}
