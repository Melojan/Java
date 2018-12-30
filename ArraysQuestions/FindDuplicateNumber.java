/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

/**
 *
 * @author meloj
 */
import java.util.*;
public class FindDuplicateNumber {
    
    public static void main(String [] args)
    {
        int [] arr = {0,3,1,2,1};
        System.out.println(withLibaries(arr));
        System.out.println(withoutLibraries(arr));
    }
    
    public static int withLibaries(int [] arr)
    {   
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i : arr)
        {
            if(map.containsKey(i))
            {
                map.put(i,map.get(i) + 1);
            }
            else
            {
                map.put(i,1);
            }
        }
        
        for(int i : arr)
        {
            if(map.get(i) > 1)
            {
                return i;
            }
        }
        
        return -1;
    }
    
    public static int withoutLibraries(int [] arr)
    {
        int sum = 0;
        
        int expectedSum = 0;
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length; i++)
        {
            sum += arr[i];
            
            if(max < arr[i])
            {
                max = arr[i];
            }
        }
        
         expectedSum = (max * (max + 1)) / 2;
        
        return sum - expectedSum > 0 ? sum - expectedSum : -1;
    }
}
