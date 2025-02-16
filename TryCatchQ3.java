package exceptionHandling;

public class TryCatchQ3 {

	public static void main(String[] args)
	{
		 int a=50,b=2,c;
		 System.out.println("1");
		 try
		 {
			 System.out.println("2");
			 c = a / b;
			 System.out.println(c);
			 System.out.println("3");
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("GALAT H KYA BHAIIII?");
			 System.out.println(e);
			 System.out.println("4");
		 }
		 System.out.println("5");

	}

}
