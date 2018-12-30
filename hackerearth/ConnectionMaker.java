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
public class ConnectionMaker {
    
    public static void main(String [] args)
    {
        Scanner input = new Scanner(System.in);
        
        int N = input.nextInt();
        
        while(N-- > 0) //3
        {
            int n = input.nextInt();
            HashMap<String,String> myMap = new HashMap<>();
            String start = null;
            int count = 0;
            for(int i = 0 ; i < n ; i++) //3
            {
                String one = input.next(); //Harsh //Ashwin //Disha
                String two = input.next(); //Disha //Disha  //Ashwin
                myMap.put(one,two); 
                if(i == 0)
                {
                    start = one;
                }
                if(myMap.get(two) != null) 
                {
                    if(myMap.get(two).equals(one)) 
                    {
                        count++;
                    }
                }
            }
            if(count == 0)
            {
                if(check(myMap,start))
                {
                    System.out.println("YES");
                }
                else
                {
                    System.out.println("NO\n0");
                }
            }
            else
            {
                System.out.println("NO\n" + count);
            }
        }
    }
    
    private static boolean check(HashMap<String,String> m1,String start)
    {
        String bc = start;
        while(m1.get(bc) != null)
        {
            bc = m1.get(bc);
            if(bc.equals(start))
            {
                return true;
            }
        }
        
        return false;
    }
}
