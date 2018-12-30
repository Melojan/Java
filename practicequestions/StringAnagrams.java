package practicequestions;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author meloj
 */
import java.util.*;
public class StringAnagrams {
    
    public static void main(String[] args)
    {
            // Input : anagram , margana , then they are the same return true

            Scanner input = new Scanner(System.in);
            String a = input.nextLine();
            String b = input.nextLine();

            boolean ret = isAnagram(a,b);

            System.out.println( (ret) ? "Anagram" : "Not Anagram");
    }
    
    public static boolean isAnagram(String a,String b)
    {
         char [] charA = a.toLowerCase().toCharArray();
         char [] charB = b.toLowerCase().toCharArray();
         
         Arrays.sort(charA);
         Arrays.sort(charB);
         
         return new String(charA).equals(new String (charB));

    }
}
