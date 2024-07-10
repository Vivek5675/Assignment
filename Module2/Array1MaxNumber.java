/*Write a java program to find out the max number from given array using function*/

package module2;

public class Array1MaxNumber 
{
	public static void main(String[] args) 
	{
		int array[] = {10,30,100,1090,5000};
		
		int max = array[0];
		
		for (int i = 0; i < array.length; i++)
		{
			if (array[i] > max)
			{
				max = array[i];
			}
		}
		System.out.println(max);
	}
}
