/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

import java.util.*;
public class BicycleRack {
    
    public static void main(String [] args)
    {
        int [] arr = {1,2,3,4,5,6,7,8,-7,-33,53};
        System.out.println(solution(arr));
    }
    
    public static int solution(int [] arr)
    {
        Arrays.sort(arr);
        
        int n = arr.length;
        
        if(arr == null || n < 1)
        {
            new IllegalArgumentException("n cannot be negative");
        }
        
        int max = Integer.MAX_VALUE;
        
        int diff = arr[1] - arr[0];
        
        if(n == 2)
        {
            return diff/2;
        }
        
        for(int i = 0 ; i < arr.length - 1; i++)
        {
            max = Math.max(max,arr[i+1] - arr[i]);
        }
        
        return max;
    }
}
