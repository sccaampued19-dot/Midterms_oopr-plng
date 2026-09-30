package com.mycompany.mavenproject1;
import java.util.Scanner;

public class Salvador_prog4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. Enter Size of Array
        System.out.print("Enter Size of Array : ");
        int size = scanner.nextInt();
        
        int[] arr = new int[size];
        
        // 2. Enter elements in Array
        System.out.println("Enter any " + size + " elements in Array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        
        // 3. Find and display Even Elements
        System.out.print("Even Elements: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println(); // Move to next line
        
        // 4. Find and display Odd Elements
        System.out.print("Odd Elements: ");
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}