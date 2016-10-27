package Robot_V2;

public class AggressiveRobot extends Robot{
	
	//Fields
	protected int Health;
	protected AggressiveRobot Player;
	protected AggressiveRobot Opponent;
	
	//Constructor
	public AggressiveRobot(String Name, int Lat, int Lon, int Speed, char Orientation, String Behavior, int Health) {
		super(Name, Lat,Lon,Speed,Orientation,Behavior,Health);
		this.Health = Health;
	}
	
	public int getHealth() {
		return this.Health;
	}
	
	public void choosePlayer(AggressiveRobot R1,AggressiveRobot R2) {
		if(R1.getHealth() != 0 && R2.getHealth() != 0){
			char P1 = R1.Name.charAt(0);
			char P2 = R2.Name.charAt(0);
			System.out.println(R1.Name + " and " + R2.Name + " will FIGHT TO THE DEATH!");
			System.out.println("Choose your Robot! Enter " + P1 + " for " + R1.Name + ", or " + P2 + " for " + R2.Name + "!");
			char choice = input.next().charAt(0);
			if(choice == P1) {
				System.out.println("You have chosen " + R1.Name + "!");
				this.Player = R1;
				this.Opponent = R2;
			} else if(choice == P2) {
				System.out.println("You have chosen " + R2.Name + "!");
				this.Player = R2;
				this.Opponent = R1;
			} else {
				System.out.println("I'm sorry, that Robot does not exist.");
				System.exit(0);
			}
		} else {
			System.out.println("One or more of your robots are dead, and cannot be chosen to fight with. Try again!");
		}
	}
	
		
	public static void main(String[] args) {
		AggressiveRobot Bonnabot = new AggressiveRobot("Bonnabot",3,5,25,'N',"Fighter",100);
		AggressiveRobot Plobbobot = new AggressiveRobot("Plobbobot",3,15,25,'S',"Fighter",100);
		Bonnabot.choosePlayer(Bonnabot, Plobbobot);
	}

}
