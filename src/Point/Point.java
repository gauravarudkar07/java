package Point;

public class Point {
	
	private int x;
	private int y;
	
	public Point() {
		x=10;
		y=20;
	}
	
	public Point(int x,int y) {
		this.x=x;
		this.y=y;
	}
	
	public void displayDetail() {
		System.out.println("Value of X : "+x);
		System.out.println("Value of Y : "+y);
	}
	
	public void setX(int x) {
		this.x=x;
	}
	
	public void setY(int y) {
		this.y=y;
	}
	
	public int getX() {
		return x;
	}
	
	public int getY() {
		return y;
	}

}
