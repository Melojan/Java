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
import java.util.*;
public class EasyTask {

    public static void main(String args[] ) throws Exception {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int a[]=new int [n];
        int b[]=new int [n];
        int i;
        String[] inputa=br.readLine().trim().split(" ");
        String[] inputb=br.readLine().trim().split(" ");
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        for(i=0;i<n;i++){
            a[i]=Integer.parseInt(inputa[i]);
            b[i]=Integer.parseInt(inputb[i]);
            if(map.containsKey(a[i]))
            { 
                if(map.get(a[i])<b[i])
                    map.put(a[i],b[i]);
            }
            else{
                map.put(a[i],b[i]);
            }
        }
        for(i=0;i<n;i++){
            
               System.out.print(map.get(a[i])+" ");
        }
    }
}

