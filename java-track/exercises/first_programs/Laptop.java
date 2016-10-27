package first_programs;

public class Laptop extends Computer {
	
	private boolean isClosed;
	
	public Laptop(int memory, double size, double processor, String brand, boolean isClosed){
		super(memory, size, processor, brand);
		this.isClosed = isClosed;
		
	}
	
	public boolean close() {
		return this.isClosed = true;
	}

	public boolean open() {
		return this.isClosed = false;
	}
}
