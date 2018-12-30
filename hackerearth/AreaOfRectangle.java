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
public class AreaOfRectangle {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        
        int [][] rectangleMatrix = new int[1000][1000];
        int totalArea = 0;
        
        for(int i = 0 ; i < num ; i++)
        {
            int x1 = input.nextInt();
            int y1 = input.nextInt();
            int x2 = input.nextInt();
            int y2 = input.nextInt();
            
       
            for(int a = x1; a < x2 ; a++) 
            {
                for(int b = y1 ; b < y2; b++)
                {
                    System.out.println(a + " "+ b);
                    rectangleMatrix[a][b] += 1;
                    System.out.println(rectangleMatrix[a][b]);
                    if(rectangleMatrix[a][b] == 1)
                    {
                        totalArea++;
                    }
                }
            }
        }
        
        System.out.println(totalArea);
        input.close();
    }
}
