// Christopher [Your Last Name]
// DateAndTimeTester class for validating user-inputted dates and times
// This class is used by a driver file and contains no main method

import java.util.Scanner;

public class Timer {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
    Scanner scanner;

	// Handles user input and interaction loop
        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a date and time (MM/DD hh:mm) and I will determine if it is valid");
            String input = scanner.nextLine();

            if (isValid(input)) {
                System.out.println("The date and time is valid!");
            } else {
                System.out.println("The date and time is not valid");
            }

            System.out.println("Would you like to exit? Type \"quit\" to exit or press [ENTER] to continue");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("quit")) {
                System.out.println("Goodbye");
                break;
            }
        }
    }

    // Validates full date-time string
    public static boolean isValid(String dateTime) {
        String[] parts = dateTime.split(" ");
        if (parts.length != 2) return false;

        String datePart = parts[0];
        String timePart = parts[1];

        return isValidDate(datePart) && isValidTime(timePart);
    }

    // Validates date portion (MM/DD)
    public static boolean isValidDate(String date) {
        int month = getMonth(date);
        int day = getDay(date);

        if (month < 1 || month > 12) return false;

        int[] daysInMonth = {
            0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
        };

        return day >= 1 && day <= daysInMonth[month];
    }

    // Validates time portion (hh:mm)
    public static boolean isValidTime(String time) {
        int hour = getHour(time);
        int minute = getMinute(time);

        return hour >= 1 && hour <= 12 && minute >= 0 && minute <= 59;
    }

    // Extracts month from MM/DD
    public static int getMonth(String date) {
        int slashIndex = date.indexOf('/');
        return Integer.parseInt(date.substring(0, slashIndex));
    }

    // Extracts day from MM/DD
    public static int getDay(String date) {
        int slashIndex = date.indexOf('/');
        return Integer.parseInt(date.substring(slashIndex + 1));
    }

    // Extracts hour from hh:mm
    public static int getHour(String time) {
        int colonIndex = time.indexOf(':');
        return Integer.parseInt(time.substring(0, colonIndex));
    }

    // Extracts minute from hh:mm
    public static int getMinute(String time) {
        int colonIndex = time.indexOf(':');
        return Integer.parseInt(time.substring(colonIndex + 1));
    }
}
