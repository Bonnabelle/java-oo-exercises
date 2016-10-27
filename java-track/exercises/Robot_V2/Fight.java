package Robot_V2;

public class Fight extends AggressiveRobot implements RobotBehavior{
	
	//Fields
	private String[] fightOptions = {"Punch!", "Kick!", "Push!", "Step on toes!"};
	
	
	public Fight(String Name, int Lat, int Lon, int Speed, char Orientation, String Behavior, int Health) {
		super(Name, Lat, Lon, Speed, Orientation, Behavior, Health);
	}

	public void doNextMove(Robot F1, Robot F2) {
		if (F1.Behavior == "Fighter" && F2.Behavior == "Fighter") {
			double i = (int)Math.random() * 5000 + 1;

			System.out.println(F1.Name + " is preparing their attack....");
			try {
				Thread.sleep(2000);
			} catch(InterruptedException er) {}
			F2.Health -= i;
			System.out.println(F1.Name + " attacked " + F2.Name + ". " + F2.Name + "'s health is now " + F2.Health + ".");
			try {
				Thread.sleep(2000);
			} catch(InterruptedException er) {}
		}
	}
	
	public void commenceFight(){
		while(this.Player.getHealth() != 0 && this.Opponent.Health != 0) {
		for(int i = 0; i < fightOptions.length; i++){
			System.out.println("Enter " + i + " for " + fightOptions[i]);
		}
		try {
		int choice = input.nextInt();
		} catch(NumberFormatException er){
			System.out.println("That's not a valid choice! You've been kicked from the fight for not reading carefully.");
			System.exit(0);
		}
		/*if(choice > 3  || choice < 0) {
			System.out.println("That's not a valid option. You've been kicked from the fight for not taking the time to read carefully.");
			System.exit(0);
		}*/ finally {
		doNextMove(this.Player,this.Opponent);
		try {
			Thread.sleep(2000);
			} catch(InterruptedException er) {}
		if(this.Opponent.Health != 0){
			doNextMove(this.Opponent,this.Player);
		}
	}
}
		if(this.Player.Health <= 0) {
			System.out.println(this.Opponent.Name + " has won the fight!");
		} else if(this.Opponent.Health <= 0){
			System.out.println(this.Player.Name + " has won the fight.");
		}
	}
		
	public static void main(String[] args){
		Fight Bonnabot = new Fight("Bonnabot",3,5,25,'N',"Fighter",100);
		Fight Plobbobot = new Fight("Plobbobot",3,15,25,'S',"Fighter",100);
		Bonnabot.choosePlayer(Bonnabot, Plobbobot);
		Bonnabot.commenceFight();
	}
}

