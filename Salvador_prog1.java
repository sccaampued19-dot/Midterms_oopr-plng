package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Salvador_prog1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Array to store 10 real numbers (double)
        double[] numbers = new double[10];

        // Loop 1: Read 10 real numbers from the user
        System.out.println("Enter 10 real numbers (both positive and negative):");
        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
        }

        // Loop 2: Find the sum and average of positive numbers
        double positiveSum = 0;
        int positiveCount = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] > 0) {
                positiveSum += numbers[i];
                positiveCount++;
            }
        }

        // Loop 3: Count negative numbers
        int negativeCount = 0;
        for (int i = 0; i < 10; i++) {
            if (numbers[i] < 0) {
                negativeCount++;
            }
        }

        // Loop 4: Find the minimum value of the array
        double minValue = numbers[0]; // Assume the first element is the minimum initially
        for (int i = 1; i < 10; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
            }
        }

        // --- Displaying the Results ---
        System.out.println("\n--- Results ---");
        
        // Display positive numbers metrics
        if (positiveCount > 0) {
            double positiveAverage = positiveSum / positiveCount;
            System.out.println("Sum of positive numbers: " + positiveSum);
            System.out.println("Average of positive numbers: " + positiveAverage);
        } else {
            System.out.println("Sum of positive numbers: 0 (No positive numbers entered)");
            System.out.println("Average of positive numbers: N/A");
        }

        // Display negative numbers count
        System.out.println("Count of negative numbers: " + negativeCount);

        // Display the minimum value
        System.out.println("Minimum value in the array: " + minValue);

        scanner.close();
    }
}
