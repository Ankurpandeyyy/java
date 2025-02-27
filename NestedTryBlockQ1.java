package exceptionHandling;

public class NestedTryBlockQ1 {

	public static void main(String[] args)
	{
		System.out.println("11111111");
		try
		{
			System.out.println("222222");
			int a = 22, b=0;
			System.out.println(a/b);
			System.out.println("3333333");
		}
		catch(ArithmeticException e1)
		{
			System.out.println("4444444");
			System.out.println(e1);
			System.out.println("5555555");
		}
		catch(Exception e2)
		{
			System.out.println("6666666");
			System.out.println(e2);
		}
		System.out.println("normal flow");

	}


	}


