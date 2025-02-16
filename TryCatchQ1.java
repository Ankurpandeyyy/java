package exceptionHandling;

public class TryCatchQ1
{
  public static void main(String args[])
  {
	  int a=50,b=0,c;
	  try
	  {
	    c = a/b ;
	  }
	  catch(ArithmeticException e)
	  {
		  System.out.println(e);	  
	  }
	  System.out.println("hello pandey");
	  System.out.println("hello Ankur");
  }
}
