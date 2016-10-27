package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

	private static final Filter ilter = null;


	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath = "";
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				imagePath = (dir + "//" + relPath);
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);

		// TODO - prompt user for filter and validate input
		System.out.println("Welcome to Javagram!");
		System.out.println("Select a filter for your picture.");
		System.out.println("Enter 1 for the Blue filter, enter 2 for the Lava filter, or enter 3 for a Grey filter.");
		int ID = in.nextInt();
		
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back
		do {
		 try {
			getFilter(ID);
		} catch(NullPointerException e) {
			System.out.println("Your ID was invalid. Try again.");
			System.out.println("Error! Invalid filter selection. \nEnter the ID of the filter  your picture again.");
			ID = in.nextInt();
		}}while(ID != 1 && ID != 2 && ID != 3); 
		

		// filter and display image
		Filter filter = getFilter(ID);
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered.");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving.):");
		String fileName = in.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		if(fileName.equals(relPath)){
			System.out.println("Are you sure you want to overwrite the image " + relPath + "? Y/N");
			char answer = in.next().charAt(0);
			if(answer == 'Y' || answer == 'y'){
				String absFileName = dir + File.separator + fileName;
				processed.save(absFileName);
				System.out.println("Image saved to " + absFileName + ".");
				in.close();
			} else if(answer == 'N' || answer == 'n'){
				System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving.):");
				fileName = in.next();
			} else {
				System.out.println("Please enter something valid.");
				System.out.println("Image not saved.");
			}
		} 
		
		if (fileName.equals("exit")) {
			System.out.println("Image not saved");
		} else {
			String absFileName = dir + File.separator + fileName;
			processed.save(absFileName);
			System.out.println("Image saved to " + absFileName);
		}	
		
		// close input scanner
		in.close();
	}
	



	/*private static int displayMenu(Scanner in) {
		System.out.println("Select a filter for your picture. \nEnter 1 for Blue, enter 2 for Red, or enter 3 for Green.");
		int ID = i
		n.nextInt();
		do {
			System.out.println("Error! Invalid filter selection. \nEnter the ID of the filter  your picture again.");
			ID = in.nextInt();
		} while(ID != 1 || ID != 2 || ID != 3);{}
	return ID;
		
	}*/

	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int ID) {
		if(ID == 1){
		return new BlueFilter();
		} else if(ID == 2){
			return new RedFilter();
		} else if(ID == 3){
			return new GreyFilter();
		} else {
			throw new NullPointerException();
		}
	}

}



