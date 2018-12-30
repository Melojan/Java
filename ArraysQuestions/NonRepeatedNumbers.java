/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

/**
 *
 * @author meloj
 */
import java.util.*;
import java.util.Map.Entry;
public class NonRepeatedNumbers {
    
    public static void main(String [] args)
    {
        String word = "swiss";
        System.out.println(nonrepeatedChars(word));
    }
    
    public static String nonrepeatedChars(String word)
    {
        Map<Character,Integer> map = new HashMap<>();
        
        for(char c : word.toCharArray())
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
        
        /*for(char c : word.toCharArray())
        {
            if(map.get(c) == 1)
            {
               return Character.toString(c);
            }
        }*/
        
        for(Entry<Character,Integer> entry : map.entrySet())
        {
            if(entry.getValue() == 1)
            {
                return Character.toString(entry.getKey());
            }
        }
        
        throw new IllegalArgumentException("No unique value found");
    }
}
