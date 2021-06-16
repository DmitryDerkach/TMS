package homework_lesson9.task3;
/*В исходном файле находятся слова, каждое слово на новой строке. После запуска программы, вывести в консоль только палиндромы*/
public class Application {
	public static void main(String[] args) {
		String test = "шалаш";
		String test1 = "топот";
		String test2= "джававанлов";
		String [] arr = {test,test1,test2}; /*Создали массив строк*/
		int counter = 0; /*Вспомогательный счетчик*/
		
		System.out.println("Полный список слов: "); /*Выводим слова в консоль*/
			for (int i = 0; i < arr.length; i++) {
				System.out.println("Слово под номером " + i + " : " + arr[i]);
			}
			
			char [][] suparr = new char [arr.length][]; /*Создаем двумерный чар-массив в котором будут лежать разложенные в символы строки*/
				for (int i = 0; i < arr.length; i++) {	  
					suparr[i] = arr[i].toCharArray();
				}
			int [] arrint = new int[3];	/*Создаем массив, который поможет нам определить длинну каждой из чар-строк*/
				for (int i = 0; i < arr.length; i++) {
					 arrint[i] = suparr[i].length; /*Нашли длинну строки и передаем это интовое значение в наш массив */
				}
				
					for(int i = 0; i < arr.length; i++) { /*Выполним проверку каждой строки посимвольно, сравнивая первый и последний символ каждой 
					строки */ /*Первый цикл - крутим строки*/
						for(int z = 0; z < arrint[i]; z++) {/*Второй цикл - крутим столбцы в двумерном массиве, т.е. сравниваем символы в рамках одной 
					строки*/
						if (suparr[i][z] != suparr[i][arrint[i] - 1 - z]) {
							System.out.println("	Слово под номером " + i + " не является палиндромом (" + arr[i] + ")");
							break;
						} else {
							counter+=1;
								if (counter == arrint[i]) {
									System.out.println("	Слово под номером " + i + " является палиндромом (" + arr[i] + ")");
									counter = 0;
								}
								
						}
					}		
				}
					
	}
}
