/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arcade;

/**
 *
 * @author meloj
 */
import java.util.*;
public class MakeArrayConsecutive2 {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        int [] a = new int[n];
        
        for(int i = 0 ; i < n ; i++)
        {
            a[i] = input.nextInt();
        }
        
        int result = makeArrayConsecutive(a);
        System.out.println(result);
    }
    
    public static int makeArrayConsecutive(int [] a)
    {
        //Use BubbleSort
        int count = 0;
        
        for(int lastUnsortedIndex = a.length - 1 ; lastUnsortedIndex > 0 ; lastUnsortedIndex--)
        {
            for(int i = 0 ; i < lastUnsortedIndex ; i++)
            {
                if(a[i] > a[i+1])
                {
                    swap(a,i,i+1);
                }
            }
        }
        
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] < 0 || a.length == 0)
            {
                continue;
            }
            
            int newInteger =  a[a.length-1] - a[0];
            count = newInteger - a.length + 1;
        }
        
        return count;
        
    }
        
        public static void swap(int [] a , int i , int j)
        {
            if(i == j)
            {
                return;
            }
            
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }       
}
