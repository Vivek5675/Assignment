/*Create a class named 'Print Number' to print various numbers of different data types
by creating different methods with the same name 'printn' having a parameter for
each data type.*/

package module2;

class PrintNumber
{
	public void printn(int number) 
	{
        System.out.println("Integer: " + number);
    }

    public void printn(float number) 
    {
        System.out.println("Float: " + number);
    }

    public void printn(double number) 
    {
        System.out.println("Double: " + number);
    }

    public void printn(long number) 
    {
        System.out.println("Long: " + number);
    }

    public void printn(byte number)
    {
        System.out.println("Byte: " + number);
    }

    public void printn(char character) 
    {
        System.out.println("Char: " + character);
    }

    public void printn(boolean bool) 
    {
        System.out.println("Boolean: " + bool);
    }

    public void printn(String str) 
    {
        System.out.println("String: " + str);
    }
}
public class String12PrintAllDataType 
{
	public static void main(String[] args) 
	{
		PrintNumber print = new PrintNumber();
		
		 	print.printn(42);          
		 	print.printn(3.14f);
	        print.printn(2.71828);
	        print.printn(123456789L);
	        print.printn((byte) 127);
	        print.printn('A'); 
	        print.printn(true);
	        print.printn("Hello");
	}
}
