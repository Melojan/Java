
package Strings;

import java.util.*;
public class MissingInteger {
    
    public static void main(String [] args)
    {
        int [] A = {10,0,8,2,-1,12,11,3};
        System.out.println(missingInteger(A));
    }
    
    /*public static int missingInteger(int [] A)
    {
        Arrays.sort(A);
        int ans = Integer.MIN_VALUE;
        
        if(A.length == 2)
        {
            return (A[1] - A[0])/2;
        }
        
        for(int i = 0 ; i< A.length -1 ; i++)
        {
            if(A[i+1] - A[i] > 1)
            {
                ans = Math.max(ans, A[i+1] - A[i]);
            }
        }
        
        return ans/2;
    }*/
    
    public static int missingInteger(int [] A)
    {
        int maxValue = Integer.MIN_VALUE;
        int n = A.length;
        
        Arrays.sort(A);
        
        for(int i = 0 ; i < A.length ; i++)
        {
            if(A.length == 0)
            {
                return 0;
            }
            if(A.length == 2)
            {
                return (A[1] - A[0]) /2;
            }
            
        }
        
        for(int i = 0 ; i < A.length - 1; i++)
        {
            int diff = A[i+1] - A[i];
            
            if(diff > 1)
            {
                Math.max(maxValue,diff);
            }
            
        }
        
       return maxValue/2;
    }
}
