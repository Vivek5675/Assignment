/*W.A.J.P to create one thread by implementing Runnable interface in
Class.
*/

package module2;

public class Multithreading1ThreadRunnable implements Runnable
{

	@Override
	public void run() 
	{
		for (int i = 0; i < 5; i++) 
		{
            System.out.println("Thread: " + i);
            try
            {
                Thread.sleep(1000); // Sleep for 1 second
            }
            catch (InterruptedException e) 
            {
                e.printStackTrace();
            }
		}
	}
	public static void main(String[] args)
	{
		Multithreading1ThreadRunnable ex = new Multithreading1ThreadRunnable();  
		        Thread t1= new Thread(ex);  
		        t1.start();  
		        System.out.println("Hi");  
	}  
}
