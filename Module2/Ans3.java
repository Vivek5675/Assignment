/*Write a Java program that takes a year from user and print whether that year is a leap
year or not.*/

package module2;

import java.util.Scanner;

public class Ans3 
{
	public static void main(String[] args)
	{
		int year ;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year:");
		year = sc.nextInt();
		
		if(year % 100 != 0 && year % 4 == 0)
		{
			System.out.println(year + " is a leap year...");
		}
		else
		{
			System.out.println(year + " is not a leap year...");
		}
	}
}
