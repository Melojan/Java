/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablogspotquestions;

/**
 *
 * @author meloj
 */
public class ReverseString {
    
    public static void main(String [] args)
    {
        String str = "hello";
        System.out.println(reverseString(str));
    }
    
    public static String reverseString(String str)
    {
        String reverse = "";
        
        for(int i = str.length() - 1 ; i >= 0 ; i--)
        {
            reverse += str.charAt(i);
        }
        
        return reverse;
    }
}
