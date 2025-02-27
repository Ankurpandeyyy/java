package exceptionHandling;

public class NestedTryBlockQ3 {

	public static void main(String[] args) 
	{
	  try
	  {
		  try
		  {
			  try
			  {
				  int arr[] = {1,2,3,4};
				  System.out.println(arr[10]);
			  }
			  catch(ArithmeticException e)
			  {
				  System.out.println("arithmetic exception");
				  System.out.println("Inner Try Block 2");
			  }
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Arithmetic Exception ....");
			  System.out.println("Inner Try Block 1");
		  }
	  }
	  catch(ArrayIndexOutOfBoundsException e1)
	  {
		  System.out.println(e1);
		  System.out.println("Outer Main Try Block");
	  }
	  catch(Exception e2)
	  {
		 System.out.println("Exception ");
		 System.out.println("Handled in main try block");
	  }
	  System.out.println("Normal Flow");

	}

}
