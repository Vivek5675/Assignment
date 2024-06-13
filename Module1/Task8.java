/*h .Write a program to find out the max from given number
(E.g. No: -1562 Max number is 6 ) */

package task66;

import java.util.Scanner;

public class Task8 
{
	public static void main(String[] args) 
	{
int temp,max=0;
		
		Scanner sc =  new Scanner(System.in);
		
		System.out.println("Enter Any Number: ");
		int num = sc.nextInt();
		
		while(num>0)
		{
			temp = num%10;
			
			if(temp>max)
			{
				max=temp;
			}
			num=num/10;
		}
		System.out.println("MAx num is "+max);
		
	}
}
