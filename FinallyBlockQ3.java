package exceptionHandling;  // when an exception occur but not handled by catch block 

public class FinallyBlockQ3 {

	public static void main(String[] args) 
	{
		try
		{
			System.out.println("Inside Try Block");
			int data = 32/0 ;
			System.out.println(data);
		}
		catch(NullPointerException e)
		{
			System.out.println("Hiii");
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally always executed");
		}
		System.out.println("Rest of the code");

	}

}
