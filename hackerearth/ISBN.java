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
public class ISBN {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ISBN = Integer.parseInt(br.readLine());
        
        int digit = 0;
        int sum = 0;
        int count = 10;
        
        String str = String.valueOf(ISBN);
        
        if(str.length() < 10)
        {
            System.out.println("Illegal ISBN");
        }
        
        
        if(ISBN > 1000000000)
        {
            for(int i = 0 ; i < 11 ; i++)
            {
                digit = ISBN % 10;
                sum += digit * count;
                ISBN = ISBN / 10;
                count--;
            }
            
            if(sum % 11 == 0)
            {
                System.out.println("Legal ISBN");
            }
            else
            {
                System.out.println("Illegal ISBN");
            }
        }
        else
        {
            System.out.println("Illegal ISBN");
        }
        
        
        /*BufferedReader br = new BufferedReader(new InputStream(System.in));
        String isbn = br.readLine();
        
        if(isbn.length() != 10)
        {
            System.out.println("Illegal ISBN");
            return;
        }
        
        int sum = 0;
        for(int i = 0 ; i < 10 ; i++)
        {
            int val = isbn.charAt(i) - '0';
            sum += (i+1) * val;
        }
        
        System.out.println((sum % 11 == 0) ? "Legal ISBN" : "Illegal ISBN");
        */
        
    }
}
