package Point;

public class TesterPoint {
	
	public static void main(String[] args) {
		
		Point p1=new Point();
		p1.displayDetail();
		
		System.out.println("***************************");
		
		Point p2=new Point(15,20);
		p2.displayDetail();
		
		System.out.println("***************************");
		
		Point p3=new Point();
		p3.setX(35);
		p3.setY(45);
		System.out.println("Value of X : "+p3.getX());
		System.out.println("Value of Y : "+p3.getY());
	}

}
