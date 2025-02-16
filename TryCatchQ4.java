package exceptionHandling;

public class TryCatchQ4 {

	public static void main(String[] args)
	{
	  try
	  {
		  int data = 50/0 ;
	  }
	  catch(Exception e)
	  {
		  System.out.println("hiiiii");
		  int data2 = 50/0 ;
		  System.out.println("byeee");
	  }
	  System.out.println("rest of the code");

	}

}
