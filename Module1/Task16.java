package task56;

import java.util.Scanner;

public class Task7 
{
	public static void main(String[] args)
	{
		Float sub1 , sub2 , sub3 , sub4 , sub5;
		Float tot_marks , percentage;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input the marks of Five Subject....");
		
		System.out.print("Enter marks of sub1:"); 
	    sub1 = sc.nextFloat();
	    
	    System.out.print("Enter marks of sub2:"); 
	    sub2 = sc.nextFloat();
	    
	    System.out.print("Enter marks of sub3:"); 
	    sub3 = sc.nextFloat();
	    
	    System.out.print("Enter marks of sub4:"); 
	    sub4 = sc.nextFloat();
	    
	    System.out.print("Enter marks of sub5:"); 
	    sub5 = sc.nextFloat();
	    
	    tot_marks =sub1 + sub2 + sub3 + sub4 + sub5;
	    percentage = tot_marks/5;
	    System.out.println("Total marks of student is " + tot_marks);
	    System.out.println("percentage of student is " + percentage);
	}
}
