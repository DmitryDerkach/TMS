package homework_lesson2;
//Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить, сколько амеб будет через 3,6,9,12,...,24 часа.
public class Task2 {
	public static void main(String[] args) {

		int hour;
		int newlife = 1;
		for (hour=3; hour<25; hour=hour+3) {
			
			newlife = newlife * 2;
			
			//System.out.printf("Через %1$d часа кол-во амеб составляет %2$d  \n" ,hour, newlife);
		}
		System.out.printf("Cуммарное кол-во амеб составляет %1$d", newlife);
	}
}
