/*Write a java program to find out the 2nd max number from given array using
function.*/

package module2;

public class Array2SecondMaxNumber 
{
    public static int findSecondMax(int[] array) 
    {
        int max = 0; //= Integer.MIN_VALUE;
        int secondMax = 0; //= Integer.MIN_VALUE;

        for (int num : array) 
        {
            if (num > max)
            {
                max = num;
            }
        }

        for (int num : array)
        {
            if (num > secondMax && num < max)
            {
                secondMax = num;
            }
        }

        return secondMax;
    }

    public static void main(String[] args)
    {
        int[] numbers = {3, 5, 7, 2, 8, -1, 4, 10, 12};

        int secondMaxNumber = findSecondMax(numbers);

        System.out.println("The second max number is: " + secondMaxNumber);
    }
}
