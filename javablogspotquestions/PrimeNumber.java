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
import java.lang.Math;
public class PrimeNumber {
    
    public static void main(String [] args)
    {
        int n = 4;
        boolean ret = checkPrime(n);
        int a = getPrime(n);
        System.out.println((ret) ? true : false);
        System.out.println(a);
        
        //2,3,5,7
    }
    
    public static boolean checkPrime(int n)
    {
        if(n < 2)
        {
            return false;
        }
        
        int sqrt = (int) Math.sqrt(n);
        
        for(int i = 2 ; i <= sqrt ; i++)
        {
            if(n % i == 0)
            {
                return false;
            }
        }
        
        return true;
    }
    
    public static int getPrime(int n)
    {   
        int sqrt = (int) Math.sqrt(n);
        
        for(int i = 2 ; i <= n ; i++)
        {
            for(int j = 0 ; j <= sqrt ; j++)
            {
                if(n % i == 0)
                {
                    return sqrt;
                }
            }
        }
        
        return 0;
    }

}
