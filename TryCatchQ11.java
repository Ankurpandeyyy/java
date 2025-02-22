package exceptionHandling;

public class TryCatchQ11 {

	public static void main(String[] args) 
	{
		try
		{
			int a[] = new int[5];
			a[5] = 30/0 ;
		}
		catch(Exception e)
		{
			System.out.println("Arithmetic Exception occurs");
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("ArrayIndexOutOfBoundsException occurs");
//		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Parent Exception Occurs");
//		}
		System.out.println("Rest of the code");


	}

}
