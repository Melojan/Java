/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

import java.util.*;
public class commonElementsInArray {
    
    public static void main(String [] args)
    {
        int [] a = {1,5,10,20,40,80};
        int [] b = {6,7,20,80,100};
        int [] c = {3,4,15,20,30,70,80,120};
        
        System.out.println(Arrays.toString(common(a,b,c)));
        System.out.println(Arrays.toString(commonSet(a,b,c)));
        System.out.println(Arrays.toString(commonElementsUsingPointers(a,b,c)));
    }
    
   public static int [] common(int [] a , int [] b , int [] c)
   {
       if(a.length == 0 || b.length == 0 || c.length == 0)
       {
           return a;
       }
       
       ArrayList<Integer> arrList = new ArrayList<>();
       
       for(int i = 0 ; i < a.length ; i++)
       {
           for(int j = 0 ; j < b.length ; j++)
           {
               for(int k = 0 ; k < c.length ; k++)
               {
                   if(a[i] == b[j] && b[j] == c[k] & a[i] == c[k])
                   {
                       arrList.add(a[i]);
                   }
               }
           }
       }
       
       int [] count = new int[arrList.size()];
       
       for(int i = 0 ; i < count.length ; i++)
       {
           count[i] = arrList.get(i);
       }
       
       return count;
   }
   
   public static int [] commonSet(int [] a , int [] b , int [] c)
   {
      Set<Integer> set = new HashSet<>();
      Set<Integer> intersect = new HashSet<>();
      for(int i = 0 ; i < a.length; i++)
      {
          set.add(a[i]);
      }
      
      for(int i = 0 ; i < b.length ; i++)
      {
          for(int j = 0 ; j < c.length ; j++)
          {
              if(set.contains(b[i]) && set.contains(c[j]))
              {
                  intersect.add(b[i]);
              }
          }
      }
      
      int [] count = new int [intersect.size()];
      int index = 0;
      
      for(int num : intersect)
      {
          count[index] = num;
          index++;
      }
      
      return count;
   }

    public static int[] commonElementsUsingPointers(int[] a, int[] b, int [] c) {
        
        Set<Integer> set = new HashSet<>();
        
        Arrays.sort(a);
        Arrays.sort(b);
        Arrays.sort(c);
        
        int i = 0;
        int j = 0;
        int k = 0;
        
        while(i < a.length && j < b.length && k < c.length)
        {
            if(a[i] < b[j])
            {
                i++;
            }
            else if(a[i] > b[j])
            {
                j++;
            }
            else{
                set.add(a[i]);
                i++;
                j++;
            }
        }
        
        int [] result = new int[set.size()];
        int index = 0;
        for(int num : set)
        {
            result[index] = num;
            index++;
        }
        
        return result;

    }
   
   
}
