/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ahorcado;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author pablo
 */
public class Ahorcado {
    
    public static String[] incognito(String word){
        String palabra[] = new String[word.length()]; 
        for(int i = 0; i <= word.length(); i++){
            palabra[i] = String.valueOf(word.charAt(i)); 
        }
        return palabra; 
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        
        Random r = new Random(); 
        
        String palabras[] = {"primera", "segundo", "tercer"}; 
        String guess = ""; 
        boolean guessed = false; 
        
        
        do{
            String word_selected = palabras[r.nextInt()+ 2]; 
            String array_word[] = incognito(word_selected); 
            System.out.println("Take a guess on this word!");
            
            for(int i = 0; i < word_selected.length(); i ++){
                
            }
            
            
            
        }while(!guessed); 
        
        
    }
}
