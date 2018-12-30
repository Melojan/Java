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
import java.util.regex.Pattern;
public class VowelRecognition {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
            
        while(n-- > 0)
        {
            String str = br.readLine();
            long N = str.length();
            long sum = 0;
            
            for(int i = 0 ; i < N ; i++)
            {
                if(isVowel(str.charAt(i)) == true)
                {
                    sum += (i+1) * (N-i);
                }
            }
            System.out.println(sum);
            
        }
    }      
    
    private static boolean isVowel(char c)
    {
        if(Pattern.matches("[a|e|i|o|u|A|E|I|O|U]",Character.toString(c)))
        {
            return true;
        }
        
        return false;
        
        /*if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
        {
            return true;
        }
        
        return false;*/
    }
}
