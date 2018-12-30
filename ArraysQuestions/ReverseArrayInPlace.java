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
public class ReverseArrayInPlace {
    
    public static void main(String [] args)
    {
        int [] arr = {1,3,5,4,2};
        System.out.println(Arrays.toString(inPlace(arr)));
    }
    
    public static int[] inPlace(int [] arr)
    {
        for(int i = 0 ; i < arr.length / 2 ; i++)
        {
            int temp = arr[i];
            arr[i] = arr[arr.length-i-1];
            arr[arr.length-i-1] = temp;
        }
        
        return arr;
    }
}
