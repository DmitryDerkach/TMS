package homework_lesson7.taskstudent;

public class Student {
	private String firstName;
	private String lastName;
	private int group;
	protected double avMark;
	
		public Student(String firstName, String lastName, int group, double avMark) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.group = group;
		this.avMark = avMark;
	}

		public int getScholarship(){
			if (avMark == 5.0) {
				return 100;
			} else {
				return 80;
			}
		}
}
