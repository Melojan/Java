/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

import java.util.*;
public class InterviewArray3 {
    
    public static void main(String [] args)
    {
        int [] A = {1,2,3,4,5,6,7};
        int [] B = {4,5,6,7,1,2,3};
        
        boolean ret = is_rotation(A,B);
        System.out.println((ret) ? true : false);
    }
    
    public static boolean is_rotation(int [] A , int [] B)
    {
        if(A.length != B.length)
        {
            return false;
        }
        
        int key = A[0];
        int key_i = -1;
        
        for(int i = 0 ; i < B.length ; i++)
        {
            if(B[i] == key)
            {
                key_i = i;
                break;
            }
            
            if(key_i == -1)
            {
                return false;
            }
        }
        
        for(int i = 0 ; i < A.length ; i++)
        {
            int j = (key_i + i) % A.length;
            if(A[i] != B[j])
            {
                return false;
            }
        }
        
        return true;
    }
}
