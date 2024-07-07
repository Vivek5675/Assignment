/*• Write a Java program to count the letters, spaces, numbers and other characters of
an input string.*/

package module2;

import java.util.Scanner;

public class String1InputString
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the String: ");
		String input = sc.nextLine();
		
		int letters = 0;
		int spaces = 0;
		int numbers = 0;
		int others = 0;
		
		for(char ch : input .toCharArray())
		{
			if (Character.isLetter(ch)) 
			{
				letters++;
			}
			else if (Character.isDigit(ch))
			{
				numbers++;
			}
			else if (Character.isWhitespace(ch))
			{
				spaces++;
			}
			else
			{
				others++;
			}
		}
		
		System.out.println("Letters: " + letters);
		System.out.println("Numbers: " + numbers);
		System.out.println("Spaces: " + spaces);
		System.out.println("Other Characters: " + others);
	}
}
