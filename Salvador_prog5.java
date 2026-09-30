package com.mycompany.mavenproject1;

public class Salvador_prog5 {
    public static void main(String[] args) {
        System.out.println("OUTPUT :");
        
        int rows = 4; // Total number of lines to print
        
        for (int i = 1; i <= rows; i++) {
            // Every line starts with a leading asterisk
            System.out.print("*");
            
            // Loop to print the trailing "A*" pairs
            for (int j = 1; j < i; j++) {
                System.out.print("A*");
            }
            
            // Move to the next line after completing a row
            System.out.println();
        }
    }
}
