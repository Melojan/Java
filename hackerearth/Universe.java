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
public class Universe {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        while(true)
        {
            int n = input.nextInt();
            if(n != 42)
            {
                System.out.println(n);
            }
            else
            {
                break;
            }
        }
    }
}
