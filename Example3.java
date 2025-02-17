package HasaRelation;

class P1
{
 void add(int x,int y)
 {
	 System.out.println("Addition is ="+(x+y));
 }
}
class C1
{
	P1 q = new P1();
	public void sub(int a,int b) 
	{
		q.add(6,7);
		System.out.println("Subtraction is = "+(a-b));
	}
}
public class Example3 
{
	public static void main(String[] args) 
	{
	C1 c=new C1();
	c.sub(9, 4);
   	}
}

