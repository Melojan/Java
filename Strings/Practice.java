/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.*;
public class Practice {

    public static void main(String [] args)
    {
       // 1) Check if a number is prime
       // 2) Given A and B print out the prime numbers that only consists in the interval
        
        /*private static boolean isPrime(int num) {
        if (num % 2 == 0) return false;
        for (int i = 3; i * i < num; i += 2)
            if (num % i == 0) return false;
        return true;*/
        
        int n = 154425323;
        int A = 1;
        int B = 16;
        System.out.println(isPrime(A,B));
    }
    
    public static int isPrime(int A, int B)
    {
        int count = 0; //[1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16] //1,2,3
        
        boolean isInSubArray = false;
        
        for(int i = A ; i <= B ; i++)
        {
        
           if( i == 2)
        {
            isInSubArray = true;
            count++;
            
        }
        
        if(i % 2 == 0 || i < 2)
        {
            isInSubArray = false;
        }
        
        for(int j = 3 ; j * j <= i ; j += 2) 
        {
           if(i % j != 0)
           {
               count++;
           }
        }
        
        }
        
     return count;
        
    }
    
    /*private static boolean checkPrime(int n)
    {
        if( n == 2)
        {
            return true;
        }
        
        if(n % 2 == 0 || n < 2)
        {
            return false;
        }
        
        for(int i = 3 ; i * i <= n ; i += 2) 
        {
           if(n % i == 0)
           {
               return false;
           }
        }
        
        return true;
    }*/
}
     



