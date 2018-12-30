/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

/**
 *
 * @author meloj
 */
import java.util.*;
public class PrimeNumber {
    
    public static void main(String [] args)
    {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        
        for(int i = 2 ; i <= a ; i++)
        {
            boolean isPrime = true;
            
            for(int j = 2 ; j <= Math.sqrt(i) ; j++)
            {
                if(i%j == 0)
                {
                    isPrime = false;
                    break;
                }
            }
            
            if(isPrime)
            {
                System.out.print(i + " ");
            }  
        }
    }
}

