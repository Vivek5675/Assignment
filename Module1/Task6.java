/*f. write a program you have to print the table of given number. */

package task66;

import java.util.Scanner;

public class Task6 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of given table: ");
		int tab = sc.nextInt();
		
		for (int i = 1; i <= 10; i++)
		{
			System.out.println(tab + " * " + i + " = " + tab * i);
		}
	}
}
