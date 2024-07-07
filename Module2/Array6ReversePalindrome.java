/*Write a java program to reverse a string and check that the string is palindrome or
not.*/

package module2;

public class Array6ReversePalindrome 
{
	public static void main(String[] args) 
	{

	    String str = "Radar", reverseStr = "";
	    System.out.println("value is : " + str);
	    
	    int strLength = str.length();

	    for (int i = (strLength - 1); i >=0; --i) 
	    {
	      reverseStr = reverseStr + str.charAt(i);
	    }
	    System.out.println("Reverse string is : " + reverseStr);

	    if (str.toLowerCase().equals(reverseStr.toLowerCase()))
	    {
	      System.out.println(str + " is a Palindrome String.");
	    }
	    else
	    {
	      System.out.println(str + " is not a Palindrome String.");
	    }
	}

}
