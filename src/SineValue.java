import java.util.Random;

public class SineValue {

	public static void main(String[] args) {
		double x,y,z, rho,r,ratio;
		Random rand=new Random();
		
		x=rand.nextInt(41000)+40000;
		y=rand.nextInt(41000)+40000;
		z=rand.nextInt(41000)+40000;
		
		rho=Math.sqrt(x*x+y*y+z*z);
		r=3600d;
		ratio=z/rho;
		// the cosine takes value sin radians and hence multiplied by Math.PI
		System.out.println("Degrees  :"+Math.acos(Math.sqrt(3)/2)*(180/Math.PI));
		System.out.println("radians  :"+Math.acos(Math.sqrt(3)/2));
		System.out.println("Co-ordinate x : "+x+"  miles");
		System.out.println("Co-ordinate y : "+y+"  miles");
		System.out.println("Co-ordinate z : "+z+"  miles");

		System.out.println(" Rho          : "+rho+"  miles");
		System.out.println(" Distance between Earth and the satellite  :  "+(rho-r)+"  miles");
		System.out.println("Phi is the angle of the satellite with the center of the earth :"+Math.acos(ratio)*180/Math.PI+"  deg");
	}

}
