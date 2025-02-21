package exceptionHandling;

public class TryCatchQ5 {

	public static void main(String[] args)
	{
		try
		{
			int data = 50/0 ;
		}
//		catch(ArrayIndexOutOfBoundsException e)
//		{
//			System.out.println("Hooooo");
//			System.out.println(e);
//		}
		//System.out.println("Normal Flow");
		catch(Exception e)
		{
			System.out.println("yuppp");
			System.out.println(e);
			System.out.println("yaaaa");
		}
		System.out.println("normal flow");

	}

}
