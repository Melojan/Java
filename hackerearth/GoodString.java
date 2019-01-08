/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

/**
 *
 * @author meloj
 */import java.io.*;
public class GoodString {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int [] arr = new int[26];
        for(char ch : line.toCharArray())
        {
            if((ch >= 97) && (ch <= 122))
            {
                arr[ch-97]++;
            }
        }
        
        int length = 0;
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > 1)
            {
                length = length + arr[i] - 1;
            }
        }
        
        System.out.println(length);
    }
}
