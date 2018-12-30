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
import java.util.*;
public class Factorial {
 
    public static void main(String [] args)
    {
        int n = 6;
        System.out.println(factorial(n));
        System.out.println(factorialIterative(n));
    }
    
    public static int factorial(int n)
    {
        if(n < 0)
        {
            throw new IllegalArgumentException("n cannot be negative");
        }
        
        if(n == 0 || n == 1)
        {
            return 1;
        }
        
        return n * factorial(n-1);
    } 
    
    public static int factorialIterative(int n)
    {
        int product = 1;
        for(int j = 1 ; j <= n ; j++)
        {
            product *= j;
        }
        
        return product;
    }
}
