package first_programs;

public class Tablet extends Computer {
	
	public Tablet(int memory, double size, double processor, String brand) {
		super(memory, size, processor, brand);
	}

	public void touch(int x, int y) {
		if(x < this.size && y < this.size && x > 0 && y > 0){
			System.out.println("You touched the screen at: " + x + "," + y + ".");
	} else {
		System.out.println("You went out of bounds.");
	}
	}
		
	public static void main(String[] args) {
		Tablet Yo = new Tablet(16,16,10.0,"Apple");			
		Yo.touch(1,5);
		Yo.touch(16, 888);	
	}
}
