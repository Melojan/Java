/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

/**
 *
 * @author meloj
 */
public class Factorial {
    
    public static void main(String [] args)
    {
        
    }
    
    public static int factorial(int num) throws IllegalArgumentException
    {
        if(num < 0)
        {
            throw new IllegalArgumentException("number cannot be negative");
        }
        
        if(num == 0)
        {
            return 1;
        }
        
        int factorial = 1;
        
        for(int i = 1 ; i <= num ; i++)
        {
            factorial *= i;
        }
        
        return factorial;
        
    }
}
