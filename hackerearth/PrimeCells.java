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
public class PrimeCells {
    
    public static void main(String [] args)
    {
        Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int[][] a = new int[n + 2][n + 2];
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    a[i][j] = in.nextInt();
                }
            }
            int ctr = 0;
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j <= n; j++)
                {
                    int sum = 0;
                    sum += a[i - 1][j];
                    sum += a[i + 1][j];
                    sum += a[i][j + 1];
                    sum += a[i][j - 1];
                    if (IntegerUtils.isPrime(sum))
                    {
                        ctr++;
                    }
                }
            }
            System.out.println(ctr);
        }
    
         static class IntegerUtils
        {
        public static boolean isPrime(long number)
        {
            if (number < 2)
            {
                return false;
            }
            for (long i = 2; i * i <= number; i++)
            {
                if (number % i == 0)
                {
                    return false;
                }
            }
            return true;
        }
    }
}


