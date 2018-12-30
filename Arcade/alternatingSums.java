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
public class alternatingSums{
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        
        int [] arr = new int[n];
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = input.nextInt();
        }
        
        int [] result = alternatingSums(arr);
        System.out.println(Arrays.toString(result));
    }
    
    public static int [] alternatingSums(int [] arr)
    {

        int sum1 = 0;
        int sum2 = 0;
        
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(i%2 == 0)
            {
                sum1 += arr[i];
            }
            else
            {
                sum2 += arr[i];
            }
        }
        
        ArrayList<Integer> arrList = new ArrayList<>();
        
        arrList.add(sum1);
        arrList.add(sum2);
        
        int [] count = new int[arrList.size()];
        
        for(int i = 0 ; i < count.length ; i++)
        {
            count[i] = arrList.get(i);
        }
        
        return count;
    }
}
