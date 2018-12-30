/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

/**
 *
 * @author meloj
 */
public class FindSmallestSumInteger {
    
    public static void main(String [] args)
    {
        int [] arr = {1,3,6,10,11,15};
        System.out.println(smallestSum(arr));
    }
    
    public static int smallestSum(int [] arr)
    {
        int res = 1;
        
        for(int i = 0 ; i < arr.length && arr[i] <= res ; i++)
        {
            res = res + arr[i];
        }
        
        return res;
    }
}
