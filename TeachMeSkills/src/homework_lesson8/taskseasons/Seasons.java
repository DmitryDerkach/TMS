package homework_lesson8.taskseasons;

import java.util.Iterator;

public enum Seasons {
	WINTER("Зима - Холодно и идет снег", -30), 
	SPRING("Весна - Природа оживает", +25){
		public String getDescription() {
			return "Теплое время года";
		}
	}, 
	SUMMER("Лето - Ебучий зной", +35){
		public String getDescription() {
			return "Теплое время года";
		}
	}, 
	AUTUMN("Осень - Ебучая грязь", -5);
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
