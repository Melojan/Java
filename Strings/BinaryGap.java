/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

public class BinaryGap {
    
    public int solution(int N)
    {
        return solution(N,false,0);
    }

    public int solution(int N, boolean flag, int max)
    {
        int temp = 0;
        
        while( N != 0) 
        {
            if(N % 2 == 1)  
            {
                flag = true;        
                if(temp > max)   
                {
                    max = temp;
                    System.out.println("MAX is " + max);
                    System.out.println("TEMP is " + temp);
                }
                temp = 0;
            }
            else
            {
                if(flag == true)
                {
                    temp++;
                }
            }
            System.out.println(N);
            N = N/2;
            System.out.println("N is " + N);
        }
        
        return max;
    }
  
         
    public static void main(String [] args)
    {
        BinaryGap obj = new BinaryGap();
        System.out.println(obj.solution(20));
    }
}
