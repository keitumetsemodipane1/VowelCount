/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.iceactivity6;
import java.util.Scanner;

/**
 *
 * @author RC_Student_lab
 */
public class Iceactivity6 {

    
    public static void main(String[] args) {
        
        // Object of the scanner
        Scanner sc = new Scanner(System.in);
        
        //Prompts 
        System.out.println("Please enter a sentence: ");
        String sentence = sc.nextLine(); 
        
        int vowelCount = countVowels(sentence);
        System.out.println("Number of vowels: " + vowelCount);
    }

    // Method to convert a string to lowercase
    public static String convertToLowerCase(String sentence) {
        return sentence.toLowerCase(); 
    }

    // Method to count vowels in a string
    public static int countVowels(String sentence) {
        
        // Convert the sentence to lowercase
        sentence = convertToLowerCase(sentence);
        
        // Vowel string
       String vowels = "abcdefghijklmnopqrtuvwxz"; 
        int count = 0;

       
        for (int i = 0; i < sentence.length(); i++) {
            char c = sentence.charAt(i); 
            // Check if the character is a vowel
            if (isVowel(c, vowels)) {
                count++; 
            }
        }
        
        // Return total count of vowels
        return count; 
    }

    // check if a character is a vowel
    public static boolean isVowel(char c, String vowels) {
        return vowels.indexOf(c) != -1; 
    }
}

        
      
