package Robot_V2;

import java.io.ByteArrayInputStream;
import java.util.Scanner;
import static org.junit.Assert.*;

import org.junit.Test;

public class robotTester {
	Robot YODEL = new Robot("YODEL",1,1,9001,'N', "Neutral",100);
	Pusher YODELBULLY = new Pusher("BULLY",1,1,9001,'N',false,"Pusher",100);
	Robot YODELVICTIM = new Robot("RIP",1,16,90,'N',"Neutral",100);

	@Test
	//Tests Movement method
	public void testLat() {
		assertTrue("Hey, you have to move somewhere!", YODEL.getLat() != 0 && YODEL.getLon() != 0);
	}
	
	@Test
	public void testSpeed() {
		assertTrue("Your speed is ovER 9000!!!!!!!!!!!!!!", YODEL.getSpeed() > 9000);
	}
	
	@Test
	public void testIO() {
		String tLo = "5";
		System.setIn(new ByteArrayInputStream(tLo.getBytes()));
		Scanner input = new Scanner(System.in);
		assertEquals(input.nextLine(),"5");
		input.close();
	}

}
