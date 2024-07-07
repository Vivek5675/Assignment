/*Write a Java program to remove the third element from an array list.
*/

package module2;

import java.util.ArrayList;

public class Collection6RemoveElement 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> list = new ArrayList<>();
		
		list.add(10);
	    list.add(20);
	    list.add(30);
	    list.add(40);
	    list.add(50);
	    list.add(60);
	    System.out.println("before" + list);
	    
	    list.remove(3);
	    System.out.println("after:" + list);
	}
}
