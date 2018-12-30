/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

/**
 *
 * @author meloj
 */
import java.util.*;
public class PrimeNumbers {
    
    public static void main(String [] args)
    {
       int inp = 4;
       find(inp);
    }
    
      static void find(int n){
        int result = 0;
        int i=0,count=2;
        if(n==1)
        {
            System.out.println("1st prime =2");
            return;
        }
        if(n==2)
        {
            System.out.println("2nd prime =3");
            return;
        }
        
        int sqrt = (int)Math.sqrt(n);

        while(true)
        {
            for(int j=2;j<=sqrt;j++){
            if(i%j==0)
            break;
            else if(j==i/2)
            {
            count++;
            }
        }
        if(count==n)
        {
                result = i;
        break;
        }
        i++;
        }
        
        System.out.println(result);
    }
    }

