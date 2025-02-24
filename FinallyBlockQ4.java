package exceptionHandling;  // when an exception occur and handled by catch block

public class FinallyBlockQ4 {

	public static void main(String[] args)
	{
	 try
	 {
		 System.out.println("Inside Try");
		 int data = 55/0 ;
		 System.out.println(data);
	 }
	 catch(ArithmeticException e)
	 {
		 System.out.println("Hiii catch");
		 System.out.println("Error handled inside catch");
	 }
     finally
     {
    	 System.out.println("Finally will executed anyhow");
     }
	 System.out.println("Rest of the code");
	}

}
