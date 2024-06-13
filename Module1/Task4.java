/*d .write a program you have to find the factorial of given number. 5!=5*4*3*2*1 */

package task66;

public class Task4
{
	public static void main(String[] args)
	{
		int i , fact = 1 ;
		int num = 4;
		
		for (i = 1; i <= num ; i++)
		{
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is " + fact );
	}
}
