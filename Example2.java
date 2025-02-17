package HasaRelation;
class P
{
	public P(int a)
	{
		System.out.println(a);
	}
	void show()
	{
		System.out.println("hello parent class");
	}
}
class Q
{
	P t;
	public Q()
	{
	  t = new P(8);	
	}
	void display()
	{
		t.show();
		System.out.println("hello new class");
	}
}


public class Example2 {

	public static void main(String[] args)
	{
		Q x=new Q();
		x.display();
		

	}

}
