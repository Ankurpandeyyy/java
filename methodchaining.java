package trialcodes;
class Ankur
{
   public void display()
   {
	 System.out.println("Ankur wala method");  
   }
   public void show()
   {
	   System.out.println("method chain");
   }
}
public class methodchaining {

	public static void main(String[] args)
	{
		Ankur x = new Ankur();
	//	x.display().show();    // why it is not working
        x.display();
        x.show();
	}
}


