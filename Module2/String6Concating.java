package module2;

import java.util.Scanner;

public class String6Concating 
{
	public static void main(String[] args) 
	{
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first string: ");
	        String firstString = scanner.nextLine();

	        System.out.print("Enter the second string: ");
	        String secondString = scanner.nextLine();

	        String concatString = firstString + secondString;

	        System.out.println("The concatenated string is: " + concatString);
	}
}
