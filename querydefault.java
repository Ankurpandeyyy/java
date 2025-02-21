package Abstractandintefaceexamples;
interface M1
{
	default void display()
	{
		System.out.println("method having default modifier can work inside interfaces");
	}
}

public class querydefault implements M1
{

	public static void main(String[] args)
	{
	M1 x=new querydefault();	
	x.display();

	}

}
//abstract class MyAbstract {
//private void myMethod() {
//System.out.println("Private Method");
//}
//}
//class MyClass extends MyAbstract {
//public static void main(String[] args) {
//MyAbstract obj = new MyClass();
//obj.myMethod();
//}
//}