package exceptionHandling;
import java.io.FileInputStream;
public class CheckedUncheckedException {

	public static void main(String[] args)
//	{
//		FileInputStream fis = new FileInputStream("d:/abc.txt");  //Checked exception
//	}
	
	
	{
		try            
		{
			FileInputStream fis = new FileInputStream("d:/abc.txt");  // Unchecked Exception
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
