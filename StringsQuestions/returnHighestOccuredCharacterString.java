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
public class returnHighestOccuredCharacterString {
    
    public static void main(String [] args)
    {
        String str = "bbbbbbaaaaaaaaaaaaaaaacdddddddeeeee";
        System.out.println(mostOccured(str));
    }
    
    public static char mostOccured(String str)
    {
        HashMap<Character,Integer> map = new HashMap<>();
        
        int max = Integer.MIN_VALUE;
        char maxChar = ' ';
        
        for(char c : str.toCharArray())
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
        
        for(char c : str.toCharArray())
        {
            if(map.get(c) > max)
            {
                max = map.get(c);
                maxChar = c;
                
            }
        }
        
        return maxChar;
        
    }
}
