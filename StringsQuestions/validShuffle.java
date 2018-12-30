/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsQuestions;

import java.util.*;
public class validShuffle {

    public static void main(String [] args)
    {
        String first = "abc";
        String second = "def";
        String third = "dabecf";
        
        System.out.println(checkShuffle(first,second,third));
    }
    
    public static boolean checkShuffle(String first , String second, String third)
    {
        String combiner = first + second; //abcdef
        
        char [] charArray = combiner.toCharArray();
        char [] target = third.toCharArray();
        
        Arrays.sort(charArray);
        Arrays.sort(target);
        
        return new String(charArray).equals(new String(target));
        
    }
}
