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
public class checkPalindrome {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        
        boolean check = isPalindrome(word);
        System.out.println(check ? true : false);
    }
    
    public static boolean isPalindrome(String word)
    {  
        StringBuilder str = new StringBuilder(word);
        
        boolean flag = false;
        
         try{
            Integer.parseInt(word);
            return flag;
            
        }catch(Exception e)
        {
            System.out.println("Error detected");       
        }
        
        String reverse = str.reverse().toString();
        
            if(reverse.compareTo(word) == 0)
            {
                 flag = true;
            }
            else
            {
                flag = false;
            }
       
       
        return flag;
    }
}
