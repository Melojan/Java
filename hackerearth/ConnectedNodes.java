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
import java.io.*;
public class ConnectedNodes {
    
    static ArrayList<Integer> arr[];
    static ArrayList<Integer> res;
    
    public static void main(String [] args)
    {
        
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        
        arr = new ArrayList[n+1];
        res = new ArrayList<>(2 * n);
        
        for(int i = 1 ; i <= n ; i++)
        {
            arr[i] = new ArrayList<>();
        }
        
        for(int i = 0 ; i < m ; i++)
        {
            int u = input.nextInt();
            int v = input.nextInt();
            arr[u].add(v);
            arr[v].add(u);
        }
        
        dfs(1,new boolean[n+1]);
        
        System.out.println(res.size());
        for(int e : res)
        {
            System.out.print(e + " ");
        }
        
    }
    
    
    
    public static void dfs(int u , boolean [] visited)
    {
        visited[u] = true;
        res.add(u);
        
        for(int v : arr[u])
        {
            if(!visited[v])
            {
                dfs(v,visited);
                res.add(u);
            }
        }
    }
    
    
}
