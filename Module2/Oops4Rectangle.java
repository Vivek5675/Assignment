package module2;

class Rectangle 
{
	    private int length;
	    private int breadth;
	    
	    public Rectangle(int length, int breadth) 
	    {
	        this.length = length;
	        this.breadth = breadth;
	    }
	    
	    public void calculateArea() 
	    {
	        int area = length * breadth;
	        System.out.println("Area of rectangle: " + area);
	    }
	    
	    public void calculatePerimeter() {
	        int perimeter = 2 * (length + breadth);
	        System.out.println("Perimeter of rectangle: " + perimeter);
	    }
	}

	class Square extends Rectangle 
	{
	    public Square(int side)
	    {
	        super(side, side); 
	    }
	}

	public class Oops4Rectangle
	{
	    public static void main(String[] args) 
	    {
	        
	        Rectangle rectangle = new Rectangle(5, 10);
	        rectangle.calculateArea();
	        rectangle.calculatePerimeter();
	        
	        System.out.println(); 
	        
	        Square square = new Square(4); 
	        square.calculateArea();
	        square.calculatePerimeter();
	    }
}


