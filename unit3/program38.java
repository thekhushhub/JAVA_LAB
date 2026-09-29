// Write  a  java  program  to  use  Gregorian  calendar  to  display calendar information

import java.util.GregorianCalendar;
import java.util.Calendar;

class ShowGregoriancalendar {
    public static void main(String[] args) {
        GregorianCalendar cal = new GregorianCalendar();

        // Print date components
        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1));
        System.out.println("Day: " + cal.get(Calendar.DATE));

        // Check if the current year is a leap year
        System.out.println("Is Leap Year: " + cal.isLeapYear(cal.get(Calendar.YEAR)));
    }
}