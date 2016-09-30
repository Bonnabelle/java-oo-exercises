package Fraction;

public class Fraction {

	//Fields 
	private int Numerator;
	private int Denominator;

	
	//Constructor
	public Fraction(int Numerator, int Denominator) {
		this.Numerator = Numerator;
		this.Denominator = Denominator;
	}
	
	public int getNum() {
		return this.Numerator;
	}
	
	public int getDen() {
		return this.Denominator;
	}
	
	public void addFraction(Fraction F1, Fraction F2) {
		int Num = F1.getNum() + F2.getNum();
		int Den = F1.getDen() + F2.getDen();
		System.out.println(Num + "/" + Den);
	}
	
	
	public void multiplyFraction(Fraction F1, Fraction F2) {
		int newNum = F1.getNum() * F2.getNum();
		int newDen = F1.getDen() * F2.getDen();
		if (newNum > newDen) {
			newNum = newNum / newDen;
		} else {
			System.out.println(newNum + "/" + newDen);
		}
		
	}
	
	public void Reciprocate(){
		System.out.println(this.getDen() + "/" + this.getNum());
	}
	
	public void Simplify(Fraction F){
		int largest = F.getDen() - F.getNum();
		String fin = "0";
		for (int i = 1; i <= largest; i++){
			if (F.getNum() % i == 0 && F.getDen() % i == 0){
				fin = (F.getNum() / i) + "/" + (F.getDen() / i);
			}
			
		}
		
		System.out.println(fin);
		
	}

	
	//Displays output
	public static void main(String[] args) {
		Fraction F1 = new Fraction(8,16);
		Fraction F2 = new Fraction(2,3);
		
		F1.addFraction(F1,F2);
		F1.multiplyFraction(F1, F2);
		F1.Reciprocate();
		F2.Reciprocate();
		F1.Simplify(F1);
	}

	//Will add simplify method later. :)
}
