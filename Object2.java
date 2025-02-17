package objects;
class AA
{
    int x;
	String y;
	void show() 
	{
		System.out.println(x+y);
	}
}

public class Object2 {

	public static void main(String[] args) 
	{
	AA a=new AA();
	a.x=9;
	a.y="Ankur";
	a.show();
	AA b=new AA();
	a.x = 20;
	b.y= "Raju";
	b.show();

	}

}
