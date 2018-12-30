/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

import java.util.*;

public class TopTwoNumbers {

    public static void main(String[] args) {
        int[] arr = {20, 34, 21, 87, 92, 2147483647};
        System.out.println(Arrays.toString(topTwo(arr)));
        System.out.println(Arrays.toString(topTwoArray(arr)));
    }

    public static Integer[] topTwo(int[] arr) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            q.offer(arr[i]);
            if (q.size() > 2) {
                q.poll();
            }
        }

       return q.toArray(new Integer[q.size()]);
    }
    
    public static int[] topTwoArray(int [] arr)
    {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        
        int [] topTwos = new int[2];
        
        for(int number : arr)
        {
            if(number > max1)
            {
                max2 = max1;
                max1 = number;
            }
            else if(number > max2)
            {
                max2 = number;
            }
        }
        
        topTwos[0] = max1;
        topTwos[1] = max2;
        
        return topTwos;
    }
}
