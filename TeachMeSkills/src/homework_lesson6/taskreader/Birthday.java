package homework_lesson6.taskreader;

/* Описание (2026): Перечисление с тремя тестовыми датами рождения для задачи про читателей библиотеки; getBirthday(i) возвращает i-ю дату, чтобы заполнять массив Reader в цикле. */
public enum Birthday {
	BIRTDAY1("01-06-98"),
	BIRTDAY2("01-06-97"),
	BIRTDAY3("01-06-96");
	private String dates;	
	private String s;
	Birthday(String i) {
		dates = i;
	}
	public String getBirtday() {
		return dates;
	}
	public String getBirthday(int loopnumber) {
		switch (loopnumber) {
		case(0):{
			s = Birthday.BIRTDAY1.getBirtday();
			break;
		}
		case(1):{
			s = Birthday.BIRTDAY2.getBirtday();		
			break;
		}
		case(2):{
			s = Birthday.BIRTDAY3.getBirtday();		
			break;
		}
		default:{
			System.out.println("Что-то пошло не так...");
		}
		}
		return s;
}
}
