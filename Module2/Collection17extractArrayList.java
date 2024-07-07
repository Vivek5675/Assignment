/*Write a Java program to extract a portion of an array list*/

package module2;

import java.util.ArrayList;
import java.util.List;

public class Collection17extractArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		list.add("H");
		
		int startIndex = 2;
		int endIndex = 5;
		
		List<String> sublist = list.subList(startIndex, endIndex);
		
		System.out.println("normal list" + list);
		System.out.println("Extract list" + sublist);
	}
}
