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
import java.math.BigDecimal;
import java.util.*;
public class ArraySum {
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        
        long sum = 0;

        for(int i = 0 ; i < n ; i++)
        {
            sum += input.nextLong();
        }
        
        System.out.println(sum);
    }
}
