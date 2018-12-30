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
public class CountDivisors {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(br.readLine());
        int r = Integer.parseInt(br.readLine());
        int k = Integer.parseInt(br.readLine());
        
        
        int count = 0;
        for(int i = l ; i <= r ; i++)
        {
            if(i % k == 0)      //1 % 1 == 1 
            {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
