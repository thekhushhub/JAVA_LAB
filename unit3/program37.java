// Write a java program to add, subtract a days/month into current date and time

import java.time.LocalDateTime;

class DateTime {
    public static void main(String[] args) {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Current Date & Time: " + current);

        // Adding days and months
        LocalDateTime future = current.plusDays(10).plusMonths(2);
        System.out.println("After adding 10 days and 2 months: " + future);

        // Subtracting days and months
        LocalDateTime past = current.minusDays(5).minusMonths(1);
        System.out.println("After subtracting 5 days and 1 month: " + past);
    }
}