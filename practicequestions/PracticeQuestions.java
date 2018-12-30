/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

import java.util.*;
public class PracticeQuestions {

    public static void main(String [] args)
    {
        int [] arr = {1,2,3,4};
        int missingNumber = getMissingNumber(arr,arr.length);
        System.out.println(missingNumber);
    }
    
    public static int getMissingNumber(int [] arr, int k)
    {
        
       int n = arr.length;
       
       int x = n + 1;
       int sum1 = x*(x+1)/2;
       int sum2 = 0;
       
       for(int i = 0 ; i < n ; i++)
       {
           sum2 = sum2 + arr[i];
       }
       
       int element = sum1-sum2;
              
       for(int i = 0 ; i < n ; i++)
       {
           System.out.print(arr[i] + " ");
           if(element == arr[i])
           {
               
           }
           
       }
       
       return 1;
    }
}
        
        
      