    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringsQuestions;

/**
 *
 * @author meloj
 */
import java.util.*;
public class longestLength {

    public static void main(String [] args)
    {
        String [] strArray = {"programming","rock","simple"};
        System.out.println(Arrays.toString(longlength(strArray)));
    }
    
    public static String [] longlength(String [] strArray)
    {
        String [] sortedLength = Arrays.copyOf(strArray, strArray.length);
        Arrays.sort(sortedLength,new LengthComparator());
        return sortedLength;
    }
}

class LengthComparator implements Comparator<String>
{
    @Override
    public int compare(String x,String y)
    {
        return x.length() - y.length();
    }
}
