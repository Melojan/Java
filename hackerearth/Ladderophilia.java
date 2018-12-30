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
public class Ladderophilia {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println("*   *");
            System.out.println("*   *");
            System.out.println("*****"); 
        }   
        
        System.out.println("*   *");
        System.out.println("*   *");
    }
}
