package school.mjc.stage0.conditions.task3;

import java.time.YearMonth;

public class DaysInMonthPrinter {
    public void amountOfDays(int month) {
        if(month<0 || month>12)
        {
            System.out.println("wrong number!");
            return;
        }

        YearMonth mounthDays = YearMonth.of(2023,month);
        System.out.println(mounthDays.lengthOfMonth());
    }
}
