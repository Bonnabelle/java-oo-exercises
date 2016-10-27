package first_programs;
import java.util.ArrayList;
import java.util.Scanner;

public class Computer {
	
	//fields
	
	//A computer has a...
	private ArrayList<Computer> computerList;
	
	
	protected int memory;
	protected double size;
	protected double processor;
	protected String brand;
	
	//Behaviors of a computer (What does it do?)
	//These are constructors, as they create an instance of the computer
	
	//Create a computer
	public Computer (int memory, double size, double processor, String brand) {
		this.memory = memory; //Takes original field and sets it to the iput value of this constructor class.
		this.size = size;
		this.processor = processor;
		this.brand = brand;
	}
	
	//These are getter methods
	
	//Get brand name
	public String getBrand() {
		return this.brand;
	}
	
	//Get size
	public double getSize() {
		return this.size;
	}

	
	//Get processor
	public double getProcessor() {
		return this.processor;
	}
	
	//Get memory
	public int getMemory() {
		return this.memory;
	}
	
	//Add memory
	public void addMemory(int newMemory) {
		if (this.memory + newMemory > 8) {
			return;
		} else {
			this.memory = this.memory + newMemory;
		}
	}
		
	//Swap Processor
	public void setProcessor(double newProcessor) {
		this.processor = newProcessor;
	}
	
	//Display computer information
	//This is the "toString()" function which is essential for all Java programs - it writes the output
	public String toString() {
		return "Brand name: " + this.brand + "\n" + "Size: " + this.size + "\n" + "Processor: " + this.processor + "\n" + "Memory:" + this.memory;
	}
	
	//Printing results
	
	public static void main(String[] args) {
		Computer PC = new Computer(8,2.6,13.4,"ASUS");
		System.out.println(PC);
	}

}
