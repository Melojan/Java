/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arcade;

/**
 *
 * @author meloj
 */
import java.util.*;
public class AllLongestStrings {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n  = input.nextInt();
        
        String [] strArray = new String[n];
        
        for(int i = 0 ; i < strArray.length ; i++)
        {
            strArray[i] = input.nextLine();
        }
        
        String [] results = allLongestStrings(strArray);
        
        for(int i = 0 ; i < results.length ; i++)
        {
            System.out.print(results[i] + " ");
        }
    }
    
    public static String [] allLongestStrings(String [] strArray)
    {

        int longestChar = strArray[0].length();
        String longestword = strArray[0];
        
        for(int j = 1 ; j < strArray.length ; j++)
        {
            if(strArray[j].length() == longestChar)
            {
                longestword = longestword + "," + strArray[j];
                continue;
            }
        
            if(strArray[i].length() > longestChar)
            {
                longestChar = strArray[i].length();
                longestword = strArray[i];
                continue;
            }
                
         }
        
        return longestword.split(",");
                  
    }
          
}
    
    

