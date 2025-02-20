package Abstractandintefaceexamples;
class T1
{
	void show()
	{
		System.out.println("normal class method");
	}
}
 abstract class S1 extends T1
{
	void display()
	{
		System.out.println("abstract class method");
	}
}

public class AbsTest3 {

	public static void main(String[] args)
			{
		T1 x=new T1();
		x.show();
		//x.display();

	}

}
