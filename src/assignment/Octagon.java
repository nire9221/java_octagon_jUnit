package assignment;

public class Octagon implements Shape{
	
	private double side = 1.0;
	
	public Octagon(double side) {
		this.side = side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}  
	     
	public double getSide(double side) {
	    return side;
	}
	
	public double getArea() {
		return (2 + (4 / (Math.sqrt(2))) * side * side);
	}
	
	public double getPerimeter() {
	    return side * 8;
	}
	
	public String toString() {
		return "The length of each side is: " + side;
	}      
}

