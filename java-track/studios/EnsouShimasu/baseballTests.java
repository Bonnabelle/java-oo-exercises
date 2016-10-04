package EnsouShimasu;

import static org.junit.Assert.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


import org.junit.Test;

public class baseballTests {
	BaseballPlayer b = new BaseballPlayer("Bleh",5,'A',2,5,1);

	@Test
	public void validSwing() {
		assertTrue("The swing style entered is not a valid style.", b.getStyle() == 'A' || b.getStyle() == 'L' || b.getStyle() == 'R');
	}
	
	@Test
	public void validName() {
		Pattern punc = Pattern.compile("[^A-Za-z0-9]"); //A regular expression that holds a pattern of punctuation
	    Matcher match = punc.matcher(b.getName()); //Matches the punctuation pattern to the name
	    boolean boo = match.find(); //Looks through the pattern and determines whether the matched name has anything in the pattern
		assertTrue("The player's name is invalid- it may not contain spaces, punctuation or numbers.", boo == false); 
	}

	@Test
	public void validGamesPlayed() {
		assertTrue("You can't continue until your player has played at least 2 games.", b.getGames() < 2 == false);
	}
	
}
