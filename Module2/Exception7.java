/*W.A.J.P to create a custom exception if Customer withdraw amount which is greater
than account balance then program will show custom exception otherwise amount
will deduct from account balance. Account balance is: 2000 Enter withdraw amount:
2500
Sorry, insufficient balance, you need more 500 Rs. To perform this transaction*/

package module2;

import java.util.Scanner;

class InsufficientBalanceException extends Exception 
{
    public InsufficientBalanceException(String message) 
    {
        super(message);
    }
}

public class Exception7 {
    private static int accountBalance = 2000;

    public static void withdraw(int amount) throws InsufficientBalanceException 
    {
        if (amount > accountBalance)
        {
            int shortfall = amount - accountBalance;
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + shortfall + " Rs. to perform this transaction.");
        }
        else 
        {
            accountBalance -= amount;
            System.out.println("Transaction successful! Your new balance is: " + accountBalance + " Rs.");
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Account balance is: " + accountBalance);

        System.out.print("Enter withdrawal amount: ");
        int withdrawAmount = scanner.nextInt();

        try 
        {
            withdraw(withdrawAmount);
        } 
        catch (InsufficientBalanceException e) 
        {
            System.out.println(e.getMessage());
        } 
    }
}
