/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsQuestions;

/**
 *
 * @author meloj
 */
public class permutationString {
    
    public static void main(String [] args)
    {
        String str = "xyz";
        permutationString("","xyz");
    }
    
    public static void permutationString(String permutation,String str)
    {
        String result = "";
        
        if(str.equals(""))
        {
            System.out.println(permutation + str);
        }
        else
        {
            for(int i = 0 ; i < str.length() ; i++)
            {
               permutationString(permutation + str.charAt(i), str.substring(0,i) + str.substring(i + 1, str.length()));
            }
        }
    }
}
