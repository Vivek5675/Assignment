/*• W.A.J.P to find all interleaving of given strings.
The given strings are: WX YZ
The interleaving strings are: YWZX WYZX YWXZ WXYZ YZWX WYXZ*/

package module2;

import java.util.ArrayList;
import java.util.List;

public class String10InterLeaving 
{
    private static void interleave(String str1, String str2, String soFar, List<String> results) 
    {
        if (str1.length() == 0 && str2.length() == 0) 
        {
            results.add(soFar);
            return;
        }
        if (str1.length() > 0) 
        {
            interleave(str1.substring(1), str2, soFar + str1.charAt(0), results);
        }
        if (str2.length() > 0)
        {
            interleave(str1, str2.substring(1), soFar + str2.charAt(0), results);
        }
    }

    public static List<String> findInterleavings(String str1, String str2) 
    {
        List<String> results = new ArrayList<String>();
        interleave(str1, str2, "", results);
        return results;
    }

    public static void main(String[] args)
    {
        String str1 = "WX";
        String str2 = "YZ";
        List<String> interleavings = findInterleavings(str1, str2);
        System.out.println(interleavings);
    }
}
