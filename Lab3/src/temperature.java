// Author: [Your Name]
// Program: Temperatures Array Lab
// Objective: Input 10 daily temperatures, find the average, and display all days below average.

import java.util.Scanner;

public class temperature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Create an array to store 10 temperatures (decimal values allowed)
        double[] temperatures = new double[10];

        // Prompt the user to enter temperatures for 10 days
        System.out.println("Enter the temperatures for 10 days:");
        for (int i = 0; i < temperatures.length; i++) {
            System.out.print("Day " + (i + 1) + ": ");
            temperatures[i] = input.nextDouble();
        }

        // Calculate the sum of all temperatures
        double sum = 0;
        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
        }

        // Calculate the average temperature
        double average = sum / temperatures.length;

        // Display the calculated average
        System.out.println("\nThe average temperature over 10 days is: " + average);

        // Display the days and temperatures strictly below the average
        System.out.println("\nDays with temperatures below the average:");
        int belowCount = 0; // keeps track of how many are below average
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] < average) {
                System.out.println("Day " + (i + 1) + ": " + temperatures[i]);
                belowCount++;
            }
        }

        // If no temperatures are below the average, show nothing (per requirement)
        if (belowCount == 0) {
            System.out.println("(None)");
        }

        input.close();
    }
}
