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
public class TheGreatKian {
    
    public static void main(String [] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        
        long sum1 = 0 , sum2 = 0 , sum3 = 0;
        
        for(int i = 0 ; i < N ; i++)
        {
            if(i%3 == 0)
            {
                sum1+=input.nextInt();
            }
            else if(i%3 == 1)
            {
                sum2+=input.nextInt();
            }
            else
            {
                sum3+=input.nextInt();
            }
        }
        
        System.out.println(sum1 + " " + sum2 + " " + sum3);
    }
}
