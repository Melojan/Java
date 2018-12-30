/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

/**
 *
 * @author meloj
 */
public class LongestStrings {
    
    public static void main(String [] args)
    {
        String [] strArray = new String[]{"aba", "aa", "ad", "vcd" , "aba"};
        String [] results = allLongestString(strArray);
        for(int i = 0 ; i < results.length ; i++)
        {
            System.out.print(results[i] + " ");
        }
    }
    
    public static String [] allLongestString(String [] strArray) throws IllegalArgumentException
    {
        if(strArray == null || strArray.length < 0)
        {
            throw new IllegalArgumentException("Array cannot be empty");
        }
        
        int maxChar = strArray[0].length();
        String allLongestString = strArray[0];
        
        for(int i = 0 ; i < strArray.length ; i++)
        {
            if(strArray[i].length() == maxChar)
            {
                allLongestString = allLongestString + " , " + strArray[i];
                continue;
            }
            
            if(strArray[i].length() > maxChar)
            {
                maxChar = strArray[i].length();
                allLongestString = strArray[i];
                continue;
            }
        }
            
            return allLongestString.split(","); 
    }
          
}
