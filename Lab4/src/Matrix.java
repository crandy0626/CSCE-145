/*
 * Author: Christopher Randolph
 * Program: Matrix Addition
 * Objective: Create two matrices of whole numbers, add them together, and display the results.
 */

import java.util.Scanner;

public class Matrix {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Step 1: Ask user for the size of both matrices ---
        System.out.println("Enter the number of rows for Matrix A:");
        int rowsA = input.nextInt();

        System.out.println("Enter the number of columns for Matrix A:");
        int colsA = input.nextInt();

        System.out.println("Enter the number of rows for Matrix B:");
        int rowsB = input.nextInt();

        System.out.println("Enter the number of columns for Matrix B:");
        int colsB = input.nextInt();

        // --- Step 2: Validate dimensions for addition ---
        if (rowsA != rowsB || colsA != colsB) {
            System.out.println("Error: Matrices must have the same dimensions to be added!");
            System.out.println("Program will now exit.");
            System.exit(0);
        }

        // --- Step 3: Create matrices using 2D arrays ---
        int[][] matrixA = new int[rowsA][colsA];
        int[][] matrixB = new int[rowsB][colsB];
        int[][] resultMatrix = new int[rowsA][colsA];

        // --- Step 4: Populate Matrix A ---
        System.out.println("\nEnter values for Matrix A:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                System.out.print("Enter value for A[" + i + "][" + j + "]: ");
                matrixA[i][j] = input.nextInt();
            }
        }

        // --- Step 5: Populate Matrix B ---
        System.out.println("\nEnter values for Matrix B:");
        for (int i = 0; i < rowsB; i++) {
            for (int j = 0; j < colsB; j++) {
                System.out.print("Enter value for B[" + i + "][" + j + "]: ");
                matrixB[i][j] = input.nextInt();
            }
        }

        // --- Step 6: Add the matrices ---
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < colsA; j++) {
                resultMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        // --- Step 7: Print all matrices ---
        System.out.println("\nMatrix A:");
        printMatrix(matrixA);

        System.out.println("\nMatrix B:");
        printMatrix(matrixB);

        System.out.println("\nResulting Matrix (A + B):");
        printMatrix(resultMatrix);

        // Close scanner
        input.close();
    }

    // --- Helper method to print a matrix in a clean format ---
    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + "\t");
            }
            System.out.println();
        }
    }
}
