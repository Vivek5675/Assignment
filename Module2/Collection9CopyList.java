/*Write a Java program to copy one array list into another.*/

package module2;

import java.util.ArrayList;
import java.util.Collections;

public class Collection9CopyList
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
		
		ArrayList<String>list1 = new ArrayList<String>(list);
		
		System.out.println("copy list " + list1);
		
	}
}
