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
public class IntegerPalindrome {
    
    public static void main(String [] args)
    {
        int n = 1001;
        System.out.println(checkPalindrome(n));
    }
    
    public static boolean checkPalindrome(int n)
    {
        int palindrome = n;
        int reverse = 0;
        
        while(palindrome != 0)
        {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome /= 10;
        }
        
        return n == reverse ? true : false;
    }
}


