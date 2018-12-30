/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablogspotquestions;

/**
 *
 * @author meloj
 */
import java.util.*;
public class RemoveDuplicateFromArray {
    
    public static void main(String [] args)
    {
        int [] intArr = {1,2,2,3,4,5,5,6,6,7,8,8,9};
        int [] resultant = removeDuplicates(intArr);
        System.out.println(Arrays.toString(resultant));
        int [] resultant2 = removeDuplicatesMethod(intArr);
        System.out.println(Arrays.toString(resultant2));
    }
    
    public static int[] removeDuplicates(int [] intArr)
    {
        boolean [] count = new boolean[intArr.length];
        
        for(int i = 0 ; i < intArr.length ; i++)
        {
            if(!count[intArr[i]])
            {
                count[intArr[i]] = true;
            }
            else
            {
                intArr[i] = -1;
            }
        }
        
        int [] unique = new int[count.length];
        
        for(int i = 0 ; i < count.length ; i++)
        {
            if(intArr[i] != -1)
            {
                unique[i] = intArr[i];
            }
        }
        
        return unique;
    }
    
    public static int [] removeDuplicatesMethod(int [] intArr)
    {
        if(intArr == null)
        {
            return intArr;
        }
        
        int i = 1;
        
        for(int j = 1 ; j < intArr.length ; j++)
        {
            if(intArr[j] != (intArr[j-1]))
            {
                intArr[i] = intArr[j];
                i++;
            }
        }
        
        if(i < intArr.length)
        {
            intArr[i] = 0;
        }
        
        return intArr;
    }
}
