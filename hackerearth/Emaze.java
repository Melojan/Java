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
public class Emaze {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        int X = 0;
        int Y = 0;
        
        for(int i = 0 ; i < line.length() ; i++)
        {
            char c = line.charAt(i);
            
            switch(c)
            {
                case 'R':
                    X++;
                    break;
                case 'L':
                    X--;
                    break;
                case 'U':
                    Y++;
                    break;
                case 'D':
                    Y--;
                    break;
            }
        }
        
        System.out.println(X + " " + Y);
    }
}
