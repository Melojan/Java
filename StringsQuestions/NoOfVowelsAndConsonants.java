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
public class NoOfVowelsAndConsonants {
    
    public static void main(String [] args)
    {
        String str = "Melojan";
        System.out.println(numberOfVowels(str));
        System.out.println(numberOfVowelsCase(str));
        System.out.println(numberOfVowelsChars(str));
    }
    
    public static int numberOfVowels(String str)
    {
        String t = str.toLowerCase();
        
        int count = 0;
        
        for(char c : t.toCharArray())
        {
            if(Pattern.matches(("[aeiou]"),Character.toString(c)))
            {
                count++;
            }
        }
        
        int constants = t.length() - count;
        System.out.println(constants);
        return count;
    }
    
    public static int numberOfVowelsCase(String str)
    {
        String t = str.toLowerCase();
        
        char [] letters = t.toCharArray();
        
        int count = 0;
        
        for(char c : letters)
        {
            switch(c) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    count++;
            break;
                default:

            }
        }
        
        int constants = t.length() - count;
        System.out.println(constants);
        return count;
    }
    
    public static int numberOfVowelsChars(String str)
    {
        String t = str.toLowerCase();
        
        char [] charArray = t.toCharArray();
        
        int count = 0;
        
        for(char c : charArray)
        {
            if(c == 'a' || c == 'e' || c == 'o' || c == 'i' || c == 'u')
            {
                count++;
            }
        }
        
        int constants = t.length() - count;
        System.out.println(constants);
        return count;
        
    }
}
