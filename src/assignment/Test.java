package assignment;

import static org.junit.jupiter.api.Assertions.*;

class Test {
	
	@org.junit.jupiter.api.Test
	void perimeterTest() {
		Octagon pTest = new Octagon(3.0);
		assertEquals(24, pTest.getPerimeter());
	}
	
	@org.junit.jupiter.api.Test
	void areaTest() {
		Octagon aTest = new Octagon(3.0);
		assertEquals(83.55,aTest.getArea());
	}
}
