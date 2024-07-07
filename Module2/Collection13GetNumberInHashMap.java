/*Write a Java program to get the number of elements in a hash set*/

package module2;

import java.util.HashSet;

public class Collection13GetNumberInHashMap
{
	public static void main(String[] args) 
	{
		HashSet<String> hashSet = new HashSet<>();

        hashSet.add("Element 1");
        hashSet.add("Element 2");
        hashSet.add("Element 3");

        int size = hashSet.size();

        System.out.println("Elements in the hash set is: " + size);
    }
}
