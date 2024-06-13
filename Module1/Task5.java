/*e. Write a program you have to print the Fibonacci series up to user given number */

package task66;

import java.util.Scanner;

public class Task5 
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter a Number: ");
		int a = sc.nextInt();
		
		int n1 = 0 , n2 = 1 , n3 , i;
		System.out.print(n1 + " " + n2);
		
		for (i= 2; i < a ; ++i)
		{
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
	}
}
