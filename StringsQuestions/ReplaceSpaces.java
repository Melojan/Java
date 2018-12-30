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
public class ReplaceSpaces {
    
    public static void main(String [] args)
    {
        String str = "Java is Great";
        
        String result = addingSpace(str);
        String builderResult = addingSpaceBuilder(str);
        
        System.out.println(result);
        System.out.println(builderResult);
    }
    
    public static String addingSpace(String str)
    {
        String addingSpaces = str.replaceAll("\\s","%20");
        
        return addingSpaces;
    }
    
    public static String addingSpaceBuilder(String str)
    {
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < str.length() ; i++)
        {
            char c = str.charAt(i);
            
            if(c == ' ')
            {
                sb.append("%20");
            }
            else
            {
                sb.append(c);
            }
        }
        
        return sb.toString();
    }
}
