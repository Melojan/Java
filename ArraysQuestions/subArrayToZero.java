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
public class subArrayToZero {
    
    public static void main(String [] args)
    {
        int [] arr = {1,4,-2,-2,5,-4,3};
        boolean ret = subArrayExist(arr);
        System.out.println((ret) ? true : false);
    }
    
    public static boolean subArrayExist(int [] arr)
    {
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        
        int sum = 0;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            sum += arr[i];
            
            if(arr[i] == 0 || sum == 0 || hm.get(sum) != null)
            {
                return true;
            }
            
            hm.put(sum, i);
        }
        
        return false;
    }
}
