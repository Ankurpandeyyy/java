package Abstractandintefaceexamples;
interface I1
{
	final static int i=7;
	public static void display()
	{
		System.out.println("can i");
		System.out.println(i);
	}
	void show();
}
interface I2
{
	abstract void display();
}
interface I3 extends I1, I2
{
	public void cat();
}
class Test implements I3
{
	public void show()
	{
		System.out.println("show method of I1");
	}
	public void display()
	{
		System.out.println("Display method of I2");
	}
	public void cat()
	{
		System.out.println("meo meo");
	}
}
public class InterfaceQ1 {

	public static void main(String[] args)
	{
		I3 t = new Test();
		//I1 t = new Test();
		//I1 t=new I1();
		t.show();
		t.display();
		t.cat();
		I1.display();
	}
}
