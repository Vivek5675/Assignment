/*W.A.J.P to check whether a given string ends with the contents of another string.
"Java Exercises" ends with "se"? False "Java Exercise" ends with "se"? True*/

package module2;

import java.util.Scanner;

public class String8Endwith 
{
	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter the first string: ");
	        String String = scanner.nextLine();

//	        System.out.print("Enter the second string: ");
//	        String secondString = scanner.nextLine();

	        boolean endsWith = String.endsWith("se");

	        System.out.println(String + " ends with "+ "se : " + endsWith);
	}
}
