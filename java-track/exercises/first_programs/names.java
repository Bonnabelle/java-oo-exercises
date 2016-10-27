package first_programs;
import java.util.Scanner;

public class names {

	public static void main(String[] args) {
		Scanner user_input = new Scanner(System.in);
		String first_name;
		System.out.print("Enter your first name.");
		first_name = user_input.next();
		
		System.out.println("Hi" + " " + first_name + ".");

	}

}
