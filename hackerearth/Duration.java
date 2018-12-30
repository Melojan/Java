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
public class Duration {
    
        public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in);
                
                int n = input.nextInt();
                
                while(n-- > 0)
                {
                
                    int h = input.nextInt();
                    int m = input.nextInt();
                    
                    int h2 = input.nextInt();
                    int m2 = input.nextInt();
                
                    int hoursIntoMins1 = (h * 60) + m;
                    int hoursIntoMins2 = (h2 * 60) + m2;
                    
                    int result = Math.abs(hoursIntoMins2 - hoursIntoMins1);
                    
                    int hours = result / 60;
                    int minutes = result % 60;
                    
                    System.out.println(hours + " " + minutes);
                    
                }
    
	}
}
