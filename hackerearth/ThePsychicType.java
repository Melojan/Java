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
public class ThePsychicType {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int [] arr = new int[n];
        
        String [] str = br.readLine().split(" ");
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = Integer.parseInt(str[i]);
        }
        
        str = br.readLine().split(" ");
        int s = Integer.parseInt(str[0]);
        int e = Integer.parseInt(str[1]);
        
        int [] visited = new int[n];
        
        while(visited[s-1] == 0 && s != e)
        {
            visited[s-1]++;
            s = arr[s-1];
        }
        
        if(s != e)
        {
            System.out.println("No");
        }
        else
        {
            System.out.println("YES");
        }
    }
}
