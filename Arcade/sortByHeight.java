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
public class sortByHeight {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int [] arr = new int[n];
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = input.nextInt();
        }
        
        int [] result = sortByHeight(arr);
        System.out.println(Arrays.toString(result));
    }
    
    public static int [] sortByHeight(int [] arr)
    {
        ArrayList<Integer> arrList = new ArrayList<>();
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > 0)
            {
                arrList.add(arr[i]);
            }
        }
        
        Collections.sort(arrList);
        
        int index = 0;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] > 0)
            {
                arr[i] = arrList.get(index);
                index++;
            }
        }
        
        return arr;
    }
}
