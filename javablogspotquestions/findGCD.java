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
public class findGCD {
    
    public static void main(String [] args)
    {
        int a = 4;
        int b = 2;
        
        System.out.println(getGCD(a,b));
    }
    
    public static int getGCD(int a ,int b)
    {
        if(b == 0)
        {
            return a;
        }
        
        return getGCD(b,a%b);
    }
}
