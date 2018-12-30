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
class TestClass {
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        
        int size = word.length();
        
        String str = getAnswer(word,size);
        System.out.println(str);
    }
    
    public static String getAnswer(String word , int size)
    {
        
        for(int i = 0 ; i < size ; i++)
        {
            if(word.contains("111111") || word.contains("000000"))
            {
                return "Sorry, sorry!";
            }
        }
        
        return "Good luck!";
    }
}
