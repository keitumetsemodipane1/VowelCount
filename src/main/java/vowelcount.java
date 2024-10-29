
import static com.mycompany.iceactivity6.Iceactivity6.isVowel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author RC_Student_lab
 */
public class vowelcount {
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
