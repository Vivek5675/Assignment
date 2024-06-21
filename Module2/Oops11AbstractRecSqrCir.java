/*We have to calculate the area of a rectangle, a square and a circle. Create an abstract
class 'Shape' with three abstract methods namely 'RectangleArea' taking two
parameters, 'SquareArea' and 'CircleArea' taking one parameter each. The
parameters of 'RectangleArea' are its length and breadth, that of 'SquareArea' is its
side and that of 'CircleArea' is its radius. Now create another class 'Area' containing
all the three methods 'RectangleArea', 'SquareArea' and 'CircleArea' for printing the
area of rectangle, square and circle respectively. Create an object of class 'Area' and
call all the three methods.*/

package module2;

	abstract class Shape
	{
	    public abstract double RectangleArea(double length, double breadth);

	    public abstract double SquareArea(double side);

	    public abstract double CircleArea(double radius);
	}

	class Area extends Shape 
	{
	    public double RectangleArea(double length, double breadth)
	    {
	        return length * breadth;
	    }

	    public double SquareArea(double side) 
	    {
	        return side * side;
	    }

	    public double CircleArea(double radius) 
	    {
	        return Math.PI * radius * radius;
	    }
	}

	public class Oops11AbstractRecSqrCir 
	{
	    public static void main(String[] args) 
	    {
	        Area areaCalculator = new Area();

	        double length = 5.5;
	        double breadth = 3.0;
	        double rectangleArea = areaCalculator.RectangleArea(length, breadth);
	        System.out.println("Area of Rectangle (length = " + length + ", breadth = " + breadth + "): " + rectangleArea);

	        double side = 4.0;
	        double squareArea = areaCalculator.SquareArea(side);
	        System.out.println("Area of Square (side = " + side + "): " + squareArea);

	        double radius = 3.5;
	        double circleArea = areaCalculator.CircleArea(radius);
	        System.out.println("Area of Circle (radius = " + radius + "): " + circleArea);
	    }
	}
