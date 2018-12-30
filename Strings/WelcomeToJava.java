
package Strings;

import java.util.*;
public class WelcomeToJava {
    
    public static void main(String [] args)
    {
        simplePrint();
        checkWeird();
        multipleLoop();
        converter();
        System.exit(0);
    }
    
    public static void simplePrint()
    {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
    
    public static void checkWeird()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        String ans = " ";
        
        if(n%2 == 1)
        {
            ans = "Weird";
        }
        else
        {
            if(n>2 && n <5)
            {
                ans = "Not Weird";
            }
            else if(n > 6 && n <= 20)
            {
                ans = "Weird";
            }
            else
            {
                ans = "Not Weird";
            }
        }
        
        System.out.println(ans);
    }
    
    public static void multipleLoop()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        for(int i = 1 ; i <=10 ;i++)
        {
            System.out.println(n + " x " + i + " = " + n * i);
        }
    }
    
    public static void converter()
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        // turn Integer to String ( Integer.toString(int value) )
        String s = Integer.toString(n);
        
        System.out.println("Hello , My name is " + s);
        
        // turn String to Integer ( Integer.parseInt(String value))
        int k = Integer.parseInt(s);
        
        int sum = k + 2;
        
        System.out.println(sum);
        
    }
        
    
    
}
