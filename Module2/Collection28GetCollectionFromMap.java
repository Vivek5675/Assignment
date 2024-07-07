/*Write a Java program to get a collection view of the values contained in this map.*/

package module2;

import java.util.Collection;
import java.util.HashMap;

public class Collection28GetCollectionFromMap 
{
	public static void main(String[] args) 
	{
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("Vivek", 80000);
		map.put("Yash", 20000);
		map.put("Smit", 30000);
		map.put("Jaydev", 50000);
		
		System.out.println(map);
		
		Collection<Integer> values = map.values();
		System.out.println("Values in a map " + values);
		
		for(Integer value : values)
		{
			System.out.println(value);
		}
	}
}
