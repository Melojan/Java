/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

public class adjacentElementsProduct {
    
    public static void main(String [] args)
    {
        int [] arr = {3,6,-2,-5,7,3};
        
        System.out.println(getMaxProduct(arr));
    }
    
    public static int getMaxProduct(int [] arr)
    {
        int result = 0;
        
        int max = Integer.MIN_VALUE;
        
        for(int i = 0 ; i < arr.length - 1 ; i++)
        {
            if(arr[i] * arr[i+1] > max)
            {
                max = arr[i] * arr[i+1];
            }
        }
        
        
        return max;
    }
    
    
}
