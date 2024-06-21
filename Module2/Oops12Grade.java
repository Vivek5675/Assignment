/*Write a program which will ask the user to enter his/her marks (out of 100). Define a
method that will display grades according to the marks entered as below:
Marks Grade :
1-100 A
1-90 B
1-80 B
1-70 C
1-60 D
41-50 DD
40 Fail*/

package module2;

import java.util.Scanner;

public class Oops12Grade 
{

    public static void displayGrade(int marks)
    {
        String grade;

        if (marks >= 91 && marks <= 100)
        {
            grade = "A";
        }
        else if (marks >= 81 && marks <= 90)
        {
            grade = "B";
        }
        else if (marks >= 71 && marks <= 80)
        {
            grade = "B"; // Note: Grades B for 71-80 is repeated as per the question requirements
        }
        else if (marks >= 61 && marks <= 70)
        {
            grade = "C";
        } 
        else if (marks >= 51 && marks <= 60) 
        {
            grade = "D";
        } 
        else if (marks >= 41 && marks <= 50)
        {
            grade = "DD";
        }
         else 
         {
            grade = "Fail"; 
         }

        System.out.println("Marks " + marks + " Grade : " + grade);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your marks (out of 100): ");
        int marks = scanner.nextInt();

        displayGrade(marks);
    }
}
