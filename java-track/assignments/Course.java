import java.util.ArrayList;


public class Course {

		//Fields
		String CourseName;
		private int CourseCreds;
		private int SeatsLeft;
		private static ArrayList<Course> Courses = new ArrayList<>();
		private String[] StudentRoster;
		ArrayList<Double> StudentGPA = new ArrayList<>();
		
		//For testing
		private boolean placeEquals = false;
		
		//Constructor
		public Course(String CourseName, int CourseCreds, int SeatsLeft) {
			Course.Courses.add(this);
			this.CourseName = CourseName;
			this.CourseCreds = CourseCreds;
			this.SeatsLeft = SeatsLeft;
			this.StudentRoster = new String[SeatsLeft]; //Makes array (list) with the length based on the amount of seats left
		}
		
		public ArrayList<Course> getAllCourses() {
			return this.Courses;
		}
		public String getName() {
			return this.CourseName;
		}
		
		public int getRemainingSeats() {
			return this.SeatsLeft;
		}
		
		public boolean getStudentPlace() {
			return this.placeEquals;
		}
		
		public boolean addStudent(Student S) {
			for(int i = 0; i < StudentRoster.length; i++){
					if(StudentRoster[i] == S.getName()){
						return false;
					} else {
						if(this.SeatsLeft > 0) {
							this.StudentGPA.add(S.getGPA());
							this.StudentRoster[this.StudentRoster.length-this.SeatsLeft] = S.getName();
							if(this.StudentRoster[this.StudentRoster.length-this.SeatsLeft].equals(S.getName())){
								this.placeEquals = true;
							}
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
		
		//public static void main(String[] args){
		//Course b = new Course("Blarg",1000,50);
		//}
}

