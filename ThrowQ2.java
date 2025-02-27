package exceptionHandling;
import java.util.* ;
public class ThrowQ2 {

    public static int divide(int x , int y)	
	{
		try
		{
			return x/y ;
		}
		catch(ArithmeticException e)
		{
			System.out.println("arithmetic exception caught in divide rethrowing");
			throw(e);  // rethrowing Exception
			//return 0 ;
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			Scanner s = new Scanner(System.in);
			System.out.println("Enter two numbers");
			int a = s.nextInt();
			int b = s.nextInt();
			int c = divide(a,b);
			System.out.println("Result is : " +c);
		}
		catch(Exception e)
		{
			System.out.println("Exception aaya hai");
			System.out.println(e);
		}
		System.out.println("Normal Flow");
	}
}
