package finalkeyword;
class AAA
{
	//final int x;
	final int x=10;
	final static int y=11;
	final int s = 44;
	
	void m()
	{
		int x = 20;
		int y= 25;
		int s = 55;
		System.out.println(x);
		System.out.println(y);
		System.out.println(s);
		final int z= 30;
		//z = 90;
		System.out.println(z);
		//int k;
		//System.out.println(k);
	}
}
public class Q2 {

	public static void main(String[] args)
	{
		AAA a = new AAA();
		//a.x=25;
		//a.y = 33;
		a.m();
		System.out.println(a.x);
		System.out.println(AAA.y);
	}
}
