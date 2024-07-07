/*Write a Java program to iterate through all elements in an array list.
*/

package module2;

import java.util.ArrayList;
import java.util.Iterator;

public class Collection2IterateElement 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()) {
			System.out.println(iterator.next());
			
		}
	}
}