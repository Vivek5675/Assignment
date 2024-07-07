/*W.A.J.P to create the validate method that takes integer value as a parameter. If the
age is less than 18, then throw an Arithmetic Exception otherwise print a message
welcome to vote.
O/P- Enter your age: 16
Exception in thread main java. Lang. Arithmetic Exception: not valid*/

package module2;

import java.util.Scanner;

public class Exception6 
{
	public static void validate(int age)
	{
		if (age <18)
		{
			throw new ArithmeticException("Not Valid");
		}
		else
		{
			System.out.println("Welcome To Vote.");
		}
	}
	
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your age: ");
		int age = sc.nextInt();
		
		try 
		{
			validate(age);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Exception in thread main java. Lang. Arithmetic Exception:\r\n"
					+ e.getMessage());
		}
	}
}
