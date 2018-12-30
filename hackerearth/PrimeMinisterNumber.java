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
public class PrimeMinisterNumber {
    
    public static void main(String args[] ) throws Exception {
        Scanner src = new Scanner(System.in);
        Integer s = src.nextInt();
        Integer e = src.nextInt();
        int[] prime = new int[e+1];
        prime = loadPrimes(prime);
        displaySumOfPrimesPrime(prime,s);
    }
    
	private static void displaySumOfPrimesPrime(int[] prime, int s) {
		for (int i = s; i < prime.length; i++) {
			if (prime[i] == 1) {
				int sum = getSumOfDigits(i);
				if (prime[sum] == 1) {
					System.out.print(i+" ");
				}
			}
		}
	}
	
	private static int getSumOfDigits(int n) {
        int sum = 0;
        while(n!=0) {
            sum = sum + n%10;
            n = n/10;
        }
        return sum;
    }
 
	private static int[] loadPrimes(int[] prime) {
    	for(int i = 1; i < prime.length ; i++) {
    		prime[i] = 1;
    	}
    	prime[0] = 0;
    	prime[1] = 0;
    	for(int i = 2; i*i < prime.length ; i++ ) {
    		if(prime[i] == 1) {
    			for(int j=2; i*j < prime.length ; j++ ) {
    				prime[i*j] = 0;
    			}
    		}
    	}
            return prime;
	}
}
