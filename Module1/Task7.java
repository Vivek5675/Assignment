/*g. Write a program to print the number in reverse order.12345 */

package task66;

public class Task7 
{
		
			public static void main(String[] args)
			{
				int num = 12345 , rev = 0;
				
				while (num != 0)
				{
					int digit = num % 10;
					rev = rev * 10 + digit;
					num /= 10;
				}
				System.out.print("Reverse number: " + rev);
				
			}
	}


