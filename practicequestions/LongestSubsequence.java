/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

public class LongestSubsequence {
    
    public static void main(String [] args)
    {
        int [] arr = {1,3,2,1};
        int [] st = {1,3,2};
        longestSubSequence(st);
        longestSubSequence(arr);
    }
    
    public static void longestSubSequence(int [] arr)
    {
        int [] parent = new int [arr.length];
        
        int [] increasingSub = new int[arr.length + 1];
        
        int length = 0;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            //Binary Search
            int low = 1;
            int high = length;
            while(low <= high)
            {
                int mid = (int) Math.ceil((low+high)/2);
                if(arr[increasingSub[mid]] < arr[i])
                {
                    low = mid + 1;
                }
                else
                {
                    high = mid - 1;
                }
            }
            
            int pos = low;
            //update parent/previous element
            parent[i] = increasingSub[pos-1];
            //replace or append
            increasingSub[pos] = i;
            
            //Update the length of the longest subsequence
            if(pos > length)
            {
                length = pos;
            }
        }
        
        //Generate LIS by traversing parent array
        int LIS [] = new int[length];
        int k = increasingSub[length];
        for(int j = length - 1; j>= 0 ; j--)
        {
            LIS [j] = arr[k];
            k = parent[k];
        }
        
        for(int i = 0 ; i < length ; i++)
        {
            System.out.print(LIS[i] + " ");
        }
    }
}
