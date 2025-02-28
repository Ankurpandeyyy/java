package exceptionHandling;
import java.io.IOException;
public class ThrowsQ1 
{

		void m() throws IOException
		{
			throw new IOException("device Error");
		}
		void n() throws IOException
		{
			m();
		}
		void p()
		{
			try {
				n();
			}catch(Exception e)
			{
				System.out.println("Exception Handled");
			}
		}
		public static void main(String args[])
		{
			ThrowsQ1 o1 = new ThrowsQ1();
			  o1.p();
			  System.out.println("Normal flow");
		}

	

}
