/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

import java.util.Scanner;

/**
 *
 * @author clement
 */
public class Palindrome {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        if (sc.hasNextLine()) { 
            
            // On récupere le mot taper
            String word = sc.nextLine();
            
            // On initialise l'objet StringBuilder
            StringBuilder sb = new StringBuilder(word);
            
            // On récupère le mot inversé
            String reverseWord = sb.reverse().toString();
            
            // On compare le mot taper avec le mot inversé
            if (word.equals(reverseWord)) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Pas un palindrome");
            }           
        }
    }
    
}
