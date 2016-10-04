package Fraction;

import static org.junit.Assert.*;

import org.junit.Test;

public class fractionTests {
	
	Fraction F = new Fraction(5,2);
	Fraction B = new Fraction(0,0);
	Fraction L = new Fraction(77,1);
	Fraction E = new Fraction(22,44);

	@Test
	public void validFraction() {
		assertFalse("You can't have a 0 in your fraction.",F.getDen() == 0 || F.getNum() == 0);
		//assertFalse("You can't have a 0 in your fraction.",B.getDen() == 0 || B.getNum() == 0); Gets true
		//assertFalse("You can't have a 0 in your fraction.",L.getDen() == 0 || L.getNum() == 0); Gets false
	}
	
	@Test
	public void validAdd() {
		assertEquals("Your math is wrong.", F.addFraction(F, B), "5/2");
		assertEquals("Your math is wrong.", L.addFraction(F, E), "132/44");
	}
	
	@Test
	public void validMultiply() {
		assertEquals("Math is wrong.", F.multiplyFraction(L, B), "0/0");
	}
	
	@Test
	public void validSimplify() {
		assertEquals("Your math is wrong.", E.Simplify(E), "1/2");
		
	}
	@Test 
	public void wholeNumber() {
		assertFalse("Your fraction is a whole number!",F.getDen() == 1 || F.getDen() == F.getNum()); 
		//assertFalse("Your fraction is a whole number!",B.getDen() == 1 || B.getDen() == B.getNum()); Gets false
		//assertFalse("Your fraction is a whole number!",L.getDen() == 1 || L.getDen() == L.getNum()); Gets true
	}

	@Test
	public void canReciprocate() {
		assertNotSame("Your fraction cannot be reciprocated.", F.getNum(),F.getDen());
		//assertNotSame("Your fraction cannot be reciprocated.", B.getNum(),B.getDen()); Gets same (true)
		//assertNotSame("Your fraction cannot be reciprocated.", L.getNum(),L.getDen()); Gets false
	}
	
}
