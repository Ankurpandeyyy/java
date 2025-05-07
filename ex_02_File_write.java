package file_handling;
import java.io.*;
public class ex_02_File_write {

	public static void main(String[] args) {
		
		
		try {
			FileWriter f1 = new FileWriter("f.txt");
				f1.write("This is file 2");
				System.out.println("File has been written");
			   f1.close();
		}catch(IOException e) {
			e.printStackTrace();
		}

	}

}
