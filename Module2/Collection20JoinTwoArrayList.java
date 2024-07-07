/*Write a Java program to join two array lists*/

package module2;

import java.util.ArrayList;

public class Collection20JoinTwoArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<String> flist = new ArrayList<>();
		flist.add("Apple");
		flist.add("Ball");
		flist.add("Cat");
		flist.add("Dog");
		flist.add("Elephant");
		System.out.println("First list " + flist);
		
		ArrayList<String> slist = new ArrayList<>();
		slist.add("Fan");
		slist.add("Gun");
		slist.add("Horn");
		slist.add("Image");
		slist.add("Join");
		System.out.println("Second List " + slist);
		
		flist.addAll(slist);
		
		System.out.println("Join list " + flist);
	}
}
