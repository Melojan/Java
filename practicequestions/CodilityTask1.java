/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

/**
 *
 * @author meloj
 */
import java.util.*;
public class CodilityTask1 {
    
    public static void main(String [] args)
    {
        int [] A = {7,3,7,3,1,3,4,1};
        System.out.println(A.length);
    }
    public static int missingNumber(int [] arr)
    {
    
    Arrays.sort(arr);
    int i = 0;

    for(;i < arr.length ; i++)
    {
        if(arr[i] != i)
        {
            break;
        }

    }
    
    return i;
}
 
}    

