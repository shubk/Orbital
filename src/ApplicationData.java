import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class ApplicationData {
	// generated Rectangles and the respective Plat data storing
	ArrayList<Rectangle> generatedRects = new ArrayList<Rectangle>();
	ArrayList<Plat> generatedPlats = new ArrayList<Plat>();

	String gameName = "Game1";
	// Rectangle[] rect=new Rectangle[2];
	//Plat[] diffplats = new Plat[2];

	// Now I will create rectangles which will go on to become Plat (satellite)
	// above the Equator or Earth
	public void createRectangles() {
		inputRect();
		inputPlat();
	}

	private void inputRect() {
		 Rectangle r1Obj1=new Rectangle("Rect1");
		 Rectangle r2Obj2=new Rectangle("Rect2");
		//generatedRects.add(new Rectangle("Rect1"));// genereating two rectangles
		//generatedRects.add(new Rectangle("Rect2"));
		 System.out.println(r1Obj1.toString());
		 System.out.println(r2Obj2.toString());
		 generatedRects.add(r1Obj1);
		 generatedRects.add(r2Obj2);
		// generatedPlats.add(new Plat("Rect3"));
		// generatedPlats.add(new Plat("Rect4"));

		Collections.sort(generatedRects, new Comparator<Rectangle>() {
			@Override
			public int compare(Rectangle rect1, Rectangle rect2) {
				double r1 = rect1.getArea();
				double r2 = rect2.getArea();
				// Descending sort
				if (r2 > r1) {
					return 1;
				} else if (r2 < r1) {
					return -1;
				} else {
					return 0;
				}
			}

		});
   
		for (int i = 0; i < generatedRects.size(); i++) {
			System.out.println(
					"" + generatedRects.get(i).getNameOfRect() + " , Area(Rect) = " + generatedRects.get(i).getArea());
		}
	}

	private void inputPlat() {
		Plat pobj1=new Plat("Rect3");
		Plat pobj2=new Plat("Rect4");
		generatedPlats.add(pobj1);
		generatedPlats.add(pobj2);
		System.out.println(pobj1.toString());
		System.out.println(pobj2.toString());
		Collections.sort(generatedPlats, new Comparator<Plat>() {
			@Override
			public int compare(Plat rect1, Plat rect2) {
				double r1 = rect1.getArea();

				double r2 = rect2.getArea();
				// Descending sort
				if (r2 > r1) {
					return 1;
				} else if (r2 < r1) {
					return -1;
				} else {
					return 0;
				}
			}

		});

		System.out.println("---------------------------");
		for (int i = 0; i < generatedPlats.size(); i++) {
			System.out.println(
					"" + generatedPlats.get(i).getNameOfRect() + " , Area of the Plat  = " + generatedPlats.get(i).getArea());
		}
	}

	public static void main(String[] args) {
		System.out.println("In ApplicationData ");
		ApplicationData d = new ApplicationData();
		d.createRectangles();
	}

	// Now I want to store Serialize, I will store this as Object , Serialization
	// needs Object

	public void dataSerialization() {
		// The bIg Object to store all the objects

		ArrayList<Object> storedata = new ArrayList<Object>();
		//Scanner sc = new Scanner(System.in);
		//System.out.println("By what name do you want to save :");
		//String username = sc.nextLine();
		String username="Mandy";
		storedata.add(username);
		storedata.add(generatedRects);
		storedata.add(generatedPlats);

		// Now serialization of the above ArrayList i.e storedata
		try {
			FileOutputStream fileOutput = new FileOutputStream("fileHW3.ser");
			ObjectOutputStream oos = new ObjectOutputStream(fileOutput);
			oos.writeObject(storedata);
			oos.flush();
			oos.close();
			fileOutput.close();
			System.out.println("-----Successfully stored teh data-----");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      }
	
	// Now we will Deserialize Data
	public void pullData() {
		// I want to make another ArrayList to store the pulled out data
		ArrayList<Object> deserial=new ArrayList<Object>();
		
		FileInputStream fis;
		try {
			fis = new FileInputStream("fileHW3.ser");
			ObjectInputStream ois=new ObjectInputStream(fis);
			deserial=(ArrayList<Object>) ois.readObject();
			ois.close();
			fis.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// Now will print out the stored data I just pulled out by using desirialization
		 String pulledOutName=(String)deserial.get(0);
		
		 Object pulledObj1=(Object)deserial.get(1);
		 Object pulledObj2=(Object)deserial.get(2);
		// Now print to the console
		 System.out.println("------------------------------------");
		 System.out.println("Username :"+pulledOutName);
		 System.out.println("------------------------------------");
		 System.out.println("Rectangle  :"+pulledObj1.toString());
		 System.out.println("------------------------------------");
		
		 System.out.println("Plat  :"+pulledObj2.toString());
		
	 	}
				 		
}
