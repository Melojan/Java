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
public class arrayMaximalAdjacentDifference {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int [] arr = new int[n];
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = input.nextInt();
        }
        
        int result = maximalAdjacentDiff(arr);
        System.out.println(result);
    }
    
    public static int maximalAdjacentDiff(int [] arr)
    {
        int currDiff = 0;
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length - 1 ; i++)
        {
            currDiff = Math.abs(arr[i] - arr[i+1]);
            
            if(currDiff > max)
            {
                max = currDiff;
            }
        }
        
        return max;
    }
}
