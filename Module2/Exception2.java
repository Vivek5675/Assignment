/*Take two numbers from the user and perform the division operation and handle
Arithmetic Exception. O/P- Enter two numbers: 10 0*/

package module2;

import java.util.Scanner;

public class Exception2 
{
	public static void main(String[] args) 
	{
		try
		{
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the first number:");
			int num1 = sc.nextInt();
			
			System.out.println("Enter the second number:");
			int num2 = sc.nextInt();
			
			int division = num1 / num2;
			System.out.println("Answer is" + division);
		}
		catch (ArithmeticException e) 
		{
			System.out.println("Exception in thread \\\"main\\\" java.lang.ArithmeticException: ");
		}
	}
}
