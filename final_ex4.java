package finalkeyword;  // final can be initialised by following ways.....
class Test
{
	final int a;
	Test()        //INSIDE A CONSTRUCTOR
	{
		a = 15;     
	}
}
class Test1
{
	final int a;
	{                  //INSIDE A ANONYMOUS BLOCK
		a =10;
	}
}
class Test2
{
	static final int a;
	static             // INSIDE A A=STATIC BLOCK
	{
		a = 12;
		System.out.println("HELLO");
	}
}

public class Q4 {

	public static void main(String[] args)
	{
		System.out.println(Test2.a);
		Test1 x = new Test1();
		System.out.println(x.a);
		
		Test y = new Test();
		System.out.println(y.a);

	}

}
