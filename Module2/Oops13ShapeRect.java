/*Create a class named 'Shape' with a method to print "This is this is shape". Then
create two other classes named 'Rectangle', 'Circle' inheriting the Shape class, both
having a method to print "This is rectangular shape" and "This is circular shape"
respectively. Create a subclass 'Square' of 'Rectangle' having a method to print
"Square is a rectangle". Now call the method of 'Shape' and 'Rectangle' class by the
object of 'Square' class.*/

package module2;

class Shape1
{
    public void displayShape() 
    {
        System.out.println("This is shape.");
    }
}

class Rectangle1 extends Shape1 
{
    public void displayShape() 
    {
        System.out.println("This is rectangular shape.");
    }
}

class Circle1 extends Shape1
{
    public void displayShape()
    {
        System.out.println("This is circular shape.");
    }
}

class Square1 extends Rectangle1 
{
    public void displaySquare() 
    {
        System.out.println("Square is a rectangle.");
    }
}


public class Oops13ShapeRect 
{
	 public static void main(String[] args)
	 {
	        Square1 square = new Square1();

	        square.displayShape();

	        square.displayShape();
	  }
}

