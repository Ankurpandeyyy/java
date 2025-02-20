package overriding;
class A
{
	public void m2()
	{
		System.out.println("HELLO A");
	}
	public void m5()
	{
		System.out.println("HI A");
	}
}
class B extends A
{
	public void m1()
	{
		System.out.println("HI B");
	}
	public void m5()
	{
		System.out.println("HIoooo A");
	}
}
public class MethodOverridingEx1 {

	public static void main(String[] args) {
		
     A b=new B();
      b.m2();
      b.m5();
     A a = new A();
     a.m5();
      
	}

}
