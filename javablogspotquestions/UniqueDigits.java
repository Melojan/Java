/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablogspotquestions;

import java.io.*;

/**
 *
 * @author meloj
 */
public class UniqueDigits {
    
    public static void main(String [] args) throws IOException
    {
        
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        String s = String.valueOf(n);
        int flag = 0;
        
        System.out.println(uniqueDigits(s,flag));
    }
    
    public static boolean uniqueDigits(String s, int flag)
    {
        for(int i = 0 ; i < s.length() - 1 ; i++)
        {
            for(int j = i + 1 ; j < s.length() ; j++)
            {
                if(s.charAt(i) == s.charAt(j))
                {
                    //flag = 1;
                    //break;
                    
                    return false;
                }
            }
        }
        
        return true;
        
        /*if(flag == 0)
        {
            System.out.println("It is a unique number");
        }
        else
        {
            System.out.println("It is not a unique number");
        }*/
        
    }
}
