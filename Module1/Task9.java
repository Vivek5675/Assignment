/*i. Write a program make a summation of given number(E.g. 1523 ans :-11) */

package task66;

import java.util.Scanner;

public class Task9 
{
	public static void main(String[] args)
	{
		int temp,sum=0;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter Any Number");
		int num = sc.nextInt();
		
		while(num>0)
		{
			temp = num % 10;
			sum+=temp;
			num=num/10;
		}
		
		System.out.println(sum);
	}
}
