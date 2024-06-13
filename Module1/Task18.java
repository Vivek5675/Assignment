package task56;

import java.util.Scanner;

public class Task9 
{
	public static void main(String[] args)
	{
		int year;
		
		System.out.print("Enter a year : ");
		
		Scanner sc = new Scanner(System.in);
		year = sc.nextInt();
		
		if (((year % 4 == 0) && (year % 100!= 0)) || (year % 400 == 0))
	         System.out.println(year + " year is a leap year");
	      else
	         System.out.println(year + " year is not a leap year");
	}
}
