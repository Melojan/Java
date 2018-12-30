/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablogspotquestions;

public class StringRotation {
    
    public static void main(String [] args)
    {
        String str = "abcd";
        String rotate = "cabd";
        
        boolean check = checkRotation(str,rotate);
        System.out.println(check ? true : false);
    }
    
    public static boolean checkRotation(String str, String rotate)
    {
        //return str.length() == rotate.length() && (str + str).contains(rotate);
        
        if(str.length() > rotate.length())
        {
            return false;
        }
        
        String big = str + str; //abcdabcd
        String bigger = big + rotate; //abcdabcdcabd
        if(bigger.contains(rotate))
        {
            return true;
        }
        
        return false;
    }
    
}
