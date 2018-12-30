/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

import java.util.*;
public class MinMaxOfAnUnsortedArray {
    
    public static void main(String [] args)
    {
        int [] arr = {6,15,2,7,26,17,4,1,3};
        System.out.println(sorted(arr));
        System.out.println(unsorted(arr));
    }
    
    public static int sorted(int [] arr)
    {
        Arrays.sort(arr);
        int min = arr[0];
        int max = arr[arr.length - 1];
        
        System.out.println(min);
        return max;
    }
    
    public static int unsorted(int [] arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(max < arr[i])
            {
                max = arr[i];
            }
            
            if(min > arr[i])
            {
                min = arr[i];
            }
        }
        
        System.out.println(min);
        return max;
    }
}
