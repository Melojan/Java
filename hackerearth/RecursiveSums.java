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

public class RecursiveSums {

    public static void main(String [] args) throws Exception
    {
    
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long test=Long.parseLong(br.readLine());
        long m,t,n;
        long sum;
        int flag=0;
        String input[];
        while(test-- > 0){
            sum=0;
            flag=0;
            m=Long.parseLong(br.readLine());
            while(m-->0){
                input=br.readLine().trim().split(" ");
                t=Long.parseLong(input[0]); //2 
                n=Long.parseLong(input[1]); //1
                if(t!=0&&n!=0) 
                {
                    //t=t%9==0?9:t%9;

                    sum+=(t*n)%9==0?9:(t*n)%9;
                    if(sum>9)
                    flag=1;
                }
                
            }
            if(flag==1)
            sum=sum%9==0?9:sum%9;
            System.out.println(sum);
        }
 
    }
}