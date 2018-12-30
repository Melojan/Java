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
public class countOccurence {
    
    public static void main(String [] args)
    {
        String str = "Java";
        System.out.println(countOccurence(str));
    }
    
    public static int countOccurence(String str)
    {
        int count = 0;
        int counter = 0;
        
        if(str.length() < 1)
        {
            return 0;
        }
        
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) == 'a')
            {
                count++;
            }
        }
        
        System.out.println(count);
        
        for(char c : str.toCharArray())
        {
            if(c == 'a')
            {
                counter++;
            }
        }
        
        
        return counter;
        
        
    }
}