package termwork;

public class Mythread extends Thread
{
	Mythread()
	{
		super("Parent Thread");
		System.out.println("child thread");
		start();
		
	}
	
	public void run()
	{
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println("child thread is running "+currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(Exception e)
			{
				System.out.println("interrupted main");
			}
		}
	}

	public static void main(String[] args)
	{
		new Mythread();
		System.out.println("main Thread");
		
		for(int i=0 ; i<5 ; i++)
		{
			System.out.println("main thread is running "+currentThread().getName());
			try {
				Thread.sleep(500);
			}catch(Exception e)
			{
				System.out.println("interrupted main");
			}
		}
		System.out.println("main done");

	}

}
