package exceptionHandling;
class ExampleThrows
{
	static void divide() throws ArithmeticException
	{
		int x = 12 , y= 0 ;
		int z = x/y ;
		System.out.println("result = "+z);
	}
}

public class ThrowSQ2 {

	public static void main(String[] args) 
	{
		try {
			ExampleThrows.divide();
		}catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		

	}

}
