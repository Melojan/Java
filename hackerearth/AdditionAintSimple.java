/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

/**
 *
 * @author meloj
 */
import java.io.*;
public class AdditionAintSimple {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < a ; i++)
        {
            String s1 = br.readLine();
            long len = s1.length();
            
            for(int j = 0 ; j < len ; j++)
            {
                int a1 = s1.charAt(j) - 96;
                int a2 = s1.charAt((int)len-1-j) - 96;
                int a3 = a1 + a2;
                while(a3 > 26)
                {
                    a3 -=26;
                }
                
                a3 += 96;
                System.out.print((char)a3);
            }
            System.out.println();
        }
    }
} 
