package homework_lesson6.taskreader;

public enum Faculty {
	FACULTY1("Bio"),
	FACULTY2("Phys"),
	FACULTY3("Math");
	private String fac;
	/*Конструктор*/
	Faculty(String fac){
		this.fac = fac;
	}
	/*Метод*/
	public String geFaculty() {
		return fac;
	}
}	
