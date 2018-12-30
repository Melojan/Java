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
public class add {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        
        int result = add(a,b);
        System.out.println(result);
    }
    
    public static int add(int a,int b)
    {
        return a + b;
    }
}
