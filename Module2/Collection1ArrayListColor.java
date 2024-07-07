/*Write a Java program to create a new array list, add some
colors (string) and print out the collection.*/

package module2;

import java.util.ArrayList;

public class Collection1ArrayListColor 
{
	public static void main(String[] args) 
	{
        ArrayList<String> colors = new ArrayList<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        System.out.println("Colors in ArrayList are :");
        for (String color : colors) 
        {
            System.out.println(color);
        }
    }
}
