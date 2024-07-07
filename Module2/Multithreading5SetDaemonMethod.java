/*W.A.J.P to create 2 threads and make one thread as Daemon Thread by using set
Daemon () method of Thread class and check whether the thread is set daemon or
not by using is Daemon () method.
TestDaemonThread2 t1=new TestDaemonThread2();
TestDaemonThread2 t2=new TestDaemonThread2(); t1.start();
t1.setDaemon(true);//will throw exception here t2.start();*/

package module2;

class Multithreading5SetDaemonMethod extends Thread
{
	public void run() 
	{
		if (Thread.currentThread().isDaemon())
	    {
			System.out.println(Thread.currentThread().getName() + " is a daemon thread");
	    }
	    else
	    {
	    	System.out.println(Thread.currentThread().getName() + " is a user thread");
	    }
	}

	public static void main(String[] args)
	{
		Multithreading5SetDaemonMethod t1 = new Multithreading5SetDaemonMethod();
		Multithreading5SetDaemonMethod t2 = new Multithreading5SetDaemonMethod();
	        
	    t1.setDaemon(true); 
	    t1.start();
	        
	    t2.start();
	        
	    System.out.println("Thread t1 is daemon: " + t1.isDaemon());
	    System.out.println("Thread t2 is daemon: " + t2.isDaemon());
	}
}
