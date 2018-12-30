/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author meloj
 */
import java.util.*;
public class StringAnagram {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        String str2 = input.nextLine();
        
        boolean ret = anagram(str1,str2);
        System.out.println((ret) ? "anagram" : "not anagram");
    }
    
    
    
    public static boolean anagram(String str1 , String str2)
    {
        char [] charString1 = str1.toCharArray();
        StringBuilder sb = new StringBuilder(str2);
        
        for(char c : charString1)
        {
            int index = sb.indexOf(String.valueOf(c));
            System.out.println(index);
            
            System.out.println(index);
            if(index != -1)
            {
                sb.deleteCharAt(index);
            }
            else
            {
                return false;
            }
        }
        
        return sb.length() == 0;
    }
}
