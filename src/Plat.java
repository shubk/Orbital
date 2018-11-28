import java.io.Serializable;
/*CSC526 HW3 */
/* This is the Rectangular Plat(or Plate :) ) which hangs out in the space
above the equator like a geo-stationary or non-geostartinary satellite(my interpretation for convenience) */

public class Plat extends Rectangle implements Serializable {
	// Since x,y (center of the Plat) is already generated and calculated in
	// super class
	// here we will generate the third element z value
	
	private double xPlate, yPlate, zPlate; // x,y,z co-ordinates in 3-D
	private double rho; // Distance of the Plat from the center of the Earth
	private double distEarthToPlat;
	private double radiusOfEarth = 3600d;
	private double rangex2 = 40000;
	private double minx2 = 1000;
	private double ratio;
	private double phi; // Given the three co-ordinates, calc the angle phi. This is the angle between
	// the Plate(satellite)and the center of the earth

	private double rangeX = 20000, minx = 10000;
	// ((rangex1)*Math.random())+minx1
	Rectangle rg;

	public Plat(String rname) {
		super(rname);
		
		xPlate = getCgX() + ((rangex2) * Math.random()) + minx; // The randomly generated distance form the center of the Earth is 
		                                                        //added to the center or centroid of the Plat(from Rectangle class)
		yPlate = getCgY() + ((rangex2) * Math.random()) + minx;// Same as above
		zPlate = ((rangex2) * Math.random() + 1000) + minx2;
		rho = Math.sqrt(xPlate * xPlate + yPlate * yPlate + zPlate * zPlate); // This is the distance between the center of the Earth and the Plat
		distEarthToPlat=rho-radiusOfEarth; // Distance from the surface of teh Earth to the center of the Plat (the satellite)
		ratio = zPlate / rho; // This ratio is needed to take inverse of the cosine angle to calculate satellite
							//makes the angle with the center of the Earth
		phi = Math.acos(ratio) * 180 / Math.PI;  //Angle with the center of the Earth in degrees 
	}

	public double getxPlate() {
		return xPlate;
	}

	public void setxPlate(double xPlate) {
		this.xPlate = xPlate;
	}

	public double getyPlate() {
		return yPlate;
	}

	public void setyPlate(double yPlate) {
		this.yPlate = yPlate;
	}

	public double getzPlate() {
		return zPlate;
	}

	public void setzPlate(double zPlate) {
		this.zPlate = zPlate;
	}

	public double getRadiusOfEarth() {
		return radiusOfEarth;
	}

	public void setRadiusOfEarth(double radiusOfEarth) {
		this.radiusOfEarth = radiusOfEarth;
	}

	public double getPhi() {
		return phi;
	}

	public void setPhi(double phi) {
		this.phi = phi;
	}

	public double getRho() {

		return rho;
	}

	public void setRho(double rho) {
		this.rho = rho;
	}

	public String toString() {
		return " \n" + " Plat : [x,y,z] : [ " + xPlate + ", " + yPlate +"," + ", " + zPlate + "]" + "\n"+"  Rho :" + rho + ", Radius of Earth:" + radiusOfEarth + ", Dist of Plat from earth surface : "
				+ distEarthToPlat +"miles"+ "\n"+" Angle made by Plate with the center of earth : " + phi +" deg";
		// + "// +" ")"+" "+Option2+" "+Option3);
	}


}
