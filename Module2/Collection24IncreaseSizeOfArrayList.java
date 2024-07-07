/*Write a Java program to increase the size of an array list*/

package module2;

import java.util.ArrayList;

public class Collection24IncreaseSizeOfArrayList
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arrayList = new ArrayList<>(3);

        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);

        System.out.println("Original ArrayList: " + arrayList);
        
        arrayList.ensureCapacity(100);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(50);
        System.out.println("Resized ArrayList: " + arrayList);
        
        
	}
}
