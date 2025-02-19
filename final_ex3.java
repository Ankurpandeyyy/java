package finalkeyword;   
class My
{
	static final int x = 10;  // THIS WILL RUN BEFORE STATIC METHOD
	 static int y = 50;
	//static final int y = 40;
	static
	{
		System.out.println("hello");
	}
}

public class Q3 {

	public static void main(String[] args) 
	{
		//System.out.println(My.x);
		System.out.println(My.y);
		//My a1 = new My();
		
	}

}
