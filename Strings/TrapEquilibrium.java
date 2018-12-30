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
public class TrapEquilibrium {
    
    public static void main(String [] args)
    {
        
        int [] arr = {3,1,2,4,3};
    
        System.out.println(solution(arr));
    }


public static int solution(int [] A)
{
    int minDiff = Integer.MAX_VALUE;
    int rightSum = 0;
    
    for(int i = 0 ; i < A.length ; i++)
    {
        rightSum = rightSum + A[i];
    }
    
    int leftSum = 0;
    
    for(int i = 0 ; i < A.length ; i++)
    {
        leftSum = leftSum + A[i];
        rightSum = rightSum - A[i];
        
        minDiff = Math.min(minDiff, Math.abs(leftSum - rightSum));
    }
    
    
    return minDiff;
    
}
}
