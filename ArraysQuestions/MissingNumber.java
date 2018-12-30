/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

import java.util.*;
public class MissingNumber {
    
    public static void main(String [] args)
    {
        int [] arr = {1,2,3,4,5,6,7,8,10,11,12};
        System.out.println(withLibraries(arr));
        System.out.println(withoutLibraries(arr));
    }
    
    public static int withLibraries(int [] arr)
    {
        HashSet<Integer> set = new HashSet<>();
        
        int missingNumber = 1;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] < 0)
            {
                continue;
            }
            
            if(set.add(arr[i]))
            {
                while(set.contains(missingNumber))
                {
                    missingNumber++;
                }
            }
        }
        
        return missingNumber;
    }
    
    public static int withoutLibraries(int [] arr)
    {
        int totalLengthSum = 0;
        int sum = 0;
        
        int n = arr[arr.length-1];
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i];
        }
        
        totalLengthSum = (n * (n+1)) / 2;
        
        int missingNumber = totalLengthSum - sum;
        
        
        
        return missingNumber;
    }
}
