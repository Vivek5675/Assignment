/*W.A.J.P to create a class Student with attributes roll no, name, age and course.
Initialize values through parameterized constructor. If age of student is not in
between 15 and 21 then generate user defined exception
"AgeNotWithinRangeException". If name contains numbers or special symbols
raise exception "NameNotValidException". Define the two exception classes.
*/

package module2;

class AgeNotWithinRangeException extends Exception 
{
 public AgeNotWithinRangeException(String message)
 {
     super(message);
 }
}

class NameNotValidException extends Exception 
{
 public NameNotValidException(String message)
 {
     super(message);
 }
}

public class Exception8
{
 private int rollNo;
 private String name;
 private int age;
 private String course;

 public Exception8(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException
 {
     this.rollNo = rollNo;
     setName(name);
     setAge(age);   
     this.course = course;
 }

 public void setAge(int age) throws AgeNotWithinRangeException 
 {
     if (age < 15 || age > 21)
     {
         throw new AgeNotWithinRangeException("Age not within the valid range (15-21).");
     }
     this.age = age;
 }

 public void setName(String name) throws NameNotValidException
 {
     if (!name.matches("[a-zA-Z\\s]+"))
     {
         throw new NameNotValidException("Name contains invalid characters.");
     }
     this.name = name;
 }

 @Override
 public String toString() 
 {
     return "Student [Roll No: " + rollNo + ", Name: " + name + ", Age: " + age + ", Course: " + course + "]";
 }

 public static void main(String[] args) 
 {
     try 
     {
         Exception8 student1 = new Exception8(1, "Vivek", 18, "Computer Science");
         System.out.println(student1);

         Exception8 student2 = new Exception8(2, "Smith", 22, "Mathematics");
         System.out.println(student2);

     } 
     catch (AgeNotWithinRangeException e)
     {
         System.out.println(e.getMessage());
     }
     catch (NameNotValidException e) {
         System.out.println(e.getMessage());
     }

     try 
     {
         Exception8 student3 = new Exception8(3, "Abcd@123", 19, "Physics");

     } 
     catch (AgeNotWithinRangeException e) 
     {
         System.out.println(e.getMessage());
     } 
     catch (NameNotValidException e) 
     {
         System.out.println(e.getMessage());
     }
 }
}

