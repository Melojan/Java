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
public class countNumbers {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0)
        {
            int a = 0;
            int n = Integer.parseInt(br.readLine());
            
            char [] arr = br.readLine().toCharArray();
            
            for(int i = 0 ; i < n ; i++)
            {
                int j = arr[i];
                if(j >= 48 && j <= 57)
                {
                    if(i > 0)
                    {
                        int p = arr[i+1];
                        if(p >= 48 && p <= 57)
                        {
                            continue;
                        }
                    }
                    a++;
                }
            }
            
            System.out.println(a);
        }
    }
}
