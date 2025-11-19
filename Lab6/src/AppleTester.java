// AppleTester.java
// Author: Christopher Randolph
// Tests the Apple class functionality.

public class AppleTester {
    public static void main(String[] args) {
        System.out.println("Welcome to the apple tester\n");

        // Default apple
        System.out.println("Creating a default apple");
        Apple defaultApple = new Apple();
        System.out.println("Printing the default apple's value");
        System.out.println(defaultApple.toString() + "\n");

        // Valid parameterized apple
        System.out.println("Creating another apple");
        System.out.println("Setting the new apple's values to the following, valid values");
        System.out.println("\"Granny Smith 0.75 0.99\"");
        Apple validApple = new Apple("Granny Smith", 0.75, 0.99);
        System.out.println("Printing the new apple's values");
        System.out.println(validApple.toString() + "\n");

        // Invalid values
        System.out.println("Creating another default apple");
        Apple invalidApple = new Apple();
        System.out.println("Then setting the new apple's values to the following, invalid values \"iPad 2.5 -200\"");
        invalidApple.setType("iPad");
        invalidApple.setWeight(2.5);
        invalidApple.setPrice(-200);
        System.out.println("Printing the newest apple's values which should not have changed from the default values");
        System.out.println(invalidApple.toString() + "\n");

        // Equality check
        System.out.println("Checking if the first and last apple have the same values.");
        System.out.println(defaultApple.equals(invalidApple));
    }
}
