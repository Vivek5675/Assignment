/*Write a Java program to append the specified element to the end of a hash set.*/

package module2;

import java.util.HashSet;

public class Collection11AppendElemntAtEndHashSet 
{
	public static void main(String[] args) 
	{
		HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Apple");
        hashSet.add("Banana");
        hashSet.add("Cherry");

        System.out.println(hashSet);

        String newElement = "Date";
        hashSet.add(newElement);

        System.out.println("after appending: " + hashSet);
	}
}
