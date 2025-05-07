package file_handling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Pic_read {

	public static void main(String[] args)
	{
		try {
			FileInputStream fi = new FileInputStream("C:\\Users\\Ankur Pandey\\Downloads\\abc.jpg");
			FileOutputStream fo = new FileOutputStream("C:\\Users\\Ankur Pandey\\Downloads\\CopyABC.jpg");
			int a = fi.read();
			while(a!=-1)
			{
				fo.write(a);
				a= fi.read();
				
			}
			fi.close();
			fo.close();
		}catch(Exception e)
		{
			System.out.println("File not found");
		}
		finally{System.out.println("File copied");}		
	}

}
