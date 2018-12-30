/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;
import java.util.*;
public class SortByHeight {
    
    public static void main(String [] args)
    {
        int [] a = {-1,150,190,170,-1,-1,160,180};
        
        int [] b = sortbyHeight(a);
        System.out.println(Arrays.toString(b));
    }
    
    public static int[] sortbyHeight(int [] a)
    {
        List<Integer> arrList = new ArrayList<>();
        
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] > 0)
            {
                arrList.add(a[i]);
            }
        }
        
        Collections.sort(arrList);
        
        int index = 0;
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] > 0)
            {
                a[i]  = arrList.get(index);
                index++;
            }
        }
        
        return a;
    }
}
