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

public class PalindromicNumbers {

    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        while(N-- > 0)
        {
            int count = 0;
            String [] input = br.readLine().trim().split(" ");
            int A = Integer.parseInt(input[0]);
            int B = Integer.parseInt(input[1]);
            
            for(int i = A ; i <= B ; i++)
            {
                if(isPalindromic(i))
                {
                    count++;
                }
            }
            
            System.out.println(count);
        }
        
    }
    
    private static boolean isPalindromic(int target)
    {
        int palindrome = target;
        int reverse = 0;
        
        while(palindrome != 0)
        {
            int remainder = palindrome % 10;
            reverse = reverse * 10 + remainder;
            palindrome /= 10;
        }
        
        return target == reverse;
    }
}
