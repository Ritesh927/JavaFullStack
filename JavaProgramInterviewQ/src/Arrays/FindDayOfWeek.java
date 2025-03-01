package Arrays;

import java.time.LocalDate;
import java.time.DayOfWeek;

public class FindDayOfWeek {
    public static void main(String[] args) {
        // Example: Input date
        int day = 16;     // Day of the month
        int month = 1;    // Month (January)
        int year = 2025;  // Year

        // Create a LocalDate object
        LocalDate date = LocalDate.of(year, month, day);

        // Get the day of the week
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        // Print the result
        System.out.println("The day is: " + dayOfWeek);
    }
}
