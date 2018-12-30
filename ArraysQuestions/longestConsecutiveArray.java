/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

import java.util.PriorityQueue;

/**
 *
 * @author meloj
 */
import java.util.*;
public class longestConsecutiveArray {
    
    public static void main(String [] args)
    {
        int [] arr = {100,4,200,1,3,2};
        System.out.println(getConsecutive(arr));
    }
    
    public static int getConsecutive(int [] arr)
    {
        if(arr.length == 0)
        {
            return 0;
        }
        
        Set<Integer> set = new HashSet<Integer>();
        
        int max = 1;
        
        for(int e : arr)
        {
            set.add(e);
        }
        
        for(int e : arr)
        {
            int left = e - 1;
            int right = e + 1;
            int count = 1;
            
            while(set.contains(left))
            {
                count++;
                set.remove(left);
                left--;
            }
            
            while(set.contains(right))
            {
                count++;
                set.remove(right);
                right++;
            }
            
            max = Math.max(count,max);
        }
        
        /*Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext())
        {
            Integer i = (Integer)iterator.next();
            System.out.print(i + " ");
        }*/
        
        return max;
    }
}
