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
import java.util.*;
public class Anagram {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        while(n -- > 0)
        {
            String a = input.next();
            String b = input.next();
            
            int [] arr = new int[26];
            
            for(int i = 0 ; i < a.length() ; i++)
            {
                arr[a.charAt(i) - 97]++;
            }
            
            for(int i = 0 ; i < b.length() ; i++)
            {
                arr[b.charAt(i) - 97]--;
            }
            
            int count = 0;
            
            for(int i = 0 ; i < 26 ; i++)
            {
                count += Math.abs(arr[i]);
            }
            
            System.out.println(count);
        }
    }
}
