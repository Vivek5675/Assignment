/*Create a class to print the area of a square and a rectangle. The class has two methods
with the same name but different number of parameters. The method for printing
area of a rectangle has two parameters which are length and breadth respectively
while the other method for printing area of square has one parameter which is side
of square.*/

package module2;


	public class Oops1AreaCalculator 
	{
	    public void area(int side) 
	    {
	        System.out.println("Area of square: " + (side * side));
	    }

	    public void area(int length, int breadth)
	    {
	        System.out.println("Area of rectangle: " + (length * breadth));
	    }
	    public static void main(String[] args) 
	    {
	    	Oops1AreaCalculator calculator = new Oops1AreaCalculator();

	    	calculator.area(5);

	        calculator.area(4, 6);
	    }
	}
	
