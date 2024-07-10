/*Create a class named 'Member' having the following members:
1. Data members
2. Name
3. Age
4. Phone number
5. Address
6. Salary
It also has a method named 'printSalary' which prints the salary of the members.*/

package module2;

	public class Oops3Member 
	{

	    private String name;
	    private int age;
	    private String phoneNumber;
	    private String address;
	    private double salary;
	    
	    public Oops3Member(String name, int age, String phoneNumber, String address, double salary) 
	    {
	        this.name = name;
	        this.age = age;
	        this.phoneNumber = phoneNumber;
	        this.address = address;
	        this.salary = salary;
	    }
	    
	    public void printSalary()
	    {
	        System.out.println("The salary of " + name + " is " + salary);
	    }
	    
	    public static void main(String[] args)
	    {
	    	Oops3Member member1 = new Oops3Member("vivek ", 30, "1234567890", "123 Street, City", 50000);
	        member1.printSalary();
	    }
	}

