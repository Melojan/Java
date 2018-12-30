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
public class ProfilePicture {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int L = input.nextInt();
        int N = input.nextInt();
        
        while(N-- > 0)
        {
            int W = input.nextInt();
            int H = input.nextInt();
            
            if(W == H && W >= L && H >= L)
            {
                System.out.println("ACCEPTED");
            }
            else if(L > W || L > H) 
            {
                System.out.println("UPLOAD ANOTHER");
            }
            else
            {
                System.out.println("CROP IT");
            }
        }
    }
}
