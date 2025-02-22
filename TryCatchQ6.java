package exceptionHandling;

public class TryCatchQ6 {

	public static void main(String[] args)
	{
		try
		{
			int a[] = {1,3,5,7};
			System.out.println(a[10]);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("handleddd");
			System.out.println(e);
		}
		System.out.println("Normal flow");

	}

}
