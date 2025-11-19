// Author: Christopher Randolph
// Program: Horizontal Triangle Drawer
// This program takes a positive integer input from the user
// and draws a horizontal triangle of asterisks of that size.

import java.util.Scanner;

public class triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input
        System.out.print("Enter the size of the triangle (positive integer): ");
        String input = scanner.nextLine();

        // Validate that input contains only digits
        if (!isDigits(input) || input.equals("0")) {
            System.out.println("Error: Input must be a positive whole number.");
            scanner.close();
            return; // terminate program
        }

        // Convert string input to integer manually
        int size = 0;
        for (int i = 0; i < input.length(); i++) {
            size = size * 10 + (input.charAt(i) - '0');
        }

        // Draw the increasing part of the triangle
        for (int i = 1; i <= size; i++) {
            printStars(i);
        }

        // Draw the decreasing part of the triangle
        for (int i = size - 1; i > 0; i--) {
            printStars(i);
        }

        scanner.close();
    }

    // Method to check if a string contains only digits
    public static boolean isDigits(String str) {
        if (str.isEmpty()) return false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    // Method to print a given number of stars on a line
    public static void printStars(int count) {
        for (int i = 0; i < count; i++) {
            System.out.print("*");
        }
        System.out.println(); // move to the next line
    }
}
