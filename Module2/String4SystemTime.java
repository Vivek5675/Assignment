/*Write a Java program to display the system time.*/

package module2;

import java.util.Calendar;

public class String4SystemTime 
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		System.out.println("The system Date and Time is " + cal.getTime());
	}
}