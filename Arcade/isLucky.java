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
public class isLucky {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        boolean ret = isLucky(n);
        System.out.println(ret ? true : false);
    }
    
    public static boolean isLucky(int n)
    {
        String str = String.valueOf(n);
        int sum = 0;
        
        for(int i = 0 ; i < str.length()/2 ; i++)
        {
            sum += (str.charAt(i) - str.charAt(str.length() - 1 - i));
        }
        
        if(sum == 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}
