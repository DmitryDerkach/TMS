package homework_lesson7.taskstudent;

/* Описание (2026): Студент: имя, фамилия, группа и средний балл (protected, доступен наследнику); getScholarship() возвращает 100 при среднем балле 5.0, иначе 80. */
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
