/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsQuestions;

import java.util.regex.Pattern;

/**
 *
 * @author meloj
 */
public class StringDigit {
    
    public static void main(String [] args)
    {
        String str = "1";
        System.out.println(checkDigit(str));
       System.out.println(checkDigitPattern(str));
    }
    
    public static boolean checkDigit(String str)
    {
        for(char c : str.toCharArray())
        {
            if(c < 48 || c > 57)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static boolean checkDigitPattern(String str)
    {
        if(str.matches("[0-9]+"))
        {
            return true;
        }
        
        return false;
    }
}
