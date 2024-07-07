/*Write a Java program to count the number of key-value (size) mappings in a map.
*/

package module2;

import java.util.HashMap;
import java.util.Map;

public class Collection15CountKeyValue 
{
	public static void main(String[] args) 
	{
		Map<String, Integer> map = new HashMap<>();
        map.put("Apple", 10);
        map.put("Banana", 15);
        map.put("Orange", 20);
        map.put("Grapes", 25);

        int size = map.size();

        System.out.println("The number of key-value in the map is: " + size);
    }
}
