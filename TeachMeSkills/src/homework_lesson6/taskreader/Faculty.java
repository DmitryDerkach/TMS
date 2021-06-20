package homework_lesson6.taskreader;

public enum Faculty {
	FACULTY1("Bio"),
	FACULTY2("Phys"),
	FACULTY3("Math");
	private String fac;
	private String s;
	/*Конструктор*/
	Faculty(String fac){
		this.fac = fac;
	}
	/*Метод*/
	public String getFaculty() {
		return fac;
	}
	public String getFaculty(int loopnumber) {
		switch (loopnumber) {
		case(0):{
			s = Faculty.FACULTY1.getFaculty();	
			break;
		}
		case(1):{
			s = Faculty.FACULTY2.getFaculty();		
			break;
		}
		case(2):{
			s = Faculty.FACULTY3.getFaculty();		
			break;
		}
		default:{
			System.out.println("Что-то пошло не так...");
		}
		}
		return s;
	}
}	
