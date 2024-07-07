/*W.A.J. P to demonstrate try catch block, take two numbers from the user by
Command line argument and perform the division operation and handle Arithmetic
O/PException in thread main java. Lang. Arithmetic Exception:/ by zero
*/

package module2;

public class Exception5 
{
	public static void main(String[] args) 
	{
		try
		{		
	        System.out.println("Give two numbers as command line arguments.");
			
			int num1 = Integer.parseInt(args[0]);
			int num2 = Integer.parseInt(args[1]);
			
			int result = num1 / num2;
			
	        System.out.println("The result of the division is: " + result);
	    }
		catch (NumberFormatException e)
		{
			System.out.println("Please ensure that both arguments are valid integers.");
		}
		catch (ArithmeticException e)
		{
			System.out.println("\"ArithmeticException: Cannot divide by zero.");
		}

		
	}
}
