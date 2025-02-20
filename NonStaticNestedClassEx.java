package Nestedclassex;
class A1
{
	int x=10;
	static int g=80;
	private int z=70;
	void m()
	{
		System.out.println("Hello M method of A1");
		System.out.println(x);
		System.out.println(g);
		System.out.println(z);
		//System.out.println(y);
		//System.out.println(h);
		System.out.println(B.h);
		B b = new B();
		System.out.println(b.y);
		b.m2();
		}
	class B  // non static nested inner class
	{
		int y = 20;
		static int h=90;
		void m2()
		{
			System.out.println("hello M2 method of B");
			System.out.println(y);
			System.out.println(x);
			System.out.println(g);
			System.out.println(z);
			System.out.println(h);
		}}}
public class NonStaticNestedClassEx {

	public static void main(String[] args) 
	{
		//B b = new B();
		System.out.println(A1.B.h); //90
		System.out.println(A1.g); //80
		A1 a = new A1();          
		System.out.println(a.x);//10
		a.m();                  //
		A1.B b = a.new B();
		System.out.println(b.y);
		b.m2();
		//System.out.println(b.x);
		//System.out.println(a.y);

	}

}
