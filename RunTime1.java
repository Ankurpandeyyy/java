package overriding;
class Animal
{
	public void Whoiam() {
		System.out.println("I AM ANIMAL!!!");
	}
}
class Dog extends Animal
{
	public void Whoiam()
	{
		System.out.println("I am dog@@");
	}
}
class Cat extends Animal
{
	public void Whoiam()
	{
		System.out.println("i am cat$$$");
	}
}
class Snake extends Animal
{
	public void Whoiam()
	{
		System.out.println("I am snake~~~~~");
	}
}
public class RunTime1 {

	public static void main(String[] args) 
	{	
      Animal x1=new Animal();   //compile time binding
      Animal x2=new Dog();      //Run time binding
      Animal x3=new Cat();       //Run time binding
      Animal x4=new Snake();    //Run time binding
        x1.Whoiam();
        x2.Whoiam();
        x3.Whoiam();
        x4.Whoiam();
	}

}
