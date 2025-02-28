package exceptionHandling;
import java.util.Scanner ;
class testing
{
	static void divide() throws Exception
	{
	  Scanner s = new Scanner(System.in);
	  System.out.println("Enter value of a and b");
	  int a = s.nextInt();
	  int b = s.nextInt();
	  //int c = a/b ;
	  if(b==0)
		  throw new ArithmeticException("Not again");
	}
}

public class ThrowSQ3 {

	public static void main(String[] args) 
	{
	 try {
		 testing.divide();
		 
	 }catch(Exception e)
	 {
		 System.out.println(e);
	 }

	}

}
