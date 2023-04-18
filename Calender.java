
import java.time.LocalDate;
import java.time.Month;
import java.time.YearMonth;

public class Solution {

	public static void main(String[] args) {
		// Define the year and month
		int year = 2023;
		Month month = Month.APRIL;

		// Create a YearMonth object for the given year and month
		YearMonth yearMonth = YearMonth.of(year, month);

		// Get the number of days in the month
		int daysInMonth = yearMonth.lengthOfMonth();

		// Get the first day of the month
		LocalDate firstDayOfMonth = yearMonth.atDay(1);

		// Get the day of the week for the first day of the month
		int firstDayOfWeek = firstDayOfMonth.getDayOfWeek().getValue();

		// Print the calendar header
		System.out.println(month + " " + year);
		System.out.println("Su Mo Tu We Th Fr Sa");

		// Print the calendar grid
		for (int day = 1; day <= daysInMonth; day++) {
			// Print leading spaces for the first week
			if (day == 1) {
				for (int i = 1; i < firstDayOfWeek; i++) {
					System.out.print(" ");
				}
			}

			// Print the day
			System.out.printf("%2d ", day);

			// Print a newline at the end of the week
			if ((day + firstDayOfWeek ) % 7 == 0 || day == daysInMonth) {
				System.out.println();
			}
		}
	}

}
