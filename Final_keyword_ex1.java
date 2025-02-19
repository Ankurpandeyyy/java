package finalkeyword;
class AA
{
	final private void m1()
	{
		System.out.println("hello final private");
	}
	final static void mm()
	{
		System.out.println("Hello final static");
	}
	void m2()
	{
		m1();
		System.out.println("hello M2 method");
	}
}
class BB extends AA
{
	void m1()
	{
		System.out.println("m1 of baby");
	}
//	static void mm(){          // cannot override final method  
//		System.out.println("");} 
	void m2() {
		System.out.println("hello baby method m2");
		}
	}
public class Q1 {

	public static void main(String[] args) 
	{
		AA a = new AA();
                                  // a.m1();
		   a.mm();  // it can also accessed by static way
		   a.m2();
		   
		BB b = new BB();
		  b.m1();
		  b.m2();
		  b.mm();
	}

}
