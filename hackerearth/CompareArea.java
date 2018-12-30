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
public class CompareArea {
    
    public static void main(String [] args) throws Exception
    {
        Scanner input = new Scanner(System.in);
       
        int n = input.nextInt();
        
        double area = 0;
        int count = 0;
        
        while(n-- > 0)
        {
            double r = input.nextInt();
            double x = input.nextInt();
            
            double horlicks = 100 * x;
            
            area = (22 * (double)Math.pow(r,2)) / 7;
            if(area < horlicks)
            {
                count++;
            }
        }
        
        System.out.println(count);
    }
}
