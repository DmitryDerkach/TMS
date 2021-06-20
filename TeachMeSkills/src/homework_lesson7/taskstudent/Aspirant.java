package homework_lesson7.taskstudent;
public class Aspirant extends Student {
	private String scienceWork;
	
		public Aspirant(String firstName, String lastName, int group, double avMark, String scienceWork) {
		super(firstName, lastName, group, avMark);
		this.scienceWork = scienceWork;
	}
		@Override
		public int getScholarship(){
			if (super.avMark == 5.0) {
				return 200;
			} else {
				return 180;
			}
	}
}   

