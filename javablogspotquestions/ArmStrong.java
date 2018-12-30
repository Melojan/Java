/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablogspotquestions;

/**
 *
 * @author meloj
 */
public class ArmStrong {
    
    public static void main(String [] args)
    {
        int n = 153;
        System.out.println(checkArmStrong(n));
    }
    
    public static boolean checkArmStrong(int n)
    {
        int tempVal = n;
        
        int c = 0;
        
        int a = 0;
        
        while(n > 0)
        {
            a = n % 10; 
            n = n / 10;   
            c = c + (a*a*a);   
        }
        
        return (tempVal == c) ? true : false;
    }
}
