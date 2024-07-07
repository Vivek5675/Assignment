/*• Write a Java program to associate the specified value with the specified key in a
Hash Map.*/

package module2;

import java.util.HashMap;

public class Collection14KeyValueHashMap
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<>();

        map.put("Apple", 10);
        map.put("Banana", 20);
        map.put("Orange", 30);
        map.put("Grapes", 40);
        System.out.println(map);
    }
}

