/*W.A.J.P to get the character at the given index within the String. Original String =
Tops Technologies! The character at position 0 is T, The character at position 10 is
o
*/

package module2;

import java.util.Scanner;

public class String5CharacterIndex 
{
	public static void main(String[] args) 
	{
		 String oriString = "Tops Technologies!";

		 System.out.println("String: " + oriString);


	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter an index to get the character at that position: ");
	        int index = scanner.nextInt();

	        if (index >= 0 && index < oriString.length())
	        {
	            char character = oriString.charAt(index);
	            
	            System.out.println("The character at position " + index + " is " + character);
	        }
	        else
	        {
	            System.out.println("Index out of range. Please enter a valid index.");
	        }
	}
}
