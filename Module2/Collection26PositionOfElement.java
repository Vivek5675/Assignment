/*Write a Java program to print all the elements of an Array List using the position of
the elements.*/

package module2;

import java.util.ArrayList;

public class Collection26PositionOfElement 
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        for (int i = 0; i < list.size(); i++)
         {
            System.out.println("Element at index " + i + ": " + list.get(i));
        }
	}
}
