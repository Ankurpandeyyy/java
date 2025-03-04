package trialcodes;
class A1 
{
	int x=9,y=2;
	public A1()
	{
		x=1;
		y=7;
		System.out.println("Default constructor of parent");
	}
	public A1(int x, int y)
	{
		x = this.x;
		y = this.y;
		System.out.println("Pasrametrize constructor of parent");
		System.out.println(x);
		System.out.println(y);
	}
	public void display()
	{
		System.out.println(x);
		System.out.println(y);
	}
}
class B1 extends A1
{
	public B1()
	{
		System.out.println("default constructor of child");
	}
	public B1(int x, int y)
	{
		super(x,y);
		System.out.println("parametrize constructor of child");
		System.out.println(x);
		System.out.println(y);
	}
}
public class SuperExample {

	public static void main(String[] args) {
		B1 x=new B1();
		x.display();
		B1 y=new B1(6,7);
		y.display();
	}
}
