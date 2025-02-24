package exceptionHandling;  // When an exception does not occur

public class FinallyBlockQ2 {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Inside the Try block");
			int data = 25/5 ;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			int s = 2/0 ;
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally block is always executed");
		}
		System.out.println("Rest of the code");

	}

}
