package homework_lesson11.task2;

import java.io.FileWriter;
import java.io.IOException;

public class TextFormater {
	private static char [][] arrayofchars = null;/*Помещаем сюда, чтобы наш массив был доступен из любого метода*/
	private static int counter = 0;
	
	public static void checkIn(String s){
		FileWriter fw1 = null;
	try {
		fw1= new FileWriter("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task2\\task2fileN2");
		arrayofchars = new char[1][s.toCharArray().length]; /*Наш двумерный массив, в 0 строку которого
		нужно передать целый текст,разложенный в символы*/
		arrayofchars[0] = s.toCharArray();
		/*
		 * Разбиваем строку на символы и создаем двумерный массив. В 0 строке у нас
		 * будет лежать весь наш текст, разбитый на символы, а в ячейках, начиная с 1 -
		 * наши символы слов. Т.е. первой строке - набор символов из первого слова, во
		 * второй строке из второго и т.д.
		 */
		counter = 0; /*Счетчик, который будует показывать кол-во слов в нашем предложении*/
		for (int i = 0; i < s.toCharArray().length; i++) { /*Идем по нашему массиву*/
			if ((arrayofchars[0][i] == ' ') || (arrayofchars[0][i] == ',') || (arrayofchars[0][i] == ':') || (arrayofchars[0][i] == '-')||
			(arrayofchars[0][i] == '.') || (arrayofchars[0][i] == '!') || (arrayofchars[0][i] == '?')) {
				counter +=1; /*Триггер любого из этих символов - новое слово*/
			}
		}
		/*Обновим наш двумерный массив, т.к. теперь мы знаем, сколько же слов он у нас будет содержать*/
		arrayofchars = new char[counter+1][100]; /*100 - магическое число. Если массив будет заполнен null-ами в дальнейшем будет нево-
		зможно с ним рабоатать. Мб стоит переделать, как осовою коллекции*/
		arrayofchars[0] = s.toCharArray();
		for (int  i = 1; i < counter+1; i++) {
			for (int j = 0; j < 100; j++) {
				arrayofchars[i][j] = ' ';
			}
			
		}
		if ((counter >=3) && (counter <=5)){
			System.out.println("Предложение: \n" +"<<" + s + ">>" + "\nудовлетворяет основному условию условию");
			fw1.write(s + "\n");
		} else {
			boolean flag = paliCheck(s);
			if (flag == true) {
				System.out.println("Предложение: \n" +"<<" + s + ">>" + "\nудовлетворяет дополнительному условию");
				fw1.write(s + "\n");
			} else {
				System.out.println("Предложение: \n" +"<<" + s + ">>" + "\nне удовлетворяет ни основному, ни дополнительному условию,"
						+ "поэтому оно не было записано в файл");
			}
		}
	} catch (Exception e){
		e.printStackTrace();
		System.out.println("Проблема с записью в файл #1");
	} finally {
		try {
			fw1.close();
		} catch (IOException e) {
			System.out.println("Проблема с записью в файл #2");
		}
	}
	} 
	public static boolean paliCheck(String s) {
		/*Метод, который будет осуществлять проверку на палиндром*/
		/*Задача №1 - разложить предложения на слова*/
		/*Задача №2 - проверить слова на палиндромность*/
		boolean flag = false;
		int arrayturner = 1;
		int supcounter = 0;
		for (int i = 0; i < s.length(); i++) {
			arrayofchars[arrayturner][i] = s.charAt(i);
			if ((arrayofchars[0][i] == ' ') || (arrayofchars[0][i] == ',') || (arrayofchars[0][i] == ':') || (arrayofchars[0][i] == '-')||
				(arrayofchars[0][i] == '.') || (arrayofchars[0][i] == '!') || (arrayofchars[0][i] == '?')) {
				arrayofchars[arrayturner][i] = ' ';
				arrayturner+=1;
				if (arrayturner > counter) {
					arrayturner-=1;
					break;
				}
			}
		}
		/*После того, как разложили слова, нужно проверить каждое из них по отдельности на палиндромность*/
		/*Но! Местоимения и союзы не являются палиндромами, их выкидываем*/
		for (int i = 0; i < arrayturner; i++) {
			for ( int z = 0; z < 100; z++) {
				if (arrayofchars[i][z] != ' ') { /*Почему выбивает java.lang.ArrayIndexOutOfBoundsException*/
					supcounter += 1;
				} else {
					continue;
				}
			}
			if (supcounter <= 4) {
				continue;
			}
			String line = String.valueOf(arrayofchars[i+1]);
			String linefinal = line.trim();
			StringBuilder sb1 = new StringBuilder(linefinal);
			if (linefinal.equalsIgnoreCase(sb1.reverse().toString())) {
				flag = true;
			}
		}
		return flag;
	}
}
