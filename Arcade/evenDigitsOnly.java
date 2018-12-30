/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arcade;

/**
 *
 * @author meloj
 */
import java.util.*;
public class evenDigitsOnly {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt(); //248622
        
        int digits = 0;
        int d;
        int count = 0;

        while(n > 0)
        {
            d = n % 10;
            
            if(d % 2 == 0)
            {
                count++;
            }
        
            digits++;
        
            n = n / 10;
        }
        
        boolean ret = false;
        System.out.println((count == digits) ? true : false);
    }
}
