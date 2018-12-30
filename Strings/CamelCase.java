/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;

/**
 *
 * @author meloj
 */
import java.util.*;
public class CamelCase {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        
        String [] words = str.split("[A-Z]");
        
        System.out.println(words.length);
    }
}
