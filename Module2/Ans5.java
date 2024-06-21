/*Write a program in Java to input 5 numbers from keyboard and find their sum and
average using for loop.*/

package module2;

import java.util.Scanner;

public class Ans5
{
	public static void main(String[] args) 
	{
		int sub1,sub2,sub3,sub4,sub5;
		double total,avg;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter subject1 marks:");
		sub1 = sc.nextInt();
		
		System.out.print("Enter subject2 marks:");
		sub2 = sc.nextInt();
		
		System.out.print("Enter subject3 marks:");
		sub3 = sc.nextInt();
		
		System.out.print("Enter subject4 marks:");
		sub4 = sc.nextInt();
		
		System.out.print("Enter subject5 marks:");
		sub5 = sc.nextInt();
		
		total = sub1 + sub2 + sub3 + sub4 + sub5;
		
		avg = total / 5;
		
		System.out.println("sum of all subject is:" + total);
		
		System.out.println("average of marks is:" + avg);
	}
}
