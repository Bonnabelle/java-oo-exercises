package Rectangle;

import static org.junit.Assert.*;

import org.junit.Test;

public class rectangleTests {
	Rectangle Rextangle = new Rectangle(3,1);
	Rectangle Facade = new Rectangle(4,4);

	@Test
	public void isPoly() {
		assertFalse("Considering you have a zero as one of your measurements, it looks like you have a straight line, not a polygon.", Rextangle.getMeasurements().contains("0"));
	}
	
	public void isRectangle() { //Tells if square or not 
		assertFalse("Looks like your 'rectangle' is actually a square.", Rextangle.isSquare() == true);
		//assertFalse("Looks like your 'rectangle' is actually a square.", Facade.isSquare() == true); Gets true
	}
	
	@Test
	public void areaValid() {
		assertTrue("Your math is wrong for area.", Rextangle.getArea() == 3);
	}
	
	@Test
	public void perimeterValid() {
		assertEquals("Your formula for perimeter is wrong.", Facade.getPerimeter(), 16);
	}
	
	@Test
	public void measureValid() {
		assertEquals("Your measurements are returning something else other than the true measurements.", Facade.getMeasurements(), "4,4");
	}

}
