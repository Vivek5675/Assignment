/*Write a Java program to convert a hash set to an array.*/

package module2;

import java.util.HashSet;

public class Collection21ConvertHashSetToArray
{
	public static void main(String[] args)
	{
		HashSet<String> set = new HashSet<>();
		
		set.add("A");
		set.add("B");
		set.add("C");
		set.add("D");
		set.add("E");
		
		String[] array = set.toArray(new String[set.size()]);
		
		for(String element : array)
		{
			System.out.println(element);
		}
	}
}
