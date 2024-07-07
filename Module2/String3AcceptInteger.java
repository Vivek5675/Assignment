package module2;

import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class String3AcceptInteger 
{
	public static void main(String[] args) 
	{
Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter an Integer");
		int i = sc.nextInt();
		
		String numstr = Integer.toString(i);
		
		String nnstr = numstr + numstr;
		String nnnstr = numstr + numstr + numstr;
		
		int nn = Integer.parseInt(nnstr);
		int nnn = Integer.parseInt(nnnstr);
		
		int ans = i + nn + nnn;
		
		System.out.println("The value of " + i + " + " + nn + " + " + nnn + " is: " + ans);
		
	}
}