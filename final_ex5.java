package finalkeyword;  // final cannot be initialised by following ways.....
class Test3
{
	static final int a;
//	Test3()
//	{
//		a = 10;
//	}
//	{
//		a = 11;
//	}
	static
	{
		a = 12;
	}
}
class Test5
{
//  final int a;
//	static
//	{
//		a = 20;
//	}
}
public class Q6 {

	public static void main(String[] args)
	{
		System.out.println(Test3.a);
	}
}
