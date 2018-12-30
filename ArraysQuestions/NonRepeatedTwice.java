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
public class NonRepeatedTwice {
    
    public static void main(String [] args)
    {
        int [] arr = {1,1,2,2,3,4,4,5,5};
        System.out.println(getNotRepeatedTwice(arr));
    }

    public static int getNotRepeatedTwice(int[] arr) {
        
        Map<Integer,Integer> myMap = new HashMap<>();
        
        for(int i : arr)
        {
            if(myMap.containsKey(i))
            {
                myMap.put(i,myMap.get(i) + 1);
            }
            else
            {
                myMap.put(i, 1);
            }
        }
        
        for(Entry<Integer,Integer> entry : myMap.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return entry.getKey();
            }
        }
        
        throw new IllegalArgumentException("No unique Value found");
    }
}
