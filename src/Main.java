//Using LocaleDate or another Date class calculate and print:
//        How many days are left till the end of the month
//        How many days are left till the end of the year, using the length() method from java.time.Year.of()

import java.time.LocalDate;
import java.time.Year;

public class Main {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        Year currentYear = Year.now();
        int currentMonthLength = today.lengthOfMonth(); //recuperata lunghezza del mese usando metodo lengthOfMonth() di java.time.LocalDate
        int currentYearLength = currentYear.length(); //usato length() method from java.time.Year.of()
        int daysLeftTillMonthEnd = currentMonthLength - today.getDayOfMonth();
        int daysLeftTillYearEnd = currentYearLength - today.getDayOfYear();

        System.out.println("Days left until the end of the year: " + daysLeftTillMonthEnd);
        System.out.println("Days left until the end of the year: " + daysLeftTillYearEnd);
    }
}

