package exceptionHandling;

public class NestedTryBlockQ2 {

	public static void main(String[] args)
	{
		try
		{
			try
			{
				System.out.println("Going to divide by 0");
				int b = 34/0 ;
			}
			catch(ArithmeticException e)
			{
				System.out.println(e);
				System.out.println("ye to chll gyaa");
			}
			try
			{
				int a[]=new int[5];
				a[5] = 7 ;
			}
			catch(ArrayIndexOutOfBoundsException e)
			{
				System.out.println(e);
				System.out.println("ye v chll gyaa");
			}
			System.out.println("Other statements");
		}
		catch(Exception e)
		{
			System.out.println("Handled the exception all easily");
		}
		System.out.println("Normal flow");

	}

}
