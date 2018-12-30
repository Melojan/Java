/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

import java.util.*;
public class InterviewArray1 {
    
    public static void main(String [] args)
    {
        int [] arr = {1,3,1,3,2,1};
        System.out.println(most_frequent(arr));
    }
    
    public static int most_frequent(int [] arr)
    {
       // Are negative values allowed in the list?
        
       Integer maxCount = -1;
       Integer maxItem = null;
       
       HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
       
       for(int target : arr)
       {
           if(map.containsKey(target))
           {
               Integer newValue = map.get(target) + 1;
               map.put(target,newValue);
           }
           else
           {
               map.put(target,1);
           }
           
           if(map.get(target) > maxCount)
           {
               maxCount = map.get(target);
               maxItem = target;
           }
       }
       return maxItem;
    }
}
