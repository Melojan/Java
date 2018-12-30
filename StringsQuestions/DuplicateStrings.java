package StringsQuestions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meloj
 */
import java.util.*;
import java.util.Map.Entry;
public class DuplicateStrings {
    
    public static void main(String [] args)
    {
        String name = "Aasdefsgh!!!";
        System.out.println(getDups(name));
    }
    
    public static char getDups(String name)
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
        
        for(Entry<Character,Integer> entrySet : map.entrySet())
        {
            if(entrySet.getValue() > 1)
            {
                return entrySet.getKey();
            }
        }
        
        return '_';
    }
}
