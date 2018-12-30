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
public class HatesMaths {
    
    public static void main(String [] args) throws Exception
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        
        while(true)
        {
            if(++n%3 != 0 && !(n + "").contains("3"))
            {
                break;
            }
        }
        
        System.out.println(n);
        
    }
}

/*

 import java.util.*;
    class TestClass {
        public static void main(String z[] )  {
            
            Scanner s = new Scanner(System.in);
            
            int n=s.nextInt();
            while(true){
                if(++n%3!=0&&!(n+"").contains("3"))
                    break;
            }
                 System.out.println(n);
     
        }
    }
*/
