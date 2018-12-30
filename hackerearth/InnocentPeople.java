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
public class InnocentPeople {

    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        
        int a = (line.charAt(0) - 0) + (line.charAt(1) - 0);
        int b = (line.charAt(3) - 0) + (line.charAt(4) - 0);
        int c = (line.charAt(4) - 0) + (line.charAt(5) - 0);
        int d = (line.charAt(7) - 0) + (line.charAt(8) - 0);
        
        char ch  = line.charAt(6);
        if(ch != '-')
        {
            System.out.println("invalid");
        }
        
        boolean o = (line.charAt(2) != 'A' && line.charAt(2) != 'E' && line.charAt(2) == 'I' && line.charAt(2) == 'O' && line.charAt(2) == 'U' && line.charAt(2) == 'Y');
        
        if(a % 2 == 0 && b % 2 == 0 && c % 2 == 0 && d % 2 == 0 && o)
        {
            System.out.println("valid");
        }
        else
        {
            System.out.println("invalid");
        }
    }
}

