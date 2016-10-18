

public class Student {
	
	//Fields
	
	private String Fname;
	private String Lname;
	private int StudID;
	private int Credits;
	private double GPA;
	
	//Constructor
	
	public Student(String Fname, String Lname, int StudID) {
		this.Fname = Fname;
		this.Lname = Lname;
		this.StudID = StudID;
	}
	
	//Getters
	
	public String getName() {
		return this.Fname + " " + this.Lname;
	}
	
	public int getStudentID() {
		return this.StudID;
	}
	
	public double getGPA() {
		return this.GPA;
	}
	
	public int getCredits() {
		return this.Credits;
	}
	

	public String getClassStanding() {
		if (this.Credits < 30) {
			return "Freshman";
		} else if(this.Credits >=30 && this.Credits < 60) {
			return "Sophomore";
		} else if(this.Credits >= 60 && this.Credits < 90) {
			return "Junior";
		} else {
			return "Senior";
		}
	}
	
	public double submitGrade(double classGrade, int classCreds) {
		double newGPA = (this.GPA * this.Credits) + (classGrade * classCreds); 
		this.Credits = this.Credits + classCreds;
		this.GPA = Math.round(newGPA / this.Credits * 1000.0) / 1000.0;
		return this.GPA; 
	}
	
	public double computeTuition() {
		double tuition = (this.Credits / 15) * 20000;
		double remainder = (this.Credits % 15) * 1333.33;
		return tuition + remainder;
	}
	
	public static Student createLegacy(Student S1, Student S2) {
		int newID = S1.getStudentID() + S2.getStudentID();
		double newGPA = (S1.getGPA() + S2.getGPA()) / 2;
		Student newStud = new Student(S1.getName(),S2.getName(),newID);
		newStud.GPA = newGPA;
		newStud.Credits = Math.max(S1.getCredits(), S2.getCredits());
		return newStud;
	}
	public String toString() {
		return "Name: " + this.Fname + " " + this.Lname + "\nID: " + StudID;
	}

}
