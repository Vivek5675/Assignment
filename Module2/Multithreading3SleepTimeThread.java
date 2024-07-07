/*W.A.J.P to create 2 threads and execute that threads by providing sleep time as
2000ms and check the execution.
*/

package module2;

class CustomThread implements Runnable
{

	@Override
	public void run() 
	{
		try 
		{
			Thread.sleep(2000);
			 System.out.println(Thread.currentThread().getName() + " executed after 2000ms");
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
	}
	
}

public class Multithreading3SleepTimeThread 
{
	public static void main(String[] args)
	{
		Thread thread1 = new Thread(new CustomThread(), "Thread-1");
        Thread thread2 = new Thread(new CustomThread(), "Thread-2");
        
        thread1.start();
        thread2.start();
	}
}
