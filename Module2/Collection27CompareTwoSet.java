/*Write a Java program to compare two sets and retain elements which are same on
both sets.*/

package module2;

import java.util.HashSet;
import java.util.Set;

public class Collection27CompareTwoSet
{
	public static void main(String[] args) 
	{
		Set<Integer> set1 = new HashSet<Integer>();
		Set<Integer> set2 = new HashSet<Integer>();
		
		set1.add(1);
		set1.add(2);
		set1.add(3);
		set1.add(4);
		
		set2.add(3);
		set2.add(4);
		set2.add(5);
		set2.add(6);
		
		System.out.println("set1 :" + set1);
		System.out.println("set2 :" + set2);
		
		set1.retainAll(set2);
		System.out.println("After: " + set1);
	}
}
