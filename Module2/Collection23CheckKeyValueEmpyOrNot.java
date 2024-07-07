/*Write a Java program to check whether a map contains key-value mappings (empty)
or not.
*/

package module2;

import java.util.HashMap;
import java.util.Map;

public class Collection23CheckKeyValueEmpyOrNot
{
	public static void main(String[] args)
	{
		Map<String, String> map = new HashMap<>();

        if (map.isEmpty()) 
        {
            System.out.println("Map is empty");
        } 
        else 
        {
            System.out.println("Map is not empty");
        }

        map.put("key1", "value1");
        map.put("key2", "value2");

        if (map.isEmpty())
        {
            System.out.println("Map is empty");
        } 
        else 
        {
            System.out.println("Map is not empty");
        }
	}
}
