/*W.A.J.P to start the same Thread twice by calling start () method twice. Test
ThreadTwice1 t1=new TestThreadTwice1(); t1.start (); t1.start ();
*/

package module2;

class TestThreadTwice1 extends Thread
{
	@Override
	public void run()
	{
		System.out.println("Thread is Running....");
	}
}

public class Multithreading4SameThreadTwice 
{
	public static void main(String[] args) 
	{
		TestThreadTwice1 t1=new TestThreadTwice1();		
		t1.start();
		t1.start();
	}
}
