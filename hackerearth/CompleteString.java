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
import java.util.*;
public class CompleteString {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i = 0 ; i < N ; i++)
        {
            String s = br.readLine();
            char [] ch = s.toCharArray();
            TreeSet<Character> set = new TreeSet<Character>();
            for(char c : ch)
            {
                set.add(c);
            }
            
            if(set.size() == 26)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
