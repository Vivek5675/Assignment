package module2;

public class Oops10FactorialNumber 
{
	public static long factorial(int num) 
	{
        if (num == 0 || num == 1) 
        {
            return 1;
        }
        else
        {
            return num * factorial(num - 1);
        }
    }

    public static void main(String[] args)
    {
        int number = 4;

        long fact = factorial(number);

        System.out.println(number + "! = " + fact);
    }
}
