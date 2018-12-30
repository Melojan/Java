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
public class DigitProblem {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String [] arr = line.split(" ");
        int n = Integer.parseInt(arr[1]);
        char [] charArr = arr[0].toCharArray();
        
        char nine = '9';
        
        for(int i = 0 ; i < n ; i++)
        {
            if(charArr[i] == nine)
            {
               continue;
            }
            else
            {
                charArr[i] = nine;
            }
        }
        
        System.out.println(new String(charArr));
    }
}
