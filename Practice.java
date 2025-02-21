package Abstractandintefaceexamples;
abstract class  I5
{
	abstract void show();
}
abstract class Trial extends I5
{
	abstract void display();
}
class General extends Trial
{
	public void show()
	{
		System.out.println("method of first abstract class");
	}
	public void display()
	{
		System.out.println("method of trial class");
	}
	public void know()
	{
		System.out.println("general method");
	}
}

public class Practice {

	public static void main(String[] args) 
	{
		//General x=new General();
		//Trial x=new General();
		I5 x=new General();
		x.show();
		//x.display();
		//x.know();

	}

}
