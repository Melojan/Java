/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author meloj
 */
import java.util.*;
public class BigSort {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        double [] arr = new double[n];
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = input.nextDouble();
        }
        
        sortTheArray(arr);
    }
    
                /* Sort the elements */
    public static void sortTheArray(double [] arr)
    {
        double temp;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            for(int j = arr.length - 1 ; j > i ; j--)
            {
                if(arr[j] < arr[j-1])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }          
        }
        
        for(int int_arr = 0 ; int_arr < arr.length ; int_arr++)
        {
            System.out.println(Math.round(arr[int_arr]));
        }  
    }     
}
