package file_handling;
import java.io.*;
public class Delete_File {

	public static void main(String[] args)
	{
		try {
	        FileWriter f2 = new FileWriter("ff.txt");
	        f2.write("File is ready for deletion");
	        f2.close();
	        
	        File f1 = new File("ff.txt");
	        if(f1.exists())
	        {
	        	f1.delete();
	        	System.out.println("File deleted successfully");
	        }
	        else {
	        	System.out.println("File not yet deleted");
	        }
		}catch(IOException e){
			e.printStackTrace();
		}

	}

}
