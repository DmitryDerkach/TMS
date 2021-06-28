package homework_lesson9.task4;

public class TextFormater {
	/*Логика, которую я написал не посмотрев на задачу. Здесь анализируется кол-во букв в слове, и является ли
	слово палиндромом. Мб есть ошибки в логике. Перепроверить на досуге*/
//	public static void getLine(String line) {
//		char [] sup = line.toCharArray();
//			if ((sup.length >= 3) && (sup.length <= 5)){
//				System.out.println("Слово " + line + " удовлетворяет условию");
//			} else {
//					palindromCheck(line);
//					if (palindromCheck(line) == true) {
//						System.out.println("Слово " + line + " является палиндромом");
//					} else {
//						System.out.println("Слово " + line + "  не удовлетворяет условию");
//					}
//			}
//	}
//	private static boolean  palindromCheck(String line) {
//		boolean sup = false;
//		int counter = 0;
//		char [][] suparr = new char [1][];   
//		suparr[0] = line.toCharArray();		
//		int arrint = suparr[0].length;	
//		for(int z = 0; z < arrint; z++) {
//		if (suparr[0][z] != suparr[0][arrint - 1 - z]) {
//			if ((Character.toUpperCase(suparr[0][z]) == suparr[0][arrint - 1 - z]) || (Character.toLowerCase(suparr[0][z]) == suparr[0][arrint - 1 - z])) {
//				counter+=1;
//				if (counter == arrint) {
//					sup = true;
//				}
//			} else {
//				sup = false;
//			}	
//		} else {
//			counter+=1;
//			if (counter == arrint) {
//				sup = true;
//			} 
//		}
//	}
//return sup;	
//}
	public static void getLine(String line) {/*Принимаем наше предложение*/
		int supcounter = 0;
		char [] supparay = line.toCharArray(); /*Переводим предложение в символы*/
		for (int i = 0; i < supparay.length; i++) {/*Идем по массиву символов*/
			if ((supparay[i] == ',') || (supparay[i] == 32)) {/*Так как слова в предложении разделяются запятыми и пробелами
			(и еще херовой тучей всего, что можно оформлять до бесконечности), то каждый пробел или запятая триггерит счетчик, указывающий
			на кол-во слов в этом предложении*/
				supcounter +=1;
			}
		}
		if ((supcounter >= 3) && (supcounter <= 5)){ /*Проверяется условие на кол-во слов в предложении*/
			System.out.println("Предложение [" + line + "] удовлетворяет условию");
	} else {
			palindromCheck(line); /*Если условие выше не выполняется, то мы должны проверить, является ли какое-либо слово в предложении палиндромом*/
			if (palindromCheck(line) == true) {
				System.out.println("Предложение [" + line + "] удовлетворяет условию, т.к. содержит палиндром");
			} else {
				System.out.println("Предложение [" + line + "] не удовлетворяет условию");
			}
		}
	}	
	private static boolean  palindromCheck(String line) {
		boolean sup = false; /*Собсна, наша возвращаемая переменная */
		char [] arrayofsymbols = line.toCharArray(); /*Конвертим в символы*/
		int countern1 = 0;
			for (int i = 0; i < arrayofsymbols.length; i++) {/*Суммарное кол-во запятых и пробелов равно кол-ву слов в предложении. Не забываем
			про точку в конце предложения, т.к. перед точкой тоже стоит слово*/
				if ((arrayofsymbols[i] == ',') || (arrayofsymbols[i] == 32) || (arrayofsymbols[i] == '.')) {
					countern1 += 1;/*Счетчик показывает на кол-во слов в предложении*/
				}
			}		
		/*Создаем массив строк с кол-вом ячеек равным кол-ву слов*/
		String [] arraywithlines = new String [countern1]; /*Создаем массив с кол-вом ячеек раным кол-ву слов в предложении.
		В ячейках будут лежать слова*/
		int supcounter = 0;
		int supcounter2 = 0;
	   /*Копируем логику из Application. Вкратце - при тригере зпятых, пробелов и точки ложим в массив слово*/
		for (int i = 0; i < arrayofsymbols.length; i++) {	
			if ((arrayofsymbols[i] == ',') || (arrayofsymbols[i] == 32) || (arrayofsymbols[i] == '.')) {
					 StringBuilder strb = new StringBuilder();
					 if (supcounter == 0) {
						for (int z = 0; z < i; z++) {
								strb.append(arrayofsymbols[z]);	
						}
				arraywithlines [supcounter]	= strb.toString();	
				supcounter +=1;
				supcounter2 = i;
					} else {
						for (int z = i-1; z > supcounter2; z--) {
							strb.append(arrayofsymbols[z]);	
					}
			supcounter2 = i;			
			strb.reverse();
			arraywithlines [supcounter]	= strb.toString();	
			supcounter +=1;
					}				 
				}		 			 
			}
		/*Создали массив строк, в каждой ячейке которого лежит по слову из предложения*/
		for (int i = 0; i < arraywithlines.length;i++) {
			String [] array = arraywithlines; /*Переводим каждое слово в массив чаров и делаем проверку на палиндромность. Это бомжепроверка - урезанный
		вариант проверки, которую я делал в таске 3	*/
			int counter = 0;
			char [][] suparr = new char [1][];   
			suparr[0] = array[i].toCharArray();		
			int arrint = suparr[0].length;	
			for(int z = 0; z < arrint; z++) {
			if (suparr[0][z] != suparr[0][arrint - 1 - z]) {
				if ((Character.toUpperCase(suparr[0][z]) == suparr[0][arrint - 1 - z]) || (Character.toLowerCase(suparr[0][z]) == suparr[0][arrint - 1 - z])) {
					counter+=1;
					if (counter == arrint) {
						sup = true;
						break;
					}
				} else {
					sup = false;
					break;
				}	
			} else {
				counter+=1;
				if (counter == arrint) {
					sup = true;
					break;
				} 
			}
		}
		
		}	
return sup;		
		}	
}
	
