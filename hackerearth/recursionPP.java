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
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
public class recursionPP {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Please input the expression: ");
        String input = br.readLine();
        
        
        ArrayList<Character> numbers = numbersOnly();
        
        if(numbers.contains(input.charAt(0)) && input.length() == 1)
        {
            System.out.println(input);
        }
        else if(input.contains("+") && input.contains("!") && input.length() >= 2)
        {
            int addThose = getDigit(input);
            int sum = add(addThose);
            System.out.println(sum);
            
        }
        else if(input.contains("!") && numbers.contains(input.charAt(1)))
        {
           int a = factorial(Character.getNumericValue(input.charAt(1)));
           System.out.println(a);
        }
        
  
    }
    
    private static ArrayList<Character> numbersOnly()
    {
        ArrayList<Character> list = new ArrayList();
        
        list.add('1');
        list.add('2');
        list.add('3');
        list.add('4');
        list.add('5');
        list.add('6');
        list.add('7');
        list.add('8');
        list.add('9');
        
        return list;
    }
    
    private static ArrayList<Character> expsOnly()
    {
        ArrayList<Character> list = new ArrayList();
        
        list.add('+');
        list.add('*');
        list.add('!');
        
        return list;
    }
    
    private static int factorial(int N)
    {
        if(N < 0)
        {
            throw new IllegalArgumentException("N cannot be negative");
        }
        
        if(N == 0 || N == 1)
        {
            return N;
        }
        
        return N * factorial(N-1);
    }
    
    private static int add(int N)
    {
        int sum = 0;
        
        sum = N % 10;
        if(N == 0)
        {
            return 0;
        }
        else
        {
            return sum + add(N / 10);
        }
    }
    
    public static int getDigit(String str)
    {
		String result = "";
		
		for(int i = 0 ; i < str.length() ; i++)
		{
			char c = str.charAt(i);
			
			if(Character.isDigit(c))
			{
				result += c;
			}
			else
			{
				break;
			}
		}
	
        return Integer.parseInt(result);
    }
    
    
}
