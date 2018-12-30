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
public class StringOperation {
    
   public static void main(String [] args)
   {
    
   Scanner sc=new Scanner(System.in);
        String s=sc.next();
        int q=sc.nextInt();
        int i;
        
        for(i=0;i<q;i++)
        {
            int index=sc.nextInt();
            char ch=sc.next().charAt(0);
            
            StringBuilder myName = new StringBuilder(s);
            myName.setCharAt(index-1,ch);
            s=myName.toString();
        }
        String res1=s;
        System.out.println(res1);
        
        int m=sc.nextInt();
        for(i=0;i<m;i++)
        {
            int index1=sc.nextInt();
            int index2=sc.nextInt();
            
            String temp1=s.substring(0,index1-1);
            String temp2=s.substring(index2,s.length());
            
            StringBuilder myName = new StringBuilder(s.substring(index1-1,index2));
            myName=myName.reverse();
            String temp3=myName.toString();
            
            //System.out.println("TEMP1="+temp1);
            //System.out.println("TEMP2="+temp2);
            //System.out.println("TEMP3="+temp3);
            
            s=temp1+temp3+temp2;
        }
        String res2=s;
        System.out.println(res2);
        
        int count=0;
        for(i=0;i<s.length();i++)
        {
            if(res1.charAt(i)==res2.charAt(i))
              count++;
        }
        System.out.println(count);
        
    }
          
}

/*

Scanner s = new Scanner(System.in);
        StringBuilder name =new StringBuilder(s.nextLine());                 // Reading input from STDIN
     //   System.out.println("Hi, " + name + ".");    // Writing output to STDOUT
int ind=0,a=0,b=0;
char ch='\0';
 
       int Q = s.nextInt();
       s.nextLine();
       for(int i=0;i<Q;i++){
           ind=s.nextInt();
           ch=s.next(".").charAt(0);
           s.nextLine();
           name.setCharAt(ind-1,ch);
           
       }
       System.out.println(name);
       StringBuilder fin = new StringBuilder(name);
       StringBuilder temp;
       int M=s.nextInt();
       s.nextLine();
       for(int j=0;j<M;j++){
           a=s.nextInt();
           b=s.nextInt();
         //  s.nextLine();
           temp=new StringBuilder(fin.toString().substring(a-1,b));
           temp.reverse();
           fin.replace(a-1,b,temp.toString());
       }
       System.out.println(fin.toString());
       int sum=0;
       for(int i=0;i<name.length();i++){
           if(name.charAt(i)==fin.charAt(i)){
               sum++;
           }
       }
       
       System.out.println(sum);
*/
