package termwork;
import java.io.*;

public class Delete_non_empty_Files {

	public static void main(String[] args) 
	{
		File folder = new File("D:\\MCA");
		
		File files[] = folder.listFiles();
		
		if(folder.exists())
		{
			if(files!=null && files.length>0) {
			for(File file : files)
			{
				if(file.isFile() && file.getName().endsWith(".txt") && file.length()> 0)
				{
					if(file.delete())
					{
						System.out.println(file.getName()+ " has been deleted");
					}else {
						System.out.println(file.getName()+ " has not been deleted");
					}
				}
			}
			}else{
				System.out.println("there isn't any file");
				}	
		}else {
			System.out.println("no any files");
		}

	}

}
