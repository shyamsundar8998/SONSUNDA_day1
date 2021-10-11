package Point2D;

public class Point2D {
	     
	     int x,y;
	     
//parameterized constructor
	     
	public Point2D(int X,int Y) {
			y=Y;
			x=X;
			
			}
//method to display
			
			void display()
		    {
		     System.out.println(x+"  "+y);
		    }

			void isEqual()
			{
				if(x==y)
				{
					System.out.println("true");	
				}
				else
				{
					System.out.println("false");
				}
			}
			
			void newPoint()
			{
				x = 6;
				y = 5;
				System.out.println(x+"  "+y);
				
				
			}
	

	public static void main(String[] args) {
		  
//creating of object
		
		Point2D point = new Point2D(11,22);
		
// calling of method
	    
	    point.display();
	    point.isEqual();
	    point.newPoint();
		

	}
	

}
