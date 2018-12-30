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
public class ReverseWords {
    
    public static void main(String [] args)
    {
        String sentence = "Melo";
        reverseWords(sentence);
    }
    
    public static void reverseWords(String sentence)
    {
        String strWithoutWhiteSpace = sentence.trim();
        System.out.println(strWithoutWhiteSpace);
        
        String withoutspace = sentence.replaceAll("\\s"," ");
        System.out.println(withoutspace);
        
        String takeSome = sentence.substring(8,sentence.length()).toUpperCase();
        System.out.println(takeSome);
        
        if(takeSome.contains("KING"))
        {
            System.out.println("KingMelojan");
        }
    }
}
