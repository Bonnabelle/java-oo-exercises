package Robot_V2;
import java.util.Scanner;

public class Pusher extends Robot implements RobotBehavior {
	
	//Only one field needed here
	Scanner input2 = new Scanner(System.in);

	public Pusher(String Name, int Lat, int Lon, int Speed, char Orientation, boolean Pushing, String Behavior, int Health) {
		super(Name, Lat,Lon,Speed,Orientation, Behavior,Health);
		
	}
	
	public void doNextMove(Robot F1, Robot F2) {
		System.out.print("How many bits (latitude) would you like to push " + F2.Name + "?");
		int nLa = input.nextInt();
		
		System.out.print("How many bits (longitude) would you like to push " + F2.Name + "?");
		int nLo = input2.nextInt();
		
		System.out.println(F1.Name + " is now pushing " + F2.Name + "...");
		try {
		Thread.sleep(2000);
		} catch(InterruptedException er) {
			System.out.println("Well looks like your robot is extremely fast.");
		}
		F2.Move(nLa, nLo);
		try {
			Thread.sleep(1000);
		} catch(InterruptedException er) {
			System.out.println("The pusher has abruptly ended his task.");
		}
		
		System.out.println(F1.Name + " stopped pushing " + F2.Name + ".");
		
	}
	
	public void Push(Pusher P, Robot Pushed) {
		while(P.getLat() == 0 || Pushed.getLat() == 0){
		doNextMove(Pushed,P);
		doNextMove(P,Pushed);
		}
		System.out.println("Both robots have pushed each other.");
	}
	
	public static void main(String[] args) {
		Pusher Megabyte = new Pusher("MEGABYTE",0,0,9001,'N',false,"Pusher",100);
		Robot Victim = new Robot("RIP",0,0,1,'S',"Neutral",100);
		Megabyte.Push(Megabyte, Victim);
		Megabyte.Push(Megabyte, Victim);
		

	}

}
