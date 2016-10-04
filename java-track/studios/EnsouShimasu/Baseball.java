package EnsouShimasu;

import java.util.Scanner;


class BaseballPlayer {
	
	private String Name;
	private int Number;
	private char Style;
	private int GamesPlayed;
	private int Hits;
	private int RBI;

	public BaseballPlayer (String Name, int Number, char Style, int GamesPlayed, int Hits, int RBI){
		this.Name = Name;
		this.Number = Number;
		this.Style = Style;
		this.GamesPlayed = GamesPlayed;
		this.Hits = Hits;
		this.RBI = RBI;
	}
	//Getter methods
	
	public char getStyle() {
		return this.Style;
	}
	
	public String getName() {
		return this.Name;
	}
	
	public int getGames() {
		return this.GamesPlayed;
	}
	//This is only useful if someone changes style
	public char getRealStyle(BaseballPlayer P){
		Scanner input = new Scanner(System.in);
		System.out.print("Which way does " + P.Name + " swing? Type R for right, L for left, and A for ambidextrous.");
		char newStyle = input.next().charAt(0);
		return newStyle;
	}
	
	public void Game(int newHits, int newRBI){
		this.GamesPlayed += 1;
		this.Hits = newHits;
		this.RBI = newRBI;
	}

	public String toString() {
		return this.Name + ", Number " + this.Number + ", has now played " + this.GamesPlayed +"games. After that game their RBI is now " + this.RBI;
	}
	public static void main(String[] args) {
		BaseballPlayer Yadi = new BaseballPlayer("Yadier Molina", 4, 'R', 16283, 1580, 698);
		System.out.println(Yadi);
		Yadi.Game(20,700);
		System.out.println(Yadi);
	
	}

}
