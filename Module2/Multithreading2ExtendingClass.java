/*• W.A.J. P to create one thread by extending Thread class in another Class.*/

package module2;

public class Multithreading2ExtendingClass extends Thread
{
	public static void main(String[] args)
	{
		Multithreading2ExtendingClass thrd = new Multithreading2ExtendingClass();
	 
		thrd.start();
	 
		System.out.println("Outside the Thread");
	}
	 
	public void run()
	{
		System.out.println("Thread Executed");
	}
}
