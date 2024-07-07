/*Write a Java program to replace the second element of an Array List with the
specified element.*/

package module2;

import java.util.ArrayList;

public class Collection25ReplaceElement 
{
	public static void main(String[] args)
	{
		 ArrayList<String> list = new ArrayList<>();
	     list.add("First");
	     list.add("Second");
	     list.add("Third");
	     list.add("Fourth");

	        System.out.println("list: " + list);

	        String newElement = "NewSecond";

	        if (list.size() > 1)
	        {
	            list.set(1, newElement);
	        }
	        else 
	        {
	            System.out.println("The list does not have a second element to replace.");
	        }

	        System.out.println("Updated list: " + list);
	}
}
