import java.util.Random;

// Since there is a mixture of unique and generalized methods that the subclass will inherit, 
//I have chosen to make the superclass(Rectangle) as Abstract Class
//public abstract class Rectangle {
public abstract  class AbstRectangle {
	private double x1,x2,x3,x4,y1,y2,y3,y4;
	private double rangex1=30000,minx1=1000;
	private double rangey1=60000,miny1=31000;
	private double rangey2=30000,miny2=1000;
	
	
	private double rangex2=60000,minx2=31000;
	//private double miny2=3900,maxy2=1;
	//private double width,height,cgY,cgX,area;
	//Random rand1=new Random();
	//Random rand=new Random();
	//public AbstRectangle(double x1,double x2,double x3,double x4,double y1,double y2,double y3,doubley4) {
	public AbstRectangle() {
		// (Math.randon()*range)+min<-- this is your starting boundary
		// starting with a rectangle of atleast one mile 
		x1=((rangex1)*Math.random())+minx1;
		
		x2=((rangex2)*Math.random()+1000)+minx2;
		y1=((rangey1)*Math.random()+1000)+miny1; // y1 same logic as x2
		y2=((rangey2)*Math.random())+miny2;
		y4=y1;
		y3=y2;
		
		x3=x1;
		x4=x2;
		
		
			System.out.println("x2 Big  : "+x2+"    y1  Big "+y1);
		
		
		System.out.println("x1 : "+x1+"    y1  :"+y1);
		System.out.println("x4 : "+x4+"     y4 : "+y4);
		System.out.println("x2 : "+x2+"     y2   :"+y2);
		System.out.println("x3 : "+x3+"     y3   :"+y3);
		/*width=x2-x1;
		height=y1-y3;
		cgY=height/2;
		cgX=	width/2;
		area=width*height;
		System.out.println(" width   : "+width +" miles");
		System.out.println(" height  : "+height +" miles");
		System.out.println("Centroid (x,y):  ("+cgX +","+cgY+")");
		System.out.println("Area of Rectangle : "+area+" Square miles ");*/
		
		
	}
	public double getX1() {
		return x1;
	}
	public void setX1(double x1) {
		this.x1 = x1;
	}
	public double getX2() {
		return x2;
	}
	public void setX2(double x2) {
		this.x2 = x2;
	}
	public double getX3() {
		return x3;
	}
	public void setX3(double x3) {
		this.x3 = x3;
	}
	public double getX4() {
		return x4;
	}
	public void setX4(double x4) {
		this.x4 = x4;
	}
	public double getY1() {
		return y1;
	}
	public void setY1(double y1) {
		this.y1 = y1;
	}
	public double getY2() {
		return y2;
	}
	public void setY2(double y2) {
		this.y2 = y2;
	}
	public double getY3() {
		return y3;
	}
	public void setY3(double y3) {
		this.y3 = y3;
	}
	public double getY4() {
		return y4;
	}
	public void setY4(double y4) {
		this.y4 = y4;
	}
	abstract double  calculateRectangle();
	
	
}
