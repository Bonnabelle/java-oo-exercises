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

	public void getArea() {
		System.out.println("The area of your rectangle is: " + (this.Length * this.Height));
	}
	
	public void getPerimeter() {
		System.out.println("The perimeter of your rectangle is: " + ((this.Length * 2) + (this.Height * 2)) + ".");
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
		Rextangle.getPerimeter();
		Rextangle.getArea();
		System.out.println(Rextangle.isSquare());

	}

}
