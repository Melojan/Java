/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arcade;

public class GenTrack1 {
    public static boolean validate(String username) {
        
        if(Character.isDigit(username.charAt(0)) && username.endsWith("-"))
        {
                return false;
        }
        
        int maxChar = username.length();
        
        if(maxChar > 6 && maxChar > 16)
        {
            return false;
        }
      
        
            for(char c : username.toCharArray())
            {
                if(!Character.isDigit(c) && !Character.isLetter(c) && c != '-')
                {
                    return false;
                }
            }
        

        return true;
    }
    
    public static void main(String[] args) {
        System.out.println(validate("Mike-Standish")); // Valid username
        System.out.println(validate("Mike Standish")); // Invalid username
    }
}

