/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.*;
public class SelectIndex {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        /* Which element to get the index */
        int n = input.nextInt();
        
        /* The size of the array */
        int size = input.nextInt();
        
        /* Create an array */
        int [] intarr = new int[size];
        
        /* Fill the array */
        for(int i = 0 ; i < intarr.length ; i++)
        {
            intarr[i] = input.nextInt();
        }
        
        int index = getIndex(intarr,n);
        System.out.println(index);
    }
        
        /* Check if the element is in the array */
    
    public static int getIndex(int [] intarr, int n)
    {
        
        for(int j = 0 ; j < intarr.length ; j++)
        {
            if(intarr[j] == n)
            {
                return j;
            }
        }
        
        return -1;
    }
        
}

