/*Write a Java program to retrieve an element (at a spec. index) from a given array list.*/

package module2;

import java.util.ArrayList;

public class Collection4SpecIndex 
{
	public static void main(String[] args)
	{
		 ArrayList<String> list = new ArrayList<>();
	        list.add("Apple");
	        list.add("Banana");
	        list.add("Cherry");
	        list.add("Chiku");
	        list.add("Charry");
	        
	        String element = list.get(2);
	        
	        System.out.println("element at index 2 is :" + element);
	}
}
