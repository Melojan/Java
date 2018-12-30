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
public class ques2 {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int X = input.nextInt();
        int Y = input.nextInt();
        
        int temp;
        
        boolean flag = false;
        
        for(int i = 0 ; i < N ; i++)
        {
            temp = input.nextInt();
            if(temp >= X && temp <= Y)
            {
                flag = true;
            }
            else
            {
                flag = false;
                break;
            }
        }
        
        if(flag)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
        
    }
}
