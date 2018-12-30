/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablogspotquestions;

/**
 *
 * @author meloj
 */
import java.util.*;
public class RepeatedCharacters {
    
    public static void main(String [] args)
    {
        String name = "Java";
        System.out.println(noOfDups(name));
    }
    
    public static int noOfDups(String name)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        
        int count = 0;
        
        for(char c : name.toCharArray())
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
        
       Set<Map.Entry<Character,Integer>> entrySet = map.entrySet();
       for(Map.Entry<Character,Integer> entry : entrySet)
       {
           if(entry.getValue() > 1)
           {
           }
       }
       
       return count;
    }
}
