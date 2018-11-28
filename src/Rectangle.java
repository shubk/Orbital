import java.io.Serializable;
/*CSC526 HW3 */
/*This is the Superclass Rectangle, this is extended by the Plat subclass*/
public class Rectangle implements Serializable {

	private double x1, x2, x3, x4, y1, y2, y3, y4;
	private double rangex1 = 30000, minx1 = 1000;
	private double rangey1 = 60000, miny1 = 31000;
	private double rangey2 = 30000, miny2 = 1000;

	private double rangex2 = 60000, minx2 = 31000;

	private double area, perimeter, width, height; 
	private double cgX, cgY; // This is the center or centroid of the Rectangle, this will be taken by the clas Plat
	private String nameOfRect;
	int x;
	Rectangle rectObj;

	// public Rectangle(String nameOfRect) {

	public Rectangle(String nameOfRect) {
		// super();
		// this.rectObj=rectObj;
		x1 = ((rangex1) * Math.random()) + minx1;

		x2 = ((rangex2) * Math.random() + 1000) + minx2;
		y1 = ((rangey1) * Math.random() + 1000) + miny1; // y1 same logic as x2
		y2 = ((rangey2) * Math.random()) + miny2;
		y4 = y1;
		y3 = y2;

		x3 = x1;
		x4 = x2;

		this.nameOfRect = nameOfRect;
		// calculateArea();
		System.out.println("IN rectangle");
		calculateRectangle();
		// width=x2-x1;

		// toString();
	}

	public double getCgX() {
		return cgX;
	}

	public void setCgX(double cgX) {
		this.cgX = cgX;
	}

	public double getCgY() {
		return cgY;
	}

	public void setCgY(double cgY) {
		this.cgY = cgY;
	}

	/*public Rectangle(String nameOfRect, double area, double perimeter, double width, double height, double cgX,
			double cgY) {

		this.area = area;
		this.perimeter = perimeter;
		this.width = width;
		this.height = height;
		this.cgX = cgX;
		this.cgY = cgY;

	}*/

	public void calculateRectangle() {

		// double var=super.getX1();
		// width=getX2()-getX1();
		width =this.x2 - this.x1;
		// height=getY1()-getY3();
		height =this.y1 -this.y3;
		cgY = height / 2;
		cgX = width / 2;
		area = width * height;
		perimeter = width+width+height+height;
		//return area;
	}

	/*
	 * public static void main(String args[]) {
	 * 
	 * 
	 * Rectangle rt=new Rectangle();
	 * 
	 * System.out.println("double return from bstract methid  :"+rt.
	 * calculateRectangle());
	 * 
	 * }
	 */

	public double getArea() {
		//area = calculateRectangle();
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public double getPerimeter() {
		return perimeter;
	}

	public void setPerimeter(double perimeter) {
		this.perimeter = perimeter;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getNameOfRect() {
		return nameOfRect;
	}

	public void setNameOfRect(String nameOfRect) {
		this.nameOfRect = nameOfRect;
	}
	public String toString() {
		return " \n" + "Name of the Rectangle :"+getNameOfRect()+", its Height :"+getHeight()+",Width :"+getWidth()+", Area(rect) :"+
	        getArea()+"sq. miles"+", Perim :"+getPerimeter()+"\n"+"Corners : [x1,y1] :["+x1+","+y1+"]"+"[x2,y2] :["+x2+","+y2+"]"+"[x3,y3] :["+x3+","+y3+"]"+"\n"+"[x4,y4] :["+x4+","+y4+"]";
	}

}
