/*W.A.J. P to demonstrate try catch block.*/

package module2;

public class Exception1 
{
	public static void main(String[] args)
	{
		try 
		{
			int[] numbers = {1, 2, 3};
            System.out.println(numbers[3]);
		}
		catch (Exception e) 
		{
			System.out.println(e);
		}
	}
}
