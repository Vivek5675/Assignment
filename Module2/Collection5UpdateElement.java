/*Write a Java program to update specific array element by given element.*/

package module2;

import java.util.ArrayList;

public class Collection5UpdateElement 
{
	public static void main(String[] args)
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    System.out.println("before" + list);
	    
	    list.set(2,80);
	    System.out.println("after:" + list);


	}
}
