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
public class commonCharacterCount {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        String s1 = input.nextLine(); //aabcc  //abca
        String s2 = input.nextLine(); //adcaa  // xyzbac
        
        int result = commonCharacterCount(s1,s2);
        System.out.println(result);   
    }
    
    public static int commonCharacterCount(String s1,String s2)
    {
        int [] a = new int[26];
        
        int [] b = new int[26];
        
        for(char k : s1.toCharArray())
        {
            a[k - 'a']++; //a = 2 , b = 1 , c = 2    //a = 2  b = 1 c = 1
        }
        
        for(char l : s2.toCharArray())
        {
            b[l - 'a']++; //a = 3 ,      , c = 1 , d = 1  //a = 1 b = 1 c = 1 x = 1 y = 1 , z = 1
        }
        
        int s = 0;
        
        for(int i = 0 ; i < 26 ; i++)
        {
            s += Math.min(a[i],b[i]);
            System.out.println(" S : " + s);
            System.out.println(Math.min(a[i],b[i]));
        }
        
        return s;
    }
}
