package homework_4.holiday;

import java.time.LocalDate;

public class HolidayUtils {
    public static Holiday getCurrentHoliday() {
        LocalDate today = LocalDate.now();
        int day = today.getDayOfMonth();
        int month = today.getMonthValue();

        if (day == 1 && month == 1) {
            return Holiday.NEW_YEAR;
        } else if (day == 8 && month == 3) {
            return Holiday.WOMENS_DAY;
        } else if (day == 23 && month == 2) {
            return Holiday.MENS_DAY;
        } else {
            return Holiday.NONE;
        }
    }
}
