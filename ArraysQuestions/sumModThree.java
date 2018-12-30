/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArraysQuestions;

/**
 *
 * @author meloj
 */
public class sumModThree {
    
    
    public static void main(String [] args)
    {
        int input = 2;
        System.out.println(getAnswer(input));
    }
    
    public static int getAnswer(int input)
    {
        int sum = 0;
        
        for(int i = 0 ; i <= 2 ; i++)
        {
            sum += Math.pow(i,2);
        }
        
        int answer = sum % 3;
        
        return answer;
    }
}
