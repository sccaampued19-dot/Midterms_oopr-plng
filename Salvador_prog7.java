package com.mycompany.mavenproject1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException; // Imported the required exception class

public class Salvador_prog7 {
    public static void main(String[] args) {
        String filepath = "C:\\Users\\SBH-CL5-WS01\\Desktop\\oopr.txt";
        
        try(BufferedReader reader = new BufferedReader(new FileReader(filepath))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){ // Added this block to handle reading/closing errors
            System.out.println("An error occurred while reading the file");
        }
    }
}
