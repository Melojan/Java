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
public class CharSum {
    
    public static void main(String [] args) throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        int sum = 0;
        
        /*for(int i = 0 ; i < str.length() ; i++)
        {
            char c = str.charAt(i);
            
            switch(c)
            {
                case 'a':
                    sum+=1;
                    break;
                case 'b':
                    sum+=2;
                    break;
                case 'c':
                    sum+=3;
                    break;
                case 'd':
                    sum+=4;
                    break;
                case 'e':
                    sum+=5;
                    break;
                case 'f':
                    sum+=6;
                    break;
                case 'g':
                    sum+=7;
                    break;
                case 'h':
                    sum+=8;
                    break;
                case 'i':
                    sum+=9;
                    break;
                case 'j':
                    sum+=10;
                    break;
                case 'k':
                    sum+=11;
                    break;
                case 'l':
                    sum+=12;
                    break;
                case 'm':
                    sum+=13;
                    break;
                case 'n':
                    sum+=14;
                    break;
                case 'o':
                    sum+=15;
                    break;
                case 'p':
                    sum+=16;
                    break;
                case 'q':
                    sum+=17;
                    break;
                case 'r':
                    sum+=18;
                    break;
                case 's':
                    sum+=19;
                    break;
                case 't':
                    sum+=20;
                    break;
                case 'u':
                    sum+=21;
                    break;
                case 'v':
                    sum+=22;
                    break;
                 case 'w':
                    sum+=23;
                    break;
                case 'x':
                    sum+=24;
                    break;
                case 'y':
                    sum+=25;
                    break;
                case 'z':
                    sum+=26;
                    break;  
            }
        }*/
        
        for(int i = 0 ; i < str.length() ; i++)
        {
            char c = str.charAt(i);
            int k = (int)c - 96;
            sum += k;
        }
        
        System.out.println(sum);
        
        /*char []charArr = br.readLine().toCharArray();// Reading input from STDIN
        int count = 0;
		for(int i = 0 ; i< charArr.length ; i++){
			if(charArr[i] == 97)
				count += 1;
			else
				count += (charArr[i])-96;
		}  
		System.out.print(count);*/
    }
}
