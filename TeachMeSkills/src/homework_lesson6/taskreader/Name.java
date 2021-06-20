package homework_lesson6.taskreader;

public enum Name {
	NAME1 ("Иванов Иван Иванович"),
	NAME2 ("Сергеев Сергей Сергеевич"),
	NAME3 ("Дмитриев Дмитрий Дмитриевич");
	private String value;
	/*Конструктор*/
	Name(String value){
		this.value = value;
	}
	/*Метод*/
	public String geName() {
		return value;
	}
	
}
