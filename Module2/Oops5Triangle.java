/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and
5 units by creating a class named 'Triangle' without any parameter in its constructor.*/

package module2;

class Oops5Triangle 
{
	    private double side1;
	    private double side2;
	    private double side3;

	    public Oops5Triangle()
	    {
	        side1 = 3.0;
	        side2 = 4.0;
	        side3 = 5.0;
	    }

	    public double calculatePerimeter() 
	    {
	        return side1 + side2 + side3;
	    }

	    public double calculateArea() 
	    {
	        double s = calculatePerimeter() / 2.0;
	        double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
	        return area;
	    }

	    public static void main(String[] args)
	    {
	    	Oops5Triangle triangle = new Oops5Triangle();
	        
	        double perimeter = triangle.calculatePerimeter();
	        double area = triangle.calculateArea();

	        System.out.println("Perimeter of the triangle: " + perimeter + " units");
	        System.out.println("Area of the triangle: " + area + " square units");
	    }
}


