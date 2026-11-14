package homework_lesson8.taskseasons;

import java.util.Iterator;

/* Описание (2026): Перечисление времён года с текстовым описанием и средней температурой (поля и конструктор enum). Для SPRING и SUMMER getDescription() переопределён в теле константы ("Теплое время года"), статический iLove() через switch выводит, какое время года любишь. */
public enum Seasons {
	WINTER("Зима - Холодно и идет снег", -30), 
	SPRING("Весна - Природа оживает", +25){
		public String getDescription() {
			return "Теплое время года";
		}
	}, 
	// fix 2026: нецензурные слова в описаниях лета и осени заменены на нейтральные
	SUMMER("Лето - Изнуряющий зной", +35){
		public String getDescription() {
			return "Теплое время года";
		}
	}, 
	AUTUMN("Осень - Слякоть и грязь", -5);
	private String forinformation; 
	private int temp;
	Seasons(String string, int temp) {
		forinformation = string;
		this.temp = temp;
	}
public void getInfo() {
	System.out.println(forinformation + ". Средняя температура: " + temp);
}
public static void iLove (Seasons s) {
			switch (s) {
			case WINTER:{
				System.out.println("Я люблю зиму");
				break;
			}
			case SPRING:{
				System.out.println("Я люблю весну");
				break;
			}
			case SUMMER:{
				System.out.println("Я люблю лето");
				break;	
			}
			case AUTUMN:{
				System.out.println("Я люблю осень");
				break;
			}
		}
	}
public String getDescription() {
	return "Холодное время года";
}
}
