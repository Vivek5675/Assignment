/*Create a class to print an integer and a character with two methods having the same
name but different sequence of the integer and the character parameters. For
example, if the parameters of the first method are of the form (int n, char c), then
that of the second method will be of the form (char c, int n).*/

package module2;

class PrintIntChar
{
	public void PrintData(int a, char b)
	{
		System.out.println("Integer:" + a + "\s" + "Character:" + b);
	}
	
	public void PrintData(char b, int a)
	{
		System.out.println("Character:" + b + "\s" + "Integer:" + a);
	}
}
public class String13DiffSequence
{
	public static void main(String[] args) 
	{
		PrintIntChar print = new PrintIntChar();
		
		print.PrintData(07, 'V');
		print.PrintData('K', 56);
	}
}
