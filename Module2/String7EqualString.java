/*W.A.J.P to compare a given string to the specified character sequence. Comparing
topsint.com and topsint.com: true Comparing Topsint.com and topsint.com: false*/

package module2;

import java.util.Scanner;

public class String7EqualString 
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        boolean areEqual = firstString.equals(secondString);

        System.out.println("Comparing " + firstString + " and " + secondString + " : " + areEqual);
	}
}
