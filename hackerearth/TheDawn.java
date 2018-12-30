/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearth;

import java.io.*;
import java.util.*;

public class TheDawn {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long sum = 0;
        long min = Long.MAX_VALUE;
        long n = Long.parseLong(br.readLine());
        int sq = (int) Math.sqrt(n); //4
        for (int i = 1; i <= sq; i++) {
            if (n % i == 0) { //1,2,3,4,6,8,12,24
                sum = i + (n / i); 
            }
            if (sum < min) {
                min = sum;
            }
        }
        System.out.println(min);

    }
}
