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
public class largestElementUnsortedArray {
    
    public static void main(String [] args)
    {
        int [] arr = {10,20,30,50,40};
        int k = 3;
        
        System.out.println(getLargestElement(arr,k));
    }
    
    public static int getLargestElement(int [] arr , int k)
    {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            queue.offer(arr[i]);
            if(queue.size() > k)
            {
                queue.poll();
            }
        }
        
        return queue.peek();
    }
}
