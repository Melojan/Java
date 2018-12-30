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
import java.io.*;
import java.util.*;
public class CompressionNextLevel {

    public static void main(String args[] ) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        StringBuilder result = new StringBuilder();
        ArrayList<Character> vowels = createVowelList();
        for(int i = 0; i < t; i++) {
            int N = Integer.parseInt(br.readLine());
            String input = br.readLine();
            StringBuilder sb = new StringBuilder();
            sb.append(input.substring(0, 1).toUpperCase());
            for(int j = 1; j < input.length(); ) {
                char c = input.charAt(j);
                if(vowels.contains(c)) {
                    sb.append(c+"");
                    char cur = c;
                    while(j < input.length() && input.charAt(j) == cur) {
                        j++;
                    }
                    
                }else {
                    int length = 0;
                    while(j < input.length() && !vowels.contains(input.charAt(j))) {
                        length++;
                        j++;
                    }
                    sb.append(length + "");
                }
            }
            result.append(sb.toString() + "\n");
        }
        System.out.println(result);
    }
    
    private static ArrayList<Character> createVowelList() {
        ArrayList<Character> list = new ArrayList<>();
        list.add('a');
        list.add('e');
        list.add('i');
        list.add('o');
        list.add('u');
        
        return list;
    }
}
 

