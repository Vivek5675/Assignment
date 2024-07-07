/*Write a Java program to print the ASCII value of a given character.*/

package module2;

import java.util.Scanner;

public class String2AsciiValue 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Character");
		char input = sc.next().charAt(0);
		
		int value = (int)input;
		
		System.out.println("The Ascii value of '" + input + "'is: " + value);
		
	}
	
}
