/*Write a Java program to extract a portion of an array list*/

package module2;

import java.util.ArrayList;

public class Collection18CompareTwoArrayList 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> flist = new ArrayList<>();
		flist.add(1);
		flist.add(2);
		flist.add(3);
		flist.add(4);
		flist.add(5);
		System.out.println(flist);
		
		ArrayList<Integer> slist = new ArrayList<Integer>();
		slist.add(1);
		slist.add(2);
		slist.add(3);
		slist.add(4);
		slist.add(5);
		System.out.println(slist);
		
		boolean value = flist.equals(slist);
		System.out.println(value);
		
		slist.add(6);
		System.out.println(slist);
		boolean value1 = flist.equals(slist);
		System.out.println(value1);
	}
}
