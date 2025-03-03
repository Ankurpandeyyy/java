package QpatnaUniversity;
import java.util.*;
public class FibbonaciPrimeElementprint {

	public static void main(String[] args) 
	{
		Scanner s = new Scanner(System.in);
		int a=0,b=1,c,i,n,count=0;
		System.out.println("enter range");
		n = s.nextInt();
		
		for(i=1;i<=n;i++)
		{
			c = a+b;
			a = b;
			b = c;
			for(int j=2;j<c;j++)
			{
				if(c % j == 0)
				{
					count++;
					break;
				}
			}
			if(count == 0 )
				System.out.println(c);
			count = 0;
		}

	}

}
