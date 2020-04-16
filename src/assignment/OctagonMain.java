package assignment;

//ch9 ex15
//write a class named Octagon whose objects represent regular octagons (eight-sided-polygons). Your class should implement the Shape interface 
//defined in this chapter, including methods for its area and perimeter. An Octagon object is defined by its side length.
//(You may need to search online to find formulas for the area and perimeter of a regular octagon)

public class OctagonMain {
	public static void main(String[] args) {
		Octagon test = new Octagon(5.0);
		System.out.println("Area : " + test.getArea());
		System.out.println("Perimeter : " + test.getPerimeter());

	}

}
