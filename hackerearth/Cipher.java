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
import java.io.*;
public class Cipher {

    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        char [] arr = str.toCharArray();
        
        int k = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] >= 65 && arr[i] <= 90)
            {
                arr[i] = (char) (((arr[i] - 65 + k % 26) % 26) + 65);
            }
            else if(arr[i] >= 97 && arr[i] <= 122)
            {
                arr[i] = (char) (((arr[i] - 97 + k % 26) % 26) + 97);
            }
            else if(arr[i] >= 48 && arr[i] <= 57)
            {
                arr[i] = (char) (((arr[i] - 48 + k % 10) % 10) + 48);
            }
        }
        
        System.out.println(new String(arr));
    }
    
    //ASCI Model so 65 <= x <= 90 is the same as A to Z
    //              97 <= x <= 122 is the same as a to z
    //              48 <= x <= 57 is the same as 0 - 9 
    
    // Alphabets you mod 26 and numbers you mod 10
}
