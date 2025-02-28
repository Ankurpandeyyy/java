package exceptionHandling;
import java.util.Scanner;
import java.lang.Exception;
class MyExcep extends Exception
{
	 MyExcep(String e)
	{
		super(e);
	}
}

public class throwQ3
{
	public static void main(String args[]) 
	{
		try
		{
	  	Scanner s = new Scanner(System.in);
	  	System.out.println("enter value of a and b");
	  	int a = s.nextInt();
	  	int b = s.nextInt();
	  	if(b==0)
	  		throw new MyExcep("Denominator cannot be Zero");
	  	else if(a<b)
				throw new MyExcep("Denominator must be less than numerator");
	    int c = a/b ;
	    System.out.println("result = "+c);
	    
		}catch(Exception e)
		{
			System.out.println(e);
		}
	  	
	}
}
