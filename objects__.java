package objects;

public class O1 {
	int a,b;  
	
	public void input(int x,int y) {
		a=x;
		b=y;
	}
	public void add() {
		System.out.println("Addition is= "+(a+b));
	}
	public void sub() {
		System.out.println("Subtraction is = "+(a-b));
	}
	public static void main(String[] args) {
	O1 x=new O1();
	x.input(12,10);
	x.add();
	x.sub();
    
	}

}
