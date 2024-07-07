/*Write a Java program to iterate through all elements in a hash list.*/

package module2;

import java.util.HashMap;

public class Collection12IterateHashList 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, String> hashMap = new HashMap<>();
		
		hashMap.put(1, "A");
		hashMap.put(2, "B");
		hashMap.put(3, "C");
		hashMap.put(4, "D");
		hashMap.put(5, "E");
		hashMap.put(6, "A");
		
		for (Integer key : hashMap.keySet())
		{
            String value = hashMap.get(key);
            System.out.println("Key: " + key + ", Value: " + value);
        }
		
		 /*for (String value : hashMap.values())
		 {
	            System.out.println("Value: " + value);
	     }*/
	}
}
