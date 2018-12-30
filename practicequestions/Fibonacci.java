package practicequestions;
        
import java.util.*;
public class Fibonacci
{
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] memo = new int[n+1];
        
        System.out.println(getFibonacciRec(n,memo));
        System.out.println(getFibonacci(n));
    }
    
    public static int getFibonacciRec(int n, int [] memo)
    {
        int result = 0;
        
        if(memo[n] != result)
        {
            return memo[n];
        }
        
        if(n == 1 || n == 2)
        {
            result = 1;
        }
        else
        {
            result = getFibonacciRec(n-1,memo) + getFibonacciRec(n-2,memo);
        }
        
        memo[n] = result;
        return result;
    }
        
        
        //This is inefficient , to make it more efficient , you could store the return value in an array said by Dynamic Programming
        //This process is called Memoized Solution
        // After the third if is executed at most N times. thats 1 to N. Each function is called it stored in the array.
        // The number of times getFibonacciRec is called is at most 2n + 1 , 2n is called getFibonacciRec(n-1) + getFibonacci(n-2)
        // and 1 comes from the first line it is called getFibonacci(n,memo).
        // The Time is called is on O(1) excluding the recursive call ,then each operation is a constant time operation. 
        // This it is O(1) = O(2n+1) = O(N) ,which is less than O(2N)
       
    
    public static int getFibonacci(int n)
    {
        if(n < 0)
        {
            new IllegalArgumentException("n cannot be negative");
        }
        
        if(n == 0 || n == 1)
        {
            return n;
        }
        
        int a = 0;
        int b = 1;
        int c = a + b;
        
        for(int i = 2 ; i <= n ; i++)
        {
            c = a + b;
            a = b;
            b = c;
        }
        
        return c;
    }
}
