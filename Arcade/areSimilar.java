/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Arcade;

/**
 *
 * @author meloj
 */
import java.util.*;
public class areSimilar {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();

        int [] a = new int[n];
        int [] b = new int[n];
        
        for(int i = 0 ; i < a.length ; i++)
        {
            a[i] = input.nextInt();
        }
        
        for(int i = 0 ; i < b.length ; i++)
        {
            b[i] = input.nextInt();
        }
        
        boolean ret = areSimilar(a,b);
        System.out.println(ret ? true : false);
    }
    
    public static boolean areSimilar(int[] a, int[] b) {

    ArrayList<Integer> arrList = new ArrayList<>();
    for(int i = 0 ; i < a.length ; i++)
    {
        if(a[i] != b[i])
        {
            arrList.add(i); 
        }
    }
    
    if(arrList.size() == 0)
    {
        return true;
    }
    
    if(arrList.size() != 2)
    {
        return false;
    }
    
    int id1 = arrList.get(0);
    int id2 = arrList.get(1);
    
    if(a[id1] == b[id2] && a[id2] == b[id1])
    {
        return true;
    }
    
    return false;
}

           
