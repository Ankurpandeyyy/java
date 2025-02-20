package Abstractandintefaceexamples;
abstract class Abs1
{
	public abstract void display();
	public void print()
	{
		System.out.println("In Bihar");
	}
}
class SubC1 extends Abs1
{
	public void display()
	{
		System.out.println("In patna");
	}
}

public class AbstractTest1 {

	public static void main(String[] args)
	{
	 Abs1 x=new SubC1();  // runtime polymorphism or dynamic polymorphism	
        x.display();
        x.print();
	}

}
