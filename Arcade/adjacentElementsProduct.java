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
public class adjacentElementsProduct {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int [] a = new int[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = input.nextInt();
        }
        
        int result = productOfAdjacentElements(a);
        System.out.println(result);
    }
    
    public static int productOfAdjacentElements(int [] a) throws IllegalArgumentException
    {
        if(a.length == 0 || a.length <= 1)
        {
            throw new IllegalArgumentException("no distinct pair found!");
        }
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < a.length - 1 ; i++)
        {
            if(a[i] * a[i+1] > max)
            {
                max  = a[i] * a[i+1];
            }
        }
        
        return max;
    }
}
