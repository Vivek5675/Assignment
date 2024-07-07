/*Write A Java Program to take two Array input from user and sort them in
ascending or descending order as per user’s choice
*/

package module2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Array3AsceDesc 
{
	public static void main(String[] args)
	{
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the arrays: ");
        int size = scanner.nextInt();

        Integer[] array1 = new Integer[size];
        Integer[] array2 = new Integer[size];

        System.out.println("Enter elements for the first array:");
        for (int i = 0; i < size; i++)
        {
            array1[i] = scanner.nextInt();
        }

        System.out.println("Enter elements for the second array:");
        for (int i = 0; i < size; i++) {
            array2[i] = scanner.nextInt();
        }

        System.out.print("Enter 'asc' for ascending or 'desc' for descending order: ");
        String order = scanner.next();

        if (order.equalsIgnoreCase("asc"))
        {
            Arrays.sort(array1);
            Arrays.sort(array2);
        } 
        else if (order.equalsIgnoreCase("desc"))
        {
            Arrays.sort(array1, Collections.reverseOrder());
            Arrays.sort(array2, Collections.reverseOrder());
        } 
        else
        {
            System.out.println("Invalid sorting order.");
            return;
        }

        System.out.println("Sorted first array: " + Arrays.toString(array1));
        System.out.println("Sorted second array: " + Arrays.toString(array2));
    }
}
