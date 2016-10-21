package javagram;

import javagram.filters.*;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class Javagram {

	public static void main(String[] args) {

		// Create the base path for images		
		String[] baseParts = {System.getProperty("user.dir"), "images"};
		String dir = String.join(File.separator, baseParts);
		String relPath;
		Picture picture = null;
		Scanner in = new Scanner(System.in);
		
		// prompt user for image to filter and validate input
		do {
			
			String imagePath = "path not set";
			
			// try to open the file
			try {
				
				System.out.println("Image path (relative to " + dir + "):");
				relPath = in.next();
				
				//String[] relPathParts = relPath.split(File.separator);
				//imagePath = dir + File.separator + String.join(File.separator, Arrays.asList(relPathParts));
				
				imagePath = (dir + "//" + relPath);
				
				picture = new Picture(imagePath);
				
			} catch (RuntimeException e) {
				System.out.println("Could not open image: " + imagePath);
			}
			
		} while(picture == null);

		// TODO - prompt user for filter and validate input
		System.out.println("Enter the ID of the filter for your picture.");
		int ID = in.nextInt();
	
		// TODO - pass filter ID int to getFilter, and get an instance of Filter back
		try {
		} catch(Exception e){
			System.out.println("Your ID was invalid. Try again.");
			do {
				System.out.println("Enter the ID of the filter of your picture.");
				ID = in.nextInt();
			} while(ID != 1 || ID != 2 || ID != 3);{}
		} finally {
		

		// filter and display image
		Filter filter = getFilter(ID);
		Picture processed = filter.process(picture);
		processed.show();
		
		System.out.println("Image successfully filtered");
		
		// save image, if desired
		
		System.out.println("Save image to (relative to " + dir + ") (type 'exit' to quit w/o saving):");
		String fileName = in.next();
		
		// TODO - if the user enters the same file name as the input file, confirm that they want to overwrite the original
		
		if(fileName == dir){
			System.out.println("Are you sure you want to overwrite the image in " + dir + "? Y/N");
			char answer = in.next().charAt(0);
			if(answer == 'Y' || answer == 'y'){
				//Save image to same directory
			} else {
				picture = null;
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
	}
	
	// TODO - refactor this method to accept an int parameter, and return an instance of the Filter interface
	// TODO - refactor this method to thrown an exception if the int doesn't correspond to a filter
	private static Filter getFilter(int ID) {
		if(ID == 1){
		return new BlueFilter();
		} else if(ID == 2){
			return new RedFilter();
		} else if(ID == 3){
			return new GreenFilter();
		} else {
			return null;
		}
	}
		
		
	
	
	private static int displayMenu(Scanner in) {
		int choice = in.nextInt();
		do {
			System.out.println("Select a filter for your picture!");
			System.out.println("Enter 1 for Blue.");
			System.out.println("Enter 2 for Red.");
			System.out.println("Enter 3 for Green.");
			System.out.println("Enter exit to quit.");
		} while(choice < 4 && choice > 0);{}
	return choice;
	}
}


