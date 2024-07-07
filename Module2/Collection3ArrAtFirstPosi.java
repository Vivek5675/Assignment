/*Write a Java program to insert an element into the array list at the first position.*/package module2;

import java.util.ArrayList;

public class Collection3ArrAtFirstPosi 
{
	public static void main(String[] args)
	{
		ArrayList<String> list = new ArrayList<>();
		
		list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");
        
        String newadd = "VK";
        
        list.add(0,newadd);
        
        System.out.println(list);
        
        
	}
}
