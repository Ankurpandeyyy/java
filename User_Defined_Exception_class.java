package termwork;
import java.util.Scanner;

class InvalidAgeException extends Exception
{
	public InvalidAgeException(String message)
	{
		super(message);
	}
}
public class User_Defined_Exception_class
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter age");
		int age = sc.nextInt();
		try {
		if(age<18)
			throw new InvalidAgeException("Age must be above 18");
		}catch(InvalidAgeException e){
			System.out.println(e);
		}

	}

}
