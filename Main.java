package Abstractandintefaceexamples;
abstract class Parent
{
	Parent()
	{
	 System.out.println("Parent constructor Called");	
	}
}
class Child extends Parent
{
	Child()
	{
		//super();
		System.out.println("Child constructor called");
	}
}

public class Main {

	public static void main(String[] args) {
		Child c =new Child();
		

	}

}
