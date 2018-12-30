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
public class ReverseSentence {
    
    public static void main(String [] args)
    {
        String str = "Java is best programming language";
        System.out.println(reverseSentence(str));
    }
    
    public static String reverseSentence(String str)
    {
        List<String> words = Arrays.asList(str.split("\\s"));
        Collections.reverse(words);
        
        StringBuilder sb = new StringBuilder(str.length());
        
        for(int i = words.size() - 1 ; i >= 0 ; i--)
        {
            sb.append(words.get(i));
            sb.append(' ');
        }
        
        return sb.toString().trim();
        
    }
}
