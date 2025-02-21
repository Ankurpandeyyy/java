package Abstractandintefaceexamples;
interface A1
{
	public static void show()
	{
		System.out.println("static method of interface");
	}
    
}
class A2 implements A1
{
	public static void show2()
	{
		System.out.println("static of baby");
	}
}

public class Q2 {

	public static void main(String[] args)
	{
	 A2 x = new A2();
	  x.show2();
	  A1.show();	 
	}
}
