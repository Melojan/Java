/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

import java.util.*;
public class TradeDesk {
    
    public static void main(String [] args)
    {
        String [] str = {"b","a"};
        String s = mergeAndSort(str);
        System.out.println(s);
    }
    
    public static String mergeAndSort(String [] str)
    {
        StringBuilder sb = new StringBuilder();
        for(String s : str)
        {
            sb.append(s);
        }
        
        String manojan = sb.toString();
        
        char [] mano = manojan.toLowerCase().toCharArray();
        
        Arrays.sort(mano);
        
        return new String(mano);

        
    }
}
