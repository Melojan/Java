package practicequestions;

import java.util.*;
public class CheckDupliate {
    
    public static void main(String [] args)
    {
        int [] arr = {1,1,2,2,4,4,3,7,9,16};
        
        HashSet<Integer> set = new HashSet<>();
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            set.add(arr[i]);
        }
        
        for(int j = 0 ; j < arr.length ; j++)
        {
            if(set.remove(arr[j]) == false)
            {
                      set.add(arr[j]); 
            }
        }
        
        Iterator<Integer> iterator = set.iterator();
        while(iterator.hasNext())
        {
            Integer i = (Integer)iterator.next();
            System.out.print(i);
        }
    }
}
