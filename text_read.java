package file_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class text_read {

	public static void main(String[] args) {
		try {
			FileInputStream fi = new FileInputStream("C:\\Users\\Ankur Pandey\\OneDrive\\Desktop\\graph.txt");
			FileOutputStream fo = new FileOutputStream("C:\\Users\\Ankur Pandey\\OneDrive\\Desktop\\cpygraph.txt");
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

