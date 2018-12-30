/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arcade;

/**
 *
 * @author meloj
 */
import java.util.*;
public class areSimilar {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        int [] a = new int[n];
        int [] b = new int[n];
        
        for(int i = 0 ; i < a.length ; i++)
        {
            a[i] = input.nextInt();
        }
        
        for(int i = 0 ; i < b.length ; i++)
        {
            b[i] = input.nextInt();
        }
        
        boolean ret = areSimilar(a,b);
        System.out.println(ret ? true : false);
    }
    
    public static boolean areSimilar(int [] a , int [] b)
    {
        int count = 0;
        
        for(int i = 0 ; i < a.length ; i++)
        {
            if(a[i] != b[i])
            {
                count++;
            }
        }
        
        if(count > 2)
        {
            return false;
        }
        
        return true;
    }
}
