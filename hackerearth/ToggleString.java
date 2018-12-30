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
public class ToggleString {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0 ; i < word.length() ; i++)
        {
            char c = word.charAt(i);
            
            if(Character.isUpperCase(c))
            {
                sb.append(Character.toLowerCase(c));
            }
            else
            {
                sb.append(Character.toUpperCase(c));
            }
        }
        
        System.out.println(sb.toString());
    }
}
