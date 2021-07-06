package homework_lesson11.task2;

public class TextFormater {

	public void checkIn(String s) {
		char [] arrayofchars = s.toCharArray(); /*Разбили строку на символы*/
		int counter = 0; /*Счетчик, который будует показывать кол-во слов в нашем предложении*/
		for (int i = 0; i < arrayofchars.length; i++) { /*Идем по нашему массиву*/
			if ((arrayofchars[i] == ' ') || (arrayofchars[i] == ',') || (arrayofchars[i] == ':') || (arrayofchars[i] == '-')||
			(arrayofchars[i] == '.') || (arrayofchars[i] == '!') || (arrayofchars[i] == '?')) {
				counter +=1; /*Триггер любого из этих символов - новое слово*/
			}
		}
		if ((counter >=3) && (counter <=5)){
			System.out.println("Предложение \n" + s + "\n удовлетворяет основному условию условию");
		} else {
			boolean flag = paliCheck(s);
			if (flag == true) {
				System.out.println("Предложение \n" + s + "\n удовлетворяет дополнительному условию условию");
			} else {
				System.out.println("Предложение \n" + s + "\n неудовлетворяет ни основному, ни дополнительному условию условию,"
						+ "поэтому оно не было записано в файл");
			}
		}
	}
	
	public boolean paliCheck(String s) {
		/*Метод, который будет осуществлять проверку на палиндром*/
		/*Задача №1 - разложить предложения на слова*/
		/*Задача №2 - проверить слова на палиндромность*/
		
	}
}
