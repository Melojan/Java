/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javablogspotquestions;

public class permutation {

    public static void main(String [] args)
    {
        permute("abcd");
    }
    
    public static void permute(String input)
    {
        permute("", input);
    }
    
    public static void permute(String perm, String word)
    {
        if(word.isEmpty())
        {
            System.out.println(perm + word);
        }
        else
        {
            for(int i = 0 ; i < word.length() ; i++)
            {
                permute(perm + word.charAt(i) , word.substring(0, i) + word.substring(i + 1 , word.length()));
            }
        }
    }
}
