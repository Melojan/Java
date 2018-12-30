/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicequestions;

public class isLucky {
    
    public static void main(String [] args)
    {
        int n = 1230;
        boolean ret = isLucky(n);
        System.out.println((ret) ? true : false);
    }
    
    public static boolean isLucky(int n)
    {
        String temp = Integer.toString(n); //1230
        
        int sum = 0;
        
        for(int i = 0 ; i < temp.length() / 2 ; i++)
        {
            sum = sum + (temp.charAt(i) - temp.charAt(temp.length() - 1 - i)); 
            System.out.println(sum);
        }
        
        return sum == 0;
    }
}
            

