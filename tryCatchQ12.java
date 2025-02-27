package exceptionHandling;
import java.util.Scanner;
public class tryCatchQ12 {

	public static void main(String[] args)
	{
		try{
			Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = a+ b ;
		System.out.println("sum = "+c);
		}catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Exception Block 1");
		}
//		catch(ArithmeticException e)
//		{
//			System.out.println("ArithmeticException Block 2");
//		}
	}

}
