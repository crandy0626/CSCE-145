import java.util.Scanner;

public class zodiac {
// Written by Christopher Randolph
    // Method to determine zodiac sign
    public static String getZodiacSign(int month, int day) {
        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) {
            return "Aries";
        } else if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) {
            return "Taurus";
        } else if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) {
            return "Gemini";
        } else if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) {
            return "Cancer";
        } else if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) {
            return "Leo";
        } else if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) {
            return "Virgo";
        } else if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) {
            return "Libra";
        } else if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) {
            return "Scorpio";
        } else if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) {
            return "Sagittarius";
        } else if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) {
            return "Capricorn";
        } else if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) {
            return "Aquarius";
        } else if ((month == 2 && day >= 19) || (month == 3 && day <= 20)) {
            return "Pisces";
        } else {
            return "Unknown"; // should not happen with valid input
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Zodiac Sign Finder!");
        System.out.println("Please enter your birthday using numbers for the month and the day.");

        // Prompt user for month
        System.out.print("Enter the month (1-12): ");
        int month = input.nextInt();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Please restart and enter a value between 1 and 12.");
            return;
        }

        // Days in each month (February = 29)
        int[] daysInMonth = {0, 31, 29, 31, 30, 31, 30, 
                             31, 31, 30, 31, 30, 31};

        // Prompt user for day
        System.out.print("Enter the day: ");
        int day = input.nextInt();

        if (day < 1 || day > daysInMonth[month]) {
            System.out.println("Invalid day for month " + month + ". Please restart and enter a valid day.");
            return;
        }

        // Determine zodiac sign
        String zodiac = getZodiacSign(month, day);
        System.out.println("Your zodiac sign is: " + zodiac);

        input.close();
    }
}
