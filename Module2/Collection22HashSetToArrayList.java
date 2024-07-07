/*Write a Java program to convert a hash set to a List/Array List*/

package module2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class Collection22HashSetToArrayList
{
	public static void main(String[] args) 
	{
		 HashSet<String> hashSet = new HashSet<>();

	        hashSet.add("Apple");
	        hashSet.add("Banana");
	        hashSet.add("Orange");
	        hashSet.add("Grapes");

	        List<String> list = new ArrayList<>(hashSet);

	        System.out.println("HashSet: " + hashSet);

	        System.out.println("List from HashSet: " + list);
	}
}
