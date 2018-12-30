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
public class facebook {
    
    public static void main(String [] args)
    {
        int [] a = {7,10,7};
        int [] b = {2,3,4};
        int [] c = {2,7,4};
        
        String [] results = checkCollinear(a,b,c);
        System.out.println(results);
    }
    
    public static String [] checkCollinear(int [] a , int [] b , int [] c)
    {
        ArrayList<String> arrList = new ArrayList<>();
        
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        
            while(p1 < a.length && p2 < b.length && p3 < c.length)
            {
                if( (b[p1] - a[p1])*(c[p1]-b[p1]) == (c[p1] - b[p1]) * (b[p1] - a[p1]))
                {
                    arrList.add("YES");
                    p1+=1;
                    p2+=1;
                    p3+=1;
                }
                else
                {
                    arrList.add("NO");
                    p1+=1;
                    p2+=1;
                    p3+=1;
                    
                }
            }
        
        String [] count = new String[arrList.size()];
        
        for(int i = 0 ; i < count.length ; i++)
        {
            count[i] = arrList.get(i);
        }
        
        return count;
    }
}
