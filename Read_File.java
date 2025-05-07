package file_handling;
import java.io.*;
import java.util.Scanner ;
public class Read_File {

	public static void main(String[] args)
	{
		try {
			//File f1 = new File("myFile.txt");
			FileWriter f1 = new FileWriter("myFile1.txt");
			f1.write("File handling in java is such a intresting Topic");
			f1.close();
			
			File f = new File("myFile1.txt");
			Scanner sc = new Scanner(f);
			if(sc.hasNextLine())
			{
				String data = sc.nextLine();
				System.out.println(data);
			}
			System.out.println("File has been Read sucessfully");
			sc.close();
			
		}catch(IOException e)
		{
			e.printStackTrace();
		}
		

	}

}
