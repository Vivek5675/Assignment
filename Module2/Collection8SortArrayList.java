/*Write a Java program to sort a given array list.*/

package module2;

import java.util.ArrayList;
import java.util.Collections;

public class Collection8SortArrayList 
{
	public static void main(String[] args) 
	{
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("B");
		list.add("V");
		list.add("K");
		list.add("A");
		list.add("C");
		list.add("R");
		list.add("J");
		System.out.println(list);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
