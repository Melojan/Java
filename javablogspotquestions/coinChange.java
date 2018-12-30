/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablogspotquestions;

/**
 *
 * @author meloj
 */
import java.util.*;
import java.io.*;
public class coinChange {
    
    public static void main(String [] args) throws IOException
    {
       /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       String line = null;
       int amount = 0;
       
       line = br.readLine();
       amount = Integer.parseInt(line);
       
        int [] coins = {1,2,4};
        System.out.println(coinChange(coins,amount));*/
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int amount = 0;
        int [] coins = {1,2,4};
        
        while((line = br.readLine()) != null && line.length() != 0)
        {
            amount = Integer.parseInt(line);
            System.out.println(coinChange(coins,amount));
        }
    }
    
    public static int coinChange(int [] coins, int amount)
    {
        if(amount == 0)
        {
            return 0;
        }
        
        int n = amount + 1; 
        for(int coin : coins)
        {
            int curr = 0;
            if(amount >= coin) 
            {
                int next = coinChange(coins,amount - coin);
                if(next >= 0)
                {
                    curr = 1 + next; 
                }
            }
            
            if(curr > 0)
            {
                n = Math.min(n,curr);  
            }
        }
        
        int finalCount = (n == amount+1) ? -1 : n;
        return finalCount;
    }
}

