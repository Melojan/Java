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
public class arrayReplace {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int elemToReplace = 1;
        int substitutionElem = 3;
        
        int [] arr = new int[n];
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = input.nextInt();
        }
        
        int [] results = arrayReplace(arr,elemToReplace,substitutionElem);
        System.out.println(Arrays.toString(results));
    }
    
    public static int [] arrayReplace(int [] arr , int elemToReplace, int substitutionElem) throws IllegalArgumentException
    {   
        
      try{  
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == elemToReplace)
            {
              arr[i] = substitutionElem;
            }
        }
      }catch(Exception e)
              {
              System.out.println("elemToReplace not found!");
              }
     
      return arr;
    } 
}
