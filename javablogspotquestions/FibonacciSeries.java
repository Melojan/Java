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
public class FibonacciSeries {

    public static void main(String[] args) {
      
        int n = 6;
        int [] memo = new int[n+1];
        //System.out.println(Arrays.toString(getFibonacciSeries(memo,n)));
        System.out.println(getFibonacci(memo,n));
        System.out.println(Arrays.toString(getFibonacciSeries(memo,n)));
        
        /*int number = 100000;
        long startTime = System.nanoTime();
        int result = getFibonacci(memo,number);
        long elapsedTime = System.nanoTime() - startTime;
        System.out.println(elapsedTime);*/
    }
    
    public static int getFibonacci(int [] memo ,int n)
    { 
        int result = 0;
        
        if(n < 0)
        {
            throw new IllegalArgumentException("n cannot be negative");
        }
        
        if(n == 0 || n == 1)
        {
            result = 1;
        }
        else
        {
            result = getFibonacci(memo,n-1) +  getFibonacci(memo,n-2);
        }
       
        memo[n] = result;
        return result;
    }
    
    public static int [] getFibonacciSeries(int [] memo , int n)
    {
        if(n < 0)
        {
            new IllegalArgumentException("n cannot be negative");
        }
        
        memo[0] = 1;
        memo[1] = 1;
        
        for(int i = 2 ; i <= n ; i++)
        {
            memo[i] = memo[i-1] + memo[i-2];
        }
        
        return memo;
    }
    
}
