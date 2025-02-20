package Abstractandintefaceexamples;
abstract class Abs2
{
	int a,b;
	public Abs2()
	{
		//super();	
		System.out.println("Default constructor of Abs2");
	}
	public Abs2(int a,int b)
	{
		//super();
		this.a=a;
		this.b=b;
		System.out.println("Two parameterize constructor of Abs2");
	}
	abstract public void display();
	public void sub()
	{
		System.out.println(a-b);
	}
	
	public static void add(int x, int y)
	{
		System.out.println(x+y);
	}
}
class SubC2 extends Abs2
{
	public SubC2()
	{
		System.out.println("default of subc2");
	}
	public SubC2(int x,int y)
	{
		super(x,y);
	}
	public void display()
	{
		System.out.println("In patna");
	}
	
}
public class AbsTest2 {

	public static void main(String[] args) 
	{
		Abs2 x1 = new SubC2();
		SubC2 x2 = new SubC2(5,6);
		x1.display();
		Abs2.add(11, 22);
		x2.sub();
	}
}
