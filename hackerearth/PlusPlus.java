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
public class PlusPlus {
     public static void main(String args[] ) throws Exception {
       
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input[] =br.readLine().trim().split(" ");
        int n=Integer.parseInt(input[0]);
        int m=Integer.parseInt(input[1]);
        int arr[][]=new int [100][100];
        int i=0,j=0,k=0,l=0;
        int sum=0,max=0;
        int temp=n;
        
        while(temp-->0){
            input =br.readLine().trim().split(" ");
           
            for(j=0;j<m;j++){
                arr[i][j]=Integer.parseInt(input[j]);
            }
            i++;   
            
            
        }
       for(i=1;i<n-1;i++)
        {
            for(j=1;j<m-1;j++)
            {
                for(k=1;k<n-1;k++)
                {
                    for(l=1;l<n-1;l++)
                    {  if(Math.abs(l-j)>=2||Math.abs(k-i)>=2)
                    {
                        sum=calculatesum(i,j,k,l,arr);
                        if(sum>max)
                        {
                            max=sum;
                        }
                        
                    }
                    }
                    
                }
            }
        }
        System.out.println(max);
    
        }
      static int  calculatesum(int i ,int j,int k,int l,int arr[][]){
            int top=arr[i-1][j]*arr[k-1][l];
            int center=arr[i][j]*arr[k][l];
            int bottom=arr[i+1][j]*arr[k+1][l];
            int left =arr[i][j-1]*arr[k][l-1];
            int right=arr[i][j+1]*arr[k][l+1];
            int sum =top+center+bottom+left+right;
            return sum;
    }
}
