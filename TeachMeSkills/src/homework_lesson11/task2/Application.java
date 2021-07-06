package homework_lesson11.task2;
import java.io.FileReader;
import java.io.IOException;

public class Application  {
	public static void main(String[] args) {
			FileReader fr1 = null;
			try { 
			fr1 = new FileReader("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task2\\task2fileN1");
			/*Предложения разделяются точкой, восклицательным или вопросительным знаком*/
			int a = 0;/*Вспомогательный счетчик*/
			int counter = 0; /*Счетчик, который крутит длинну массива*/
			String [] arrayofstrings = null; /*Массив, который мы собираемся заполнять*/
			System.out.println("Исходный текст:"); 
				while ((a = fr1.read()) != -1)/*Крутим наш текст*/ {
					System.out.print((char)a);
					if (((char)a == '!') || ((char)a == '?') || ((char)a == '.')) {
						/*Определяем длинну нашего массива строк, в ячейках которого будет хранится строки*/
						counter +=1;
						arrayofstrings = new String [counter];
						/*После того, как мы определились с длинной массива, будем ложить наши строки в ячейки массива*/
					}
				}
				System.out.println();
				System.out.println("====================================");
			/*Заполняем наш массив строк строками до точки*/
			String snew = "";
			a = 0;
			int i = 0;
			fr1.close();
			fr1 = new FileReader("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task2\\task2fileN1");
				try {
					while ((a = fr1.read()) != -1) { 
						if (((char)a != '!') && ((char)a != '?') && ((char)a != '.')) {
						snew = snew.concat(String.valueOf((char)a));
						} else {
						snew = snew.concat(String.valueOf((char)a));
						arrayofstrings[i] = snew;
						i+=1;
						snew = "";
						}
					}
				/*Проверяем наши предложения*/
				for (i = 0; i < arrayofstrings.length; i++) {
					TextFormater.checkIn(arrayofstrings[i]);
				}
				} catch (IOException e) {
					e.printStackTrace();
				}
			
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					fr1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}	
