/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

import java.util.*;
public class PairOfSum {
    
    public static void main(String [] args)
    {
        //int [] arr = {2,4,3,5,7,8,9};
        int [] arr = {2,4,3,5,6,-2,4,7,8,9};
        int k = 7;
        
        int [] result = getPairs(arr,k);
        System.out.println(Arrays.toString(getPairs(arr,k)));
        System.out.println(Arrays.toString(getPairsEfficient(arr,k)));
        System.out.println(Arrays.toString(getPairsUsingPointers(arr,k)));
        
    }
    
    public static int [] getPairs(int [] arr , int k)
    {
        ArrayList<Integer> arrList = new ArrayList<>();

        for(int i = 0 ; i < arr.length ; i++)
        {
            int first = arr[i];
            for(int j = i + 1 ; j < arr.length ; j++)
            {
                int second = arr[j];
                
                if((first + second) == k)
                {
                    arrList.add(first);
                    arrList.add(second);
                }
            }
        }
        
        int [] count = new int[arrList.size()];
        for(int i = 0 ; i < count.length ; i++)
        {
            count [i] = arrList.get(i);
        }
        
        return count;
    }
    
    public static int [] getPairsEfficient(int [] arr , int k)
    {
        if(arr.length < 2)
        {
            return new int[] {0,0};
        }
        
        Set set = new HashSet(arr.length);
        
        for(int value : arr)
        {
            int target = k - value;
            
            if(!set.contains(target))
            {
                set.add(value);
            }
            else
            {
                return new int[] {value,target};
            }
        }
        
        throw new IllegalArgumentException("No Two Solutions exists");
    }
    
    public static int [] getPairsUsingPointers(int [] arr , int k)
    {
        List<Integer> list = new ArrayList<>();
        
        if(arr.length < 2)
        {
            return new int[] {0,0};
        }
        
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length - 1;
        
        while(left < right)
        {
            int sum = arr[left] + arr[right];
            if(sum == k)
            {
                list.add(arr[left]);
                list.add(arr[right]);
                left++;
                right--;
            }
            else if(sum < k)
            {
                left++;
            }
            else if(sum > k)
            {
                right--;
            }
        }
        
        int [] count = new int[list.size()];
        
        for(int i = 0 ; i < count.length ; i++)
        {
            count[i] = list.get(i);
        }
        
        return count;
        
    }
}
