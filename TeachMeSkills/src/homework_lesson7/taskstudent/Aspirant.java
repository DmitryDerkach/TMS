package homework_lesson7.taskstudent;
/* Описание (2026): Аспирант - наследник Student с темой научной работы; переопределяет getScholarship(): 200 при среднем балле 5.0, иначе 180. */
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

