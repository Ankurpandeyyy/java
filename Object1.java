package objects;
class A
{
	int x;
	void M()
	{
		System.out.println("HI A");
	}
}

public class Object1 
{

	public static void main(String[] args) 
	{
	 A a=new A();
	 a.x=10;
	 a.M(); // hi A
	 A b=new A();
	 b.x=40;
	 b.M(); // hi A
	 System.out.println(a.x); //10
	 System.out.println(b.x); //40

	}

}
