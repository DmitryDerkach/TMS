package homework_lesson11.task2;
import java.io.FileReader;
import java.io.IOException;

/* Описание (2026): читает текст из файла task2fileN1 посимвольно (FileReader), разбивает его на предложения по знакам '.', '!' и '?' и передаёт каждое предложение в TextFormater.checkIn() для фильтрации и записи в task2fileN2. */
public class Application  {
	public static void main(String[] args) {
			FileReader fr1 = null;
			try { 
			// fix 2026: абсолютный путь C:\repositories\TMS\TeachMeSkills\... заменён на относительный (запускать из папки TeachMeSkills)
			fr1 = new FileReader("src/homework_lesson11/task2/task2fileN1");
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
			// fix 2026: абсолютный путь C:\repositories\TMS\TeachMeSkills\... заменён на относительный (запускать из папки TeachMeSkills)
			fr1 = new FileReader("src/homework_lesson11/task2/task2fileN1");
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
				// fix 2026: проверка на null перед close() - если файл не открылся, раньше здесь падал NullPointerException
				try {
					if (fr1 != null) fr1.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
	}
}	
