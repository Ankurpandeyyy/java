package QuestionsPractice;

public class SwappingTwoNum 
{
	static void method1(int a, int b)  // using temporary variable
	{
		int temp = a ;
		a = b ;
		b = temp ;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}
	static void method2(int a, int b) // without using temporary variable
	{
		a = a + b ;
		b = a - b ;
		a = a - b ;
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
	}

	public static void main(String[] args)
	{
		int a = 9, b = 3 ;
		System.out.println("VALUES BEFORE SWAPPING");
		System.out.println("a = "+ a);
		System.out.println("b = "+ b);
		
		System.out.println("VALUES AFTER SWAPPING");
		//method1(a,b);
		method2(a,b);
		
	}

}
