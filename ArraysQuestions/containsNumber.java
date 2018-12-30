/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;


public class containsNumber {
    
    public static void main(String [] args)
    {
        int target = 56;
        int [] arr = {1,2,3,4,5};
        
        System.out.println(linearSearch(arr,target));
        System.out.println(binarySearch(arr,target));
    }
   
    public static boolean linearSearch(int [] arr , int target)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == target)
            {
                return true;
            }
        }
        
        return false;
    }
    
    public static boolean binarySearch(int [] arr, int target)
    {
        int start = 0;
        int end = arr.length;
        
        while(start < end)
        {
            int midpoint = (start + end) / 2;
            if(arr[midpoint] == target)
            {
                return true;
            }
            else if(arr[midpoint] < target)
            {
                start = midpoint + 1;
            }
            else
            {
                end = midpoint;
            }
        }
        
        return false;
    }
}
