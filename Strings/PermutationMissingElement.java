/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Strings;
public class PermutationMissingElement {
    // you can also use imports, for example:

    public int solution(int[] A) {
       
      int N = A.length;
      int total = 0;
      int sum = 0;
      
      total = (N + 1) * (N + 2) / 2;
      
      for(int i = 0 ; i < N ; i++)
      {
          sum = sum + A[i];
      }
      
      int result = total - sum;
      
      return result;
    }
}

