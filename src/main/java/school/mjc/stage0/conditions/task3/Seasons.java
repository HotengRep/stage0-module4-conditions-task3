package school.mjc.stage0.conditions.task3;

public class Seasons {
    public void tellTheSeasonByMonthNumber(int month) {
        String result = "wrong number!";
        if(month > 0 && month < 3 || month == 12)
        {
            result = "Winter";

        } else if (month > 2 && month < 6) {
            result = "Spring";

        } else if (month > 5 && month < 9)
        {
            result = "Summer";
        } else if (month > 8 && month < 12) {
            result = "Fall";
        }

        System.out.println(result);
    }
}
