package homework_lesson11.task2;

public class TextFormater {
	private static char [][] arrayofchars = null;/*Помещаем сюда, чтобы наш массив был доступен из любого метода*/
	private static int counter = 0;
	
	public static void checkIn(String s) {
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
		arrayofchars = new char[counter+1][]; /*Каунтер это наши слова, но нельзя забывать и про текст*/
		arrayofchars[0] = s.toCharArray();
		if ((counter >=3) && (counter <=5)){
			System.out.println("Предложение: \n" +"<<" + s + ">>" + "\nудовлетворяет основному условию условию");
		} else {
			boolean flag = paliCheck(s);
			if (flag == true) {
				System.out.println("Предложение: \n" +"<<" + s + ">>" + "\nудовлетворяет дополнительному условию условию");
			} else {
				System.out.println("Предложение: \n" +"<<" + s + ">>" + "\nне удовлетворяет ни основному, ни дополнительному условию,"
						+ "поэтому оно не было записано в файл");
			}
		}
	}
	
	public static boolean paliCheck(String s) {
		/*Метод, который будет осуществлять проверку на палиндром*/
		/*Задача №1 - разложить предложения на слова*/
		/*Задача №2 - проверить слова на палиндромность*/
		boolean flag = false;
		int arrayturner = 0;
		//counter = 0;
		char [] suparray = new char[s.toCharArray().length];
		for (int i = 0; i < s.toCharArray().length; i++) {
			suparray[i] = arrayofchars[0][i];	/*Передаем наши символы во вспомогательный массив*/
			//counter +=1;
			if ((arrayofchars[0][i] == ' ') || (arrayofchars[0][i] == ',') || (arrayofchars[0][i] == ':') || (arrayofchars[0][i] == '-')||
			(arrayofchars[0][i] == '.') || (arrayofchars[0][i] == '!') || (arrayofchars[0][i] == '?')) {
			/*Как только триггернули перекладываем все, что успели поназаписывать в основной массив*/
				suparray[i] = ' ';/*Потом тримом уберу.*/
				arrayofchars[arrayturner+=1] = suparray; 
			}
		}
		/*Псоле того, как разложили слова, нужно проверить каждое из них по отдельности на палиндромность*/
		for (int i = 0; i < arrayturner; i++) {
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
