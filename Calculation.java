package inheritance;
class A1
{
	int l=3,b=4,h=5;
	protected void area()
	{
		System.out.println("Area of rectangle = "+(l*b));
	}
}
class V1 extends A1
{
public void vol()
{
	System.out.println("volume of cuboid = "+(l*b*h));
}
}

public class Calculation
{

	public static void main(String[] args)
	{
		V1 x=new V1();
		x.area();
		x.vol();

	}

}
