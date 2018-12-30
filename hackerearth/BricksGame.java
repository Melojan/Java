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
public class BricksGame {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int rest = n;
        
        for(int i = 1 ; i <= n ; i++)
        {
            if(rest >= i)
            {
                if(rest == i)
                {
                    System.out.println("Patlu");
                    break;
                }
                else
                {
                    rest = rest - i;
                    if(rest <= 2 * i)
                    {
                        System.out.println("Motu");
                        break;
                    }
                    else
                    {
                        rest = rest - 2*i;
                    }
                }
            }
            else
            {
                System.out.println("Patlu");
                break;
            }
        }
    }
}
       
 