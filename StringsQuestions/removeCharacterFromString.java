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
public class removeCharacterFromString {
    
    public static void main(String [] args)
    {
        String str = "Melo";
        char unwanted = 'o';
        System.out.println(removeChar(str,unwanted));
    }
    
    public static String removeChar(String str,char unwanted)
    {
        if(!str.contains(Character.toString(unwanted)))
        {
            throw new IllegalArgumentException("The character does not exist in the String");
        }
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < str.length() ; i++)
        {
            char c = str.charAt(i);
            
            if(c != unwanted)
            {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
