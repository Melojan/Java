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
public class BigArraySum {
    
    public static void main(String [] args)
    {
        Scanner scr=new Scanner(System.in);
        long a=scr.nextLong();
        long [] ch=new long[(int)a];
        for(long j=0;j<a;j++)
        {
            ch[(int)j]=scr.nextLong();
        }
        Arrays.sort(ch);
        System.out.println(ch[0]+ch[(int)a-1]);
    }
}
