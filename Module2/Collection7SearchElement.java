/*Write a Java program to search an element in an array list.*/

package module2;

import java.util.ArrayList;
import java.util.Scanner;

public class Collection7SearchElement 
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
	    System.out.println(list);
	    
	    Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter the search elemnt: ");
	    int ele = sc.nextInt();
	    
	    if (list.contains(ele))
	    {
			System.out.println(ele + "is having in list.");
		} 
	    else
	    {
	    	System.out.println(ele + " is not having in list.");
		}
	    
	}
}
