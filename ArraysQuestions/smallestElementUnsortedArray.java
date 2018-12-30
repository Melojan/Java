/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

import java.util.Stack;

/**
 *
 * @author meloj
 */
public class smallestElementUnsortedArray {
    
    public static void main(String [] args)
    {
        int [] arr = {1,2,3,9,4};
        int k = 2;
       
        System.out.println(getSmallestElement(arr,k));
    }
    
    public static int getSmallestElement(int [] arr , int k)
    {
       Stack<Integer> stack = new Stack<>(); //LIFO
       
       for(int i = 0 ; i < arr.length ; i++)
       {
           stack.push(arr[i]);
           if(stack.size() > k)
           {
               stack.pop();
           }
       }
       
       return stack.peek();
    }
}
