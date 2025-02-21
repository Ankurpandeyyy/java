package Abstractandintefaceexamples;
interface I4
{
	int x = 10;
	static void add(int a,int b)
	{
		System.out.println("Addition is ="+(a+b));
	}
    void display();
	default void show()
	{
		hide();
		//add(6,7);    we can also use it by this process..
		System.out.println("default method body of interface");
	}
	private void hide()
	{
		System.out.println("private method of interface");
	}
}
abstract class A4
{
	public static void sub(int x, int y)
	{
		System.out.println("Subtraction is = "+(x-y));
	}
	 abstract void show2();	
}
class BabyOfAll extends A4 implements I4
{
	public void display()
	{
		System.out.println("method of INTERFACE");
	}
	public void show2()
	{
		System.out.println("method of ABSTRACT class");
	}
	public void show3()
	{
		System.out.println("method of BABY class");
		}
	}
public class MultipleInheritance {
	public static void main(String[] args)
	{
		System.out.println(I4.x);
		BabyOfAll x = new BabyOfAll();
	    I4.add(5,6);
		//x.add(4, 5);  // why is it wrong?=== because a statc method cannot be inherited.
		x.sub(10, 5);
		x.display();
        x.show2();
        x.show3();
        x.show();
    }
}
