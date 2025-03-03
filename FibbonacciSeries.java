package QpatnaUniversity;
import java.util.*;
public class FibbonacciSeries {

	public static void main(String[] args)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter range for printing numbers......");
		int n = s.nextInt();
		int a=0,b=1,sum=0;
		System.out.println(a);
		System.out.println(b);
		for(int i = 0; i<=n; i++)
		{
			sum = a + b;
			System.out.println(sum);
			a = b;
			b = sum;
		}

	}

}
