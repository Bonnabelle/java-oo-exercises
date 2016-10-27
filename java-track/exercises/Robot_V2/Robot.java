package Robot_V2;
import java.util.Scanner;


class Robot{
	
	//Fields
	
	Scanner input = new Scanner(System.in);
	String Name;
	private int Lat;
	private int Lon;
    private int Speed;
	private char Orientation; // N S E W
	private String[] bList = {"Neutral","Pusher","Fighter"};
	protected String Behavior;
	protected int Health;

	
	//Robot Builder (Constructor class)
	public Robot(String Name, int Lat, int Lon, int Speed, char Orientation,String Behavior, int Health) {
		this.Name = Name;
		this.Lat = Lat;
		this.Lon = Lon;
		this.Speed = Speed;
		this.Orientation = Orientation;
		this.Behavior = Behavior;
		this.Health = Health;
	}
	
	//Sets type of behavior
	public void setBehavior(){
		System.out.println("Choose your robot's behavior type.");
		System.out.println("Enter N for Neutral, P for Pusher, and F for Fighter.");
		System.out.println("[ . = . ]");
		for(int i = 0; i< bList.length; i++){
			System.out.println(bList[i]);
		}
		char choice = input.next().charAt(0);
		if(choice == 'N') {
			this.Behavior = "Neutral";
		} else if(choice == 'P') {
			this.Behavior = "Pusher";
		} else if(choice == 'F') {				
			this.Behavior = "Fighter";
		} else {
			System.out.println("That's not a valid choice. Try again!");
		}	
	}
	
	//Moves Robot [ . = . ]
	public void Move(int newLat,int newLon) {
		this.Lat = newLat;
		this.Lon = newLon;
		System.out.println(this.Name + " moved to " + this.Lat + ", " + this.Lon + ".");
	}
	
	//Getters for position
	public int getLat() {
		return this.Lat;
	}
	
	public int getLon() {
		return this.Lon;
	}
	
	//Changes Speed of Robot
	public void changeSpeed(int newSpeed) {
		this.Speed = newSpeed;
		System.out.println(this.Name + " sped up to: " + this.Speed + " MPH!");
	}
	
	//Getter for speed
	public int getSpeed() {
		return this.Speed;
	}
	
	//Changes orientation with user input :)
	public void changeOrientation() {
		System.out.print("Which direction should " + this.Name + " go? Type N,S,E or W.");
		char newOrientation = input.next().charAt(0);
		if (newOrientation == 'N' || newOrientation == 'S' || newOrientation == 'E' || newOrientation == 'W') {
			this.Orientation = newOrientation;
			System.out.println(this.Name + " is now facing " + newOrientation + ".");
		} else {
			System.out.println("I told you what to type, you know :I");
			
		}
	}
	
		//Make an output
		public String toString() { 
			return "Name: " + this.Name + "\n" + 
		    "Current position: " + this.Lat + ", " + this.Lon + "\n" +
			"Facing " + this.Orientation;
					
		}
		
		
		//Display output
		public static void main(String[] args) {
			Robot Bonnabot = new Robot("Bonnabot",3,5,25,'N',"Neutral",100);
			System.out.println(Bonnabot);
			
			//Testing methods
			
			Bonnabot.changeOrientation();
			Bonnabot.Move(5, 9);
			Bonnabot.changeSpeed(50);
		}
		

	}

