/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsQuestions;

/**
 *
 * @author meloj
 */
import java.util.*;
public class removeDuplicateValues {
    
    public static void main(String [] args)
    {
        String str = "bananas";
        System.out.println(duplicateChars(str));
    }
    
    public static String duplicateChars(String str)
    {
        HashSet<Character> set = new HashSet<>();
        
        String result = "";
        
        for(int i = 0 ; i < str.length() ; i++)
        {
            set.add(str.charAt(i));
        }
        
        for(Character ch : set)
        {
            result += ch;
        }
        
        return result;
    }
}
