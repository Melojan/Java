/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsQuestions;

/**
 *
 * @author meloj
 */
import java.util.*;
import java.util.Map.Entry;
public class NonRepeatedCharacter {
    
    public static void main(String [] args)
    {
        String str = "Morning";
        System.out.println(getNonRepeated(str));
    }
    
    public static char getNonRepeated(String name)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        
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
        
        for(char c : name.toCharArray())
        {
            if(map.get(c) == 1)
            {
                return c;
            }
        }
        
        return '_';
    }
}
