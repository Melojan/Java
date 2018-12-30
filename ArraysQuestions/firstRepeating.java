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
import java.util.Map.Entry;
public class firstRepeating {
    
    public static void main(String [] args)
    {
        int [] arr = {10,5,3,4,3,5,6};
        System.out.println(firstRep(arr));
    }
    
    public static int firstRep(int [] arr)
    {
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int target: arr)
        {
            if(map.containsKey(target))
            {
                map.put(target, map.get(target) + 1);
            }
            else
            {
                map.put(target, 1);
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
}
