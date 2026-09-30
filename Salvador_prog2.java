package com.mycompany.mavenproject1;
import java.util.Scanner;
import java.util.Arrays;

public class Salvador_prog2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] originalArray = new int[8];

        // 1. Read 8 integer numbers from the user
        System.out.println("Enter 8 integer numbers:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            originalArray[i] = scanner.nextInt();
        }

        // 2. Remove duplicate elements from the array
        // We use Java's Stream API to easily get distinct elements and convert back to an array
        int[] uniqueArray = Arrays.stream(originalArray).distinct().toArray();

        System.out.println("\n--- Results ---");
        System.out.println("Array after removing duplicates: " + Arrays.toString(uniqueArray));

        // Check if we have enough unique elements to find second values
        if (uniqueArray.length < 2) {
            System.out.println("Cannot find second largest or second smallest because there are fewer than 2 unique numbers.");
        } else {
            // Sort the unique array in ascending order
            Arrays.sort(uniqueArray);

            // 3. Find the second smallest element
            // Since it's sorted ascending, index 0 is smallest, index 1 is second smallest
            int secondSmallest = uniqueArray[1];

            // 4. Find the second largest element
            // Index (length - 1) is largest, index (length - 2) is second largest
            int secondLargest = uniqueArray[uniqueArray.length - 2];

            System.out.println("Second smallest element: " + secondSmallest);
            System.out.println("Second largest element: " + secondLargest);
        }

        scanner.close();
    }
}
