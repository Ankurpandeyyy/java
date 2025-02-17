package objects;
class AAA
{
	int x;
	String y;
	void M()
	{
		x=23;
	}
	void Show()

{
		System.out.println(x+y);}
}
public class Object3 {

	public static void main(String[] args) {
		AAA a=new AAA();
		a.x=10;
		a.M(); 
		AAA b=new AAA();
		b.y="Ram";
		b.M(); 
        b.x=90;
        a.Show();
        b.Show();
	}

}
