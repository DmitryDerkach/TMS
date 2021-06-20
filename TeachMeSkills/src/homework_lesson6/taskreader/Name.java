package homework_lesson6.taskreader;

public enum Name {
	NAME1 ("Иванов Иван Иванович"),
	NAME2 ("Сергеев Сергей Сергеевич"),
	NAME3 ("Дмитриев Дмитрий Дмитриевич");
	private String enumvalue;
	private String s;
	/*Конструктор*/
	Name(String value){
		this.enumvalue = value;
	}
	/*Метод*/
	public String getNameSupp() {
		return enumvalue;
	}
	public String getName(int loopnumber) {
		switch (loopnumber) {
		case(0):{
			s = Name.NAME1.getNameSupp();	
			break;
		}
		case(1):{
			s = Name.NAME2.getNameSupp();	
			break;
		}
		case(2):{
			s = Name.NAME3.getNameSupp();	
			break;
		}
		default:{
			System.out.println("Что-то пошло не так...");
		}
		}
		return s;
	}
	
	
	
	
	
	
}
