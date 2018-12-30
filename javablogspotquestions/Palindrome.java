/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablogspotquestions;

public class Palindrome {
    
    public static void main(String [] args)
    {
        String str = "Melo";
        System.out.println(checkPalindromeNotEfficient(str));
        System.out.println(checkPalindromeEfficient(str));
        System.out.println(checkPalindromeRecursive(str));
    }
    
    public static boolean checkPalindromeNotEfficient(String str)
    {
        String name = str.toLowerCase();
        
        String reverse = "";
        
        for(int i = name.length() - 1 ; i>= 0 ; i--)
        {
            reverse += name.charAt(i);
        }
        
        return reverse.compareTo(name) == 0 ? true : false;
    }
    
    public static boolean checkPalindromeEfficient(String str)
    {
        String name = str.toLowerCase();
        String letter = new StringBuilder(name).reverse().toString();
        
        return (letter.compareTo(name) == 0) ? true : false;
    }
    
    public static boolean checkPalindromeRecursive(String name)
    {
        String str = name.toLowerCase();
       
        if(str.length() == 0)
        {
            return true;
        }
        else if(str.length() == 1)
        {
            return true;
            
        }
        else if(str.charAt(0) != str.charAt(str.length() - 1))
        {
            return false;
        }
        else
        {
            return checkPalindromeRecursive(str.substring(1,str.length() - 1));
        }
    }
}
