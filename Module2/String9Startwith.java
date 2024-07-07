/*• W.A.J.P to check whether a given string starts with the contents of another string.
Red is favorite color. Starts with Red? True Orange is also my favorite color. Starts
with Red? False I3.*/

package module2;

import java.util.Scanner;

public class String9Startwith
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String String = scanner.nextLine();

//        System.out.print("Enter the second string: ");
//        String secondString = scanner.nextLine();

        boolean startWith = String.startsWith("Red");

        System.out.println(String + " Start with "+ "Red : " + startWith);
	}
}

