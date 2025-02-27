package exceptionHandling;
import java.util.Scanner ;
public class ThrowQ1 {

	public static void main(String[] args) 
	{
		//int a = Integer.parseInt(args[0]);
		Scanner s = new Scanner(System.in);
		System.out.println("enter value for a");
		int a = s.nextInt();
		if(a==5 || a==10)
			throw new ArithmeticException("galt hai brooo");
		else
			System.out.println("sb shii haiii");
		System.out.println("Normal Flow");
	}

}
