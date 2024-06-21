/*Print the sum, difference and product of two complex numbers by creating a class
named 'Complex' with separate methods for each operation whose real and
imaginary parts are entered by user. */

package module2;

import java.util.Scanner;

class Complex 
{
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) 
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex add(Complex other) 
    {
        double newReal = this.real + other.real;
        double newImaginary = this.imaginary + other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex subtract(Complex other) 
    {
        double newReal = this.real - other.real;
        double newImaginary = this.imaginary - other.imaginary;
        return new Complex(newReal, newImaginary);
    }

    public Complex multiply(Complex other) 
    {
        double newReal = this.real * other.real - this.imaginary * other.imaginary;
        double newImaginary = this.real * other.imaginary + this.imaginary * other.real;
        return new Complex(newReal, newImaginary);
    }

    public void display() {
        System.out.println(this.real + " + " + this.imaginary + "i");
    }
}

public class Oops6Complex 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter real part of first complex number:");
        double real1 = scanner.nextDouble();
        System.out.println("Enter imaginary part of first complex number:");
        double imaginary1 = scanner.nextDouble();

        System.out.println("Enter real part of second complex number:");
        double real2 = scanner.nextDouble();
        System.out.println("Enter imaginary part of second complex number:");
        double imaginary2 = scanner.nextDouble();

        Complex complex1 = new Complex(real1, imaginary1);
        Complex complex2 = new Complex(real2, imaginary2);

        System.out.println("\nComplex numbers entered:");
        System.out.print("First complex number: ");
        complex1.display();
        System.out.print("Second complex number: ");
        complex2.display();

        Complex sum = complex1.add(complex2);
        System.out.println("\nSum of the two complex numbers:");
        sum.display();

        Complex difference = complex1.subtract(complex2);
        System.out.println("\nDifference of the two complex numbers:");
        difference.display();

        Complex product = complex1.multiply(complex2);
        System.out.println("\nProduct of the two complex numbers:");
        product.display();

        scanner.close();
    }
}


