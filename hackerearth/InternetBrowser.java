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
public class InternetBrowser {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 1 ; i <= N ; i++)
        {
            String word = br.readLine();
            int length = word.length();
            int n  = length;
            for(int j = 0 ; j < length ; j++)
            {
                char c = word.charAt(j);
                if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
                {
                    n--;
                }
            }
            
            n = n++;
            n = n - 3;
            System.out.println(n + "/" + length);
        }
    }
}
