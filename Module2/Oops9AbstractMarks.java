/*We have to calculate the percentage of marks obtained in three subjects (each out of
100) by student A and in four subjects (each out of 100) by student B. Create an
abstract class 'Marks' with an abstract method 'getPercentage'. It is inherited by two
other classes 'A' and 'B' each having a method with the same name which returns the
percentage of the students. The constructor of student A takes the marks in three
subjects as its parameters and the marks in four subjects as its parameters for student
B. Create an object for each of the two classes and print the percentage of marks for
both the students.
*/

package module2;

abstract class Marks
{
	abstract Double getPercentage();
}

class A extends Marks
{
	private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;


    public A(int m1, int m2, int m3) 
    {
    	this.subject1Marks = m1;
    	this.subject2Marks = m2;
    	this.subject3Marks = m3;
    }

    public Double getPercentage()
    {
    	double totalMarks = subject1Marks + subject2Marks + subject3Marks;
    	return (totalMarks / 300) * 100;
    }
}

class B extends Marks
{
	private int subject1Marks;
    private int subject2Marks;
    private int subject3Marks;
    private int subject4Marks;
    
    public B(int m1, int m2, int m3, int m4)
    {
        this.subject1Marks = m1;
        this.subject2Marks = m2;
        this.subject3Marks = m3;
        this.subject4Marks = m4;
    }
		
    public Double getPercentage() 
    {
        double totalMarks = subject1Marks + subject2Marks + subject3Marks + subject4Marks;
        return (totalMarks / 400) * 100;
    }
    
}

public class Oops9AbstractMarks 
{
	public static void main(String[] args) 
	{
		A studentA = new A(85, 90, 92);
        double percentageA = studentA.getPercentage();
        System.out.println("Percentage of student A: " + percentageA);

        B studentB = new B(78, 85, 80, 88);
        double percentageB = studentB.getPercentage();
        System.out.println("Percentage of student B: " + percentageB);
	}
}
