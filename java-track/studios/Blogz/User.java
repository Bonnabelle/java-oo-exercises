package Blogz;
import java.util.regex.Pattern;
import java.util.ArrayList;

public class User extends Entity{
	
	//Fields
	private String username;
	private static String password;
	private static ArrayList<User> users = new ArrayList<>();
	
	
	//Constructor
	public User(String username, String password){
		super();
		this.username = username;
		this.password = password;
		String h = hashPassword(password);
		if(isValidPassword(h) && isValidUsername(username)){
			User.users.add(this);
		}
	}
	
	//Getters
	public static ArrayList<User> getUsers() {
		return User.users;
	}
	
	public String getUsername() {
		return this.username;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	//Methods
	public static String hashPassword(String password) {
		return password;
	}
	
	public boolean isValidPassword(String hash) {
		if(User.hashPassword(User.password).equals(hash)){
			return true;
		} else {
			return false;
		}
	}
	
	public static boolean isValidUsername(String username) {
		String pattern = "[a-zA-Z][a-zA-Z0-9_-]{4,11}";
		 boolean comp = Pattern.matches(pattern,username);
		 return comp;
	}
}
