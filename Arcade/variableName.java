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
public class variableName {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        String str = input.nextLine();
        
        boolean ret = variableName(str);
        System.out.println(ret ? true : false);
        
    }
    
    public static boolean variableName(String str)
    {
        if(Character.isDigit(str.charAt(0)))
        {
            return false;
        }
        
        for(char c : str.toCharArray())
        {
            if(!Character.isDigit(c) && !Character.isLetter(c) && c != '_')
            {
                return false;
            }
        }
        
        return true;
    }
}
