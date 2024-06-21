/*Create an abstract class 'Bank' with an abstract method 'getBalance'. $100, $150 and
$200 are deposited in banks A, B and C respectively. 'BankA', 'BankB' and 'BankC'are
subclasses of class 'Bank', each having a method named 'getBalance'. Call this
method by creating an object of each of the three classes.
*/

package module2;

abstract class Bank
{
	abstract int getBalance();
}
	class BankA
	{
		int Balance = 100;
		
		int getBalance()
		{
			return Balance;
			
		}
	}
	
	class BankB
	{
		int Balance = 150;
		
		int getBalance()
		{
			return Balance;
		}
			
	}
	
	class BankC
	{
		int Balance = 200;
		
		int getBalance()
		{
			return Balance;
		}
			
	}
	
public class Oops8AbstractBank 
{
	public static void main(String[] args) 
	{
		BankA bankA = new BankA();
		BankB bankB = new BankB();
		BankC bankC = new BankC();
		
		System.out.println("Balance of BankA is: $" + bankA.getBalance());
		System.out.println("Balance of BankB is: $" + bankB.getBalance());
		System.out.println("Balance of BankC is: $" + bankC.getBalance());
	}
}
