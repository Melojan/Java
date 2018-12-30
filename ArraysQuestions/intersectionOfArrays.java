/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

import java.util.*;
public class intersectionOfArrays {
    
    public static void main(String [] args)
    {
        int [] a = {21,34,41,22,35};
        int [] b = {61,34,45,21,11};
        
        Integer [] result = intersection(a,b);
        System.out.println(Arrays.toString(result));
        int [] listResult = intersectionUsingArrayList(a,b);
        System.out.println(Arrays.toString(listResult));
    }
    
    public static Integer [] intersection(int [] a , int [] b)
    {
        HashSet<Integer> setA = new HashSet<>();
        HashSet<Integer> setB = new HashSet<>();
        
        for(int i : a)
        {
            setA.add(i);
        }
        
        for(int i : b)
        {
            setB.add(i);
        }
        
        setA.retainAll(setB);
        
        return setA.toArray(new Integer[setA.size()]);
    }
    
    public static int[] intersectionUsingArrayList(int [] a , int [] b)
    {
         List<Integer> arrList = new ArrayList<>();
        
        for(int i = 0 ; i < a.length ; i++)
        {
            for(int j = 0 ; j < b.length ; j++)
            {
                if(a[i] == b[j])
                {
                    arrList.add(a[i]);
                }
            }
        }
        
        int [] count = new int[arrList.size()];
        
        for(int i = 0 ; i < count.length ; i++)
        {
            count[i] = arrList.get(i);
        }
        
        return count;
    }
}
