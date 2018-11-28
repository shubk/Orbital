import java.util.Comparator;

public class RectComparator implements Comparator<Rectangle> {

	@Override
	public int compare(Rectangle rect1, Rectangle rect2) {
		double r1=rect1.getArea();
		double r2=rect2.getArea();
		// Descending sort 
		if(r2>r1) {
			return 1;
		}else if(r2<r1) {
			return -1;
		}else {
			return 0;
		}
	}
	
}


