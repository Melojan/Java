/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;
    
import java.util.HashSet;
import java.util.Set;


public class MissingInteger2 {
	
public int solution(int[] A) {
		
    //[1,3,6,4,1,2]
    // return 5
    
    int missingNumber = 1;
    
    //Create HashSet
    
    HashSet<Integer> set = new HashSet<>(); // 1,2,3,4,6
    
    for(int i = 0 ; i < A.length ; i++)
    {
        if(A[i] < 1) //No negative values so continue;
        {
            continue;  // Use continue to eradicate negative values in the list
        }
        
        if(set.add(A[i])) //1,2,3,4,6
                {
                   while(set.contains(missingNumber)) 
                   {
                       missingNumber++;
                   }
                }
    }
    
    return missingNumber;
    }
}
