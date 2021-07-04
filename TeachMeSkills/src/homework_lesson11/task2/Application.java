package homework_lesson11.task2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application  {
	public static void main(String[] args) throws FileNotFoundException, IOException {
			FileReader fr1 = new FileReader("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task2\\task2fileN1");
			FileWriter fw1 = new FileWriter("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task2\\task2fileN2");
			/*Предложения разделяются точкой, восклицательным или вопросительным знаком*/
			int a = 0;/*Вспомогательный счетчик*/
			int counter = 0; /*Счетчик, который крутит длинну массива*/
			String [] arrayofstrings = null; /*Массив, который мы собираемся заполнять*/
			try {
				while ((a = fr1.read()) != -1)/*Крутим наш текст*/ {
					fw1.write(a); /*Костыль. Я не знаю, как мне после того, как я прочел все символы, вернуться в начало, поэтому, на
					данном этапе, сразу записываю читаемые символы в новый поток вывода*/
					System.out.print((char)a);
					if (((char)a == '!') || ((char)a == '?') || ((char)a == '.')) {
						/*Определяем длинну нашего массива строк, в ячейках которого будет хранится строки*/
						counter +=1;
						arrayofstrings = new String [counter];
						/*После того, как мы определились с длинной массива, будем ложить наши строки в ячейки массива*/
					}
				}
			} catch (IOException e1) {
				System.out.println("IOE here");
			}
			/*Заполняем наш массив*/
			String s = "";
			a = 0;/*Сбрасываем счетчик на а*/
			fr1 = new FileReader("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task2\\task2fileN2");/*будем читать с 
			массива, в который мы записались*/
			for (int i = 0; i < counter; i++) {
				try {
					while ((a = fr1.read()) != -1) {
						if (((char)a != '!') && ((char)a != '?') && ((char)a != '.')) {
						s = s.concat(String.valueOf((char)a));
						System.out.print(s);
						} else {
						arrayofstrings[i] = s;
						System.out.println(arrayofstrings[i]);
						}
						
					}
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
	}
}	
