package exceptionHandling;

public class TryCatchQ2 {

	public static void main(String[] args) 
	{
		 System.out.println("1");
		 int a=50,b=0,c;
		 System.out.println("2");
		 try
		 {
			 System.out.println("3");
			 c = a/b;
			 System.out.println("4");      
			 System.out.println("5");
		 }
		 catch(ArithmeticException e)
		 {
			 System.out.println("6");
			 System.out.println("GALAT H BHAIIIIII");
			 System.out.println(e);
			 System.out.println("HIIII catch");
		 }
		 System.out.println("HELLOOOOOOO");

	}

}
