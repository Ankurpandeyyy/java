package QuestionsPractice;

class rectangle{
	  int breadth;
	  int width;  
	  public rectangle(int b,int w) {
		  
		  this.width=w;
		  this.breadth=b;
	  }
	  public int area() {
		    return width*breadth;
		    
	  }
	  public int perimeter() {
		  return(2*(width*breadth));
	  }  
}
public class Q10 {

	public static void main(String[] args) 
	{
		rectangle x = new rectangle(3,4);
		System.out.println("area of rectangle = "+ x.area());
		System.out.println("perimeter of rectangle = "+x.perimeter());
	}
	
}
 
