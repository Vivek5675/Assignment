/*Write a program in Java to input 5 numbers from keyboard and find their sum and
average using for loop.*/
package module2;

import java.util.Scanner;

public class Ans5
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int count = 5;

        System.out.println("Enter " + count + " subjects Marks:");

        for (int i = 0; i < count; i++) 
        {
            System.out.print("Subject " + (i + 1) + " Marks" + ": ");
            int number = scanner.nextInt();
            sum += number;
        }

        double average = sum / count;

        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
    }
}
