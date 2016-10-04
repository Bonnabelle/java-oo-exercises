package Rectangle;


class Rectangle {
	
	//Fields
	private int Length;
	private int Height;

	//Constructors
	public Rectangle(int Length, int Height){
		this.Length = Length;
		this.Height = Height;
	}
	
	//Gets measurements, and the test corresponding with this method applies to the getArea and getPerimeter methods.
	public String getMeasurements() {
		return this.Length + "," + this.Height;
	}

	public int getArea() {
		return this.Length * this.Height;
	}
	
	public int getPerimeter() {
		return ((this.Length * 2) + (this.Height * 2));
	}
	
	public boolean isSquare() {
		if ((this.Length * 2) == (this.Height*2)) {
			return true;
		} else {
			return false;
		}
	}
	
	//Creates output
	public String toString() {
		return "You created a rectangle with a length of: " + this.Length + " and a height of: " + this.Height;
	}
	
	//Displays output 
	public static void main(String[] args) {
		Rectangle Rextangle = new Rectangle(3,7);
		System.out.println(Rextangle);
		
		//Method testing
		
		Rextangle.isSquare();
		System.out.println("The perimeter of your rectangle is: " + Rextangle.getPerimeter() + ".");
		System.out.println("The area for your rectangle is: " + Rextangle.getArea() + ".");
		System.out.println(Rextangle.isSquare());

	}

}
