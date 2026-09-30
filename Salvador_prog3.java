package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Salvador_prog3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Setup fixed size array for 5 elements based on the example
        int[] originalArray = new int[5];
        
        // 1. Enter Data in Array
        System.out.print("Enter Data in Array: ");
        for (int i = 0; i < 5; i++) {
            originalArray[i] = scanner.nextInt();
        }
        
        // 2. Stored Data in Array
        System.out.print("Stored Data in Array: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(originalArray[i] + " ");
        }
        System.out.println();
        
        // 3. Enter position to delete
        System.out.print("Enter poss. of Element to Delete: ");
        int deleteIndex = scanner.nextInt();
        
        // Create a new array that is smaller by 1 element
        int[] newArray = new int[4];
        int k = 0; // Index pointer for the new array
        
        // 4. Shift elements into the new array, skipping the target index
        for (int i = 0; i < 5; i++) {
            if (i == deleteIndex) {
                continue; // Skip the element at the specified position
            }
            newArray[k++] = originalArray[i];
        }
        
        // 5. New data in Array
        System.out.print("New data in Array: ");
        for (int i = 0; i < 4; i++) {
            System.out.print(newArray[i] + " ");
        }
        System.out.println();
        
        scanner.close();
    }
}