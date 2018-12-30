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
import java.util.*;

public class removeDuplicates {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 1, 2, 3, 4, 5};
        int[] results = removeDups(intArr);
        int[] results2 = removeDupsWithLibrary(intArr);
        System.out.println(Arrays.toString(results));
        System.out.println(Arrays.toString(results2));
    }

    public static int[] removeDups(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] == intArr[j]) {
                    intArr[i] = 0;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] != 0) {
                count++;
            }
        }

        int[] newList = new int[count];
        int index = 0;
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] != 0) {
                newList[index] = intArr[i];
                index++;
            }
        }

        return newList;
    }

    public static int[] removeDupsWithLibrary(int[] intArr) {
        
        Arrays.sort(intArr);
        
        int [] result = new int[intArr.length];
        int count = 0;
        for(int i = 1 ; i < result.length ; i++)
        {
            if(intArr[i] != intArr[i-1])
            {
                result[count] = intArr[i - 1];
                count++;
            }

            
            if(i == intArr.length - 1 && intArr[i-1] != intArr[i] )
            {
                result[count] = intArr[i];
            }

        }

        return result;
    }
}
