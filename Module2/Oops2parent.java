/*Create a class with a method that prints "This is a parent class" and its subclass with
another method that prints "This is child class". Now, create an object for each of
the class and call 1 - method of parent class by object of parent class 2 - method of
child class by object of child class 3 - method of parent class by object of child class*/

package module2;
 
	class Parent 
	{
	    public void parentMethod()
	    {
	        System.out.println("This is a parent class");
	    }
	}

	class Child extends Parent 
	{
	    public void childMethod()
	    {
	        System.out.println("This is a child class");
	    }
	}

	public class Oops2parent 
	{
	    public static void main(String[] args)
	    {
	        Parent parentObj = new Parent();
	        
	        parentObj.parentMethod();

	        Child childObj = new Child();
	        
	        childObj.childMethod();

	        childObj.parentMethod();
	    }
	}

