package termwork;

class Shared
{
	synchronized void print(String message)
	{
		System.out.print("[ "+message);
		try {
			Thread.sleep(500);
		}catch(Exception e)
		{
			System.out.println("Interrupted");
		}
		System.out.print(" ]");
	}
}

class Printer extends Thread{
	String message ;
	Shared shared ;
	Printer(Shared ss , String message)
	{
		this.message = message ;
		this.shared = ss ;
	}
	
	public void run()
	{
		shared.print(message);
	}
}

public class synchronizedEx 
{

	public static void main(String[] args)
	{
		Shared s1 = new Shared();
		Printer p1 = new Printer(s1, "heyy");
		Printer p2 = new Printer(s1, "It's");
		Printer p3 = new Printer(s1, "Me");
		
		p1.start();
		p2.start();
		p3.start();
		

	}

}
