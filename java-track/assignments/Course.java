import java.util.ArrayList;

public class Course {

		//Fields
		String CourseName;
		private int CourseCreds;
		private int SeatsLeft;
		private String[] StudentRoster;
		ArrayList<Double> StudentGPA = new ArrayList<>();
		
		//Constructor
		public Course(String CourseName, int CourseCreds, int SeatsLeft) {
			this.CourseName = CourseName;
			this.CourseCreds = CourseCreds;
			this.SeatsLeft = SeatsLeft;
			this.StudentRoster = new String[SeatsLeft]; //Makes array (list) with the length based on the amount of seats left
		}
		
		public String getName() {
			return this.CourseName;
		}
		
		public int getRemainingSeats() {
			return this.SeatsLeft;
		}
		
		public boolean addStudent(Student S) {
			for(int i = 0; i < StudentRoster.length; i++){
					if(StudentRoster[i] == S.getName()){
						return false;
					} else {
						if(this.SeatsLeft > 0) {
							this.StudentGPA.add(S.getGPA());
							this.StudentRoster[this.StudentRoster.length-this.SeatsLeft] = S.getName();
							this.SeatsLeft = this.SeatsLeft - 1;
							return true;
					}}}
						return false;
			}

		public double averageGPA() {
			double sum = 0.0;
			for(int i = 0; i < StudentGPA.size(); i++){ 
				double SGPA = StudentGPA.get(i); 
				sum += SGPA;
			}
			double summat = sum / StudentGPA.size();
			return summat;
		}

		public String toString() {
			return "Course name: " + this.CourseName + "\n" + "Course credits: " + this.CourseCreds;
			
		}
	
	public static void main(String[] args) {
		Course Heck = new Course("LC 666", 15, 11);
		Student Boop = new Student("Booper", "Dooper", 666666666);
		Heck.addStudent(Boop);
		Heck.averageGPA();
		
		
	}

}
