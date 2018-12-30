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
public class CountingStrings {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		int num=Integer.parseInt(br.readLine());
		for(int i=0;i<num;i++)
		{
			String str=br.readLine();
			long index=0;
			long count=0;
			for(int j=0;j<str.length();j++)
			{
				if(str.charAt(j)=='a'||str.charAt(j)=='z')
				{
					{
                                            index=j+1;
                                                
					}
				}
				count+=index; 
			}
			System.out.println(count);
		}
        }
}

