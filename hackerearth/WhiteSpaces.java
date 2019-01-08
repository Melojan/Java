/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

/**
 *
 * @author meloj
 */
import java.util.*;
public class WhiteSpaces {
    
    public static void main(String [] args) throws Exception
    {
        int count = 0;
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        StringTokenizer sb = new StringTokenizer(str," ");
        while(sb.hasMoreTokens())
        {
            count++;
            sb.nextToken();
        }
        
        System.out.println(count-1);
        
    }
}
