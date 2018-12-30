/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

import java.util.*;
public class InterviewArray2 {
    
    //Common Elements in Two Sorted Arrays
    
    public static void main(String [] args)
    {
        int [] A = {1,3,4,6,7,9};
        int [] B = {1,2,4,5,9,10};
        
        int [] C = common_elements(A,B);
        System.out.println(Arrays.toString(C));
    }
    
    public static int [] common_elements(int [] A , int [] B) throws IllegalArgumentException
    {
        int p1 = 0;
        int p2 = 0;
        
        if(A == null && B == null)
        {
            throw new IllegalArgumentException("Both the Arrays are empty");
        }
        
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        while(p1 < A.length && p2 < B.length)
        {
            if(A[p1] == B[p2])
            {
                result.add(A[p1]);
                p1 += 1;
                p2 += 1;
            }
            else if(A[p1] > B[p2])
            {
                p2 += 1;
            }
            else
            {
                p1 += 1;
            }
        }
        
        int [] count = new int[result.size()];
        
        for(int i = 0 ; i < count.length ; i++)
        {
            count[i] = result.get(i);
        }
        
        return count;
    }
    
    
    /* FOR OPTIMAL SOLUTION , WE COULD 
    SAY A HAS AN ELEMENT THAT IS HIGHER THAN THE ELEMENT IN B 
    THEN WE COULD MOVE THE POINTER FOR B SINCE WE DEALING WITH 
    SORTED LIST. IF THE POINTER POINTS TO THE END OF THE ARRAY THEN 
    RETURN THE LIST
    */
}
