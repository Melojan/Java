/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arcade;

/**
 *
 * @author meloj
 */
import java.util.*;
public class longestDigitPrefix {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        
        String results = "";
        
        char [] letters = word.toCharArray();
        
        for(char c : letters)
        {
            if(Character.isDigit(c))
            {
                results += c;
            }
            else
            {
                break;
            }
        }
        
        System.out.println(results);
         
    }
}
