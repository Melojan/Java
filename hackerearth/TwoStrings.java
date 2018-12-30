/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

/**
 *
 * @author meloj
 */
import java.util.*;
public class TwoStrings {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        
        while(n-- > 0)
        {
            String a = input.next();
            String b = input.next();
            
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            
            for(char c : a.toCharArray())
            {
                if(map.containsKey(c))
                {
                    map.put(c,map.get(c) + 1);
                }
                else
                {
                    map.put(c,1);
                }
            }
           
             for(char c : b.toCharArray())
            {
                if(map.get(c) == null)
                {
                    System.out.println("NO");
                }
  
                else if(map.get(c) == 1)
                {
                     map.remove(c);
                }
                else
                {
                    map.put(c,map.get(c) - 1);
                }
            }
             
            System.out.println(map.isEmpty());
        }

    }
}
