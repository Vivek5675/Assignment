/*Create an abstract class 'Parent' with a method 'message'. It has two subclasses each
having a method with the same name 'message' that prints "This is first subclass"
and "This is second subclass" respectively. Call the methods 'message' by creating
an object for each subclass.*/

package module2;


	abstract class Parent1
	{
	    public abstract void message();
	}

	class FirstSubclass extends Parent1 
	{
	    public void message() 
	    {
	        System.out.println("This is first subclass");
	    }
	}

	class SecondSubclass extends Parent1 
	{
	    public void message() 
	    {
	        System.out.println("This is second subclass");
	    }
	}

	public class Oops7AbstractParent
	{
	    public static void main(String[] args)
	    {
	        Parent1 first = new FirstSubclass();
	        Parent1 second = new SecondSubclass();

	        first.message();
	        second.message();
	    }
	}


