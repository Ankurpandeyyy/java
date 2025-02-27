package exceptionHandling;

public class MultipleTryBlockQ1 {

	public static void main(String[] args)
	{
		try
		{
			System.out.println("HIIII");
			try
			{
				System.out.println("Going to divide");
				System.out.println(6/0);
			}
			catch(ArithmeticException e)
			{
				System.out.println("DIVIDE ERROR");
			}
			try
			{
				int a[] = new int[5];
				a[5] = 7 ;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println("Range out...");
			}
		}
		catch(Exception e)
			{
			System.out.println("All handled");
			}
		System.out.println("Finished");
	}

}
