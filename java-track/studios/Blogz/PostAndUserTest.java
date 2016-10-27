package Blogz;

import static org.junit.Assert.*;
import java.util.Date;

import org.junit.Test;

public class PostAndUserTest {
	
	public Date created;
	
	User t = new User("Test","t123");
	Post p = new Post("blarg","testing",created);

	@Test
	public void testPasswordGet() {
		assertEquals(t.getPassword(),"t123");
	}
	
	@Test 
	public void testUsernameGet() {
		assertEquals(t.getUsername(),"Test");
	}
	
	@Test
	public void testHashingPassword() {
		assertEquals(t.hashPassword("t123"),"t123");
	}
	
	@Test
	public void testValidHash() {
		assertEquals(t.isValidPassword("t123"),true);
	}
	
	@Test
	public void testUserValid() {
		assertEquals(User.isValidUsername(" 1f"),false);
		assertEquals(User.isValidUsername("t1_23"),true);
		assertEquals(User.isValidUsername(" 8 23-_-4"),false);
	}
	
	@Test
	public void testEdit() {
		p.edit("Blloooo", "Blaaaarg");
		assertTrue(p == p.getPost());
	}
}
