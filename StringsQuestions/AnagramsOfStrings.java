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
public class AnagramsOfStrings {
    
    public static void main(String [] args)
    {
        String a = "Anna Madrigal";
        String b = "A man and a girl";
        
        System.out.println(checkAnagrams(a,b));
        System.out.println(checkAnagramsUsingASCII(a,b));
    }
    
    public static boolean checkAnagrams(String a, String b)
    {
        String lowerCaseA = a.toLowerCase().replaceAll("\\s","");
        String lowerCaseB = b.toLowerCase().replaceAll("\\s","");
        
        char [] charA = lowerCaseA.toCharArray();
        char [] charB = lowerCaseB.toCharArray();
        
        Arrays.sort(charA);
        Arrays.sort(charB);
        
        return new String(charA).equals(new String(charB));
    }
    
    public static boolean checkAnagramsUsingASCII(String str1, String str2)
    {
     
        String a = str1.toLowerCase();
        String b = str2.toLowerCase();
        
        if(a.length() != b.length())
        {
            return false;
        }
        
        int [] letters = new int[128];
        
        for(int i = 0 ; i < a.length() ; i++)
        {
           letters[a.charAt(i)]++;
        }
        
        for(int i = 0 ; i < b.length() ; i++)
        {
            letters[b.charAt(i)]--;
            if(letters[b.charAt(i)] < 0)
            {
                return false;
            }
        }
        
        return true;
    }
}
