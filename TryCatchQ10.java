package exceptionHandling;

public class TryCatchQ10 {

	public static void main(String[] args)
	{
		try
		{
			String s = null ;
			System.out.println(s.length());
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayIndexOutOfBoundsException occurs");
		}
		catch(Exception e)
		{
			System.out.println("Parent Exception Occurs");
		}
		System.out.println("Rest of the code");
	}

}
