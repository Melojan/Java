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
public class duplicateWithinStrings {
    
    public static void main(String [] args)
    {
        String str = "Programming";
        System.out.println(checkDupsCharacter(str));
    }
    
    public static char checkDupsCharacter(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        
        for(char c : str.toCharArray())
        {
            if(map.containsKey(c))
            {
                map.put(c,map.get(c)+1);
            }
            else
            {
                map.put(c,1);
            }
        }
        
        for(Entry<Character,Integer> entryset : map.entrySet())
        {
            if(entryset.getValue() > 1)
            {
                //System.out.println(entryset.getKey() + " : " + entryset.getValue());
                return entryset.getKey();
                
            }
        }
        
        return ')';
    }
}
