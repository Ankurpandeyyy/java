package inheritance;
class Number
{
	int a=4;
	public void num()
	{
		System.out.println("length is "+a);
	}
}
class Number2 extends Number
{
	int b=5;
	public void num2()
	{
		System.out.println("breadth is "+b);
	}
}
class Area extends Number2
{
	public void res()
	{
		System.out.println("area will be = "+(a*b));
	}
}

public class CalculateArea {

	public static void main(String[] args) {
		Area x=new Area();
		     x.num();
		     x.num2();
		     x.res();

	}

}
