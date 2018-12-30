package practicequestions;

import java.util.*;
public class ArrayRotation
{
    public static void main(String [] args)
    {
        int [] array = {1,2,3,4,5};
        int k = 4;
        System.out.println("The Original Array is " + Arrays.toString(array));
        rotateArrayReverse(array,k);
        System.out.println("The Rotated Array using " + k + " is " + Arrays.toString(array));
    }
    
    public static void rotateArrayReverse(int [] array, int k)
    {
        if(k < 0)
        {
            new IllegalArgumentException("k cannot be negative");
        }
        
        if(array == null || array.length < 2)
        {
            return;
        }
        
        int n = array.length;
        
        if(k > n)
        {
            k = k % n;
        }
        
        rotateArray(array, 0 , k - 1);
        rotateArray(array, k , n - 1);
        rotateArray(array, 0 , n - 1);
    }
    
    public static void rotateArray(int [] array , int s ,int e)
    {
        while(s < e)
        {
            int temp = array[s];
            array[s] = array[e];
            array[e] = temp;
            s++;
            e--;
        }
    }
}