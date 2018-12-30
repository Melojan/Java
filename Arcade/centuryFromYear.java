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
public class centuryFromYear {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        
        int result = centuryFromYear(a);
        System.out.println(result);
    }
     
    public static int centuryFromYear(int year)
    {
        if(year%100  == 0)
        {
            return year/100;
        }
        else
        {
            return year/100 + 1;
        }
    }
}
