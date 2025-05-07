package file_handling;
import java.io.*;


public class ex_01_create_File 
{
	
	public static void main(String[] args)
	{
		File f1 = new File("File1.txt");
		try {
			f1.createNewFile();
			System.out.println("File Created");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
