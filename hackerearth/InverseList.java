package hackerearth;

import java.io.*;
import java.util.*;
class InverseList
{
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int t = Integer.parseInt(br.readLine()); 
        for(int z = 0 ; z < t ; z++)
        {
            int n = Integer.parseInt(br.readLine()); 
            int [] a = new int[n];
            String [] s = br.readLine().split(" "); 
            for(int i = 0 ; i < n ; i++)
            {
                a[i] = Integer.parseInt(s[i]); 
            }
            int b [] = new int[n]; 
            for(int i = 0 ; i < n ; i++)
            {
                b[a[i]-1] = i + 1;
            }
            int f = 0;
            for(int i = 0 ; i < n ; i++)
            {
                if(a[i] != b[i])
                {
                    out.println("not inverse");
                    f = 1;
                    break;
                }
            }
            
            if(f == 0)
            {
                out.println("inverse");
            }
        }
        
        out.close();
        
     
    }
}