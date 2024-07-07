/*Write a Java program of swap two elements in an array list.
*/

package module2;

import java.util.ArrayList;
import java.util.Collections;

public class Collection19SwapElement 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("apple");
		list.add("ball");
		list.add("cat");
		list.add("Dog");
		list.add("elephant");
		System.out.println(list);
		
		Collections.swap(list, 2, 3);
		System.out.println(list);
		
		
	}
}
