package org.example;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {

        // Step 1: Output the current date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE dd.MM.yyyy");

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current Date and Time: " + currentDateTime.format(formatter));

        // Step 2: Add 2 weeks to the current date and output the new date
        LocalDateTime futureDateTime = currentDateTime.plusWeeks(2);
        System.out.println("Date after adding 2 weeks: " + futureDateTime.format(formatter));

        // Step 3: Compare the current date with a specified future date
        LocalDateTime specifiedFutureDate = LocalDateTime.of(2024,4,28,15,4);
        if (currentDateTime.isBefore(specifiedFutureDate)) {
            System.out.println("Current date is before the specified future date.");
        } else if (currentDateTime.isAfter(specifiedFutureDate)) {
            System.out.println("Current date is after the specified future date.");
        } else {
            System.out.println("Current date is equal to the specified future date.");
        }

        // Step 4: Calculate the difference in days between two arbitrary dates
        LocalDate arbitraryDate1 = LocalDate.of(2024, 2, 15);
        LocalDate arbitraryDate2 = LocalDate.of(2024, 3, 25);
        long daysDifference = ChronoUnit.DAYS.between(arbitraryDate1, arbitraryDate2);
        System.out.println("Difference in days between arbitrary dates: " + Math.abs(daysDifference));
    }
}


