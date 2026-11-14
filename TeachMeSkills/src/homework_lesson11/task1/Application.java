package homework_lesson11.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/* Описание (2026): читает файл task1fileN1.txt построчно (BufferedReader) и записывает в task1fileN2.txt только строки-палиндромы (проверка без учёта регистра через StringBuilder.reverse()). */
public class Application {
	public static void main(String[] args) {
		BufferedReader bf1 = null;
		FileReader fr1 = null;
		FileWriter fw1 = null;
		try {
			// fix 2026: абсолютный путь C:\repositories\TMS\TeachMeSkills\... заменён на относительный (запускать из папки TeachMeSkills)
			fr1 = new FileReader("src/homework_lesson11/task1/task1fileN1.txt");/*Поток ввода, то,
			откуда мы читаем*/
			bf1 = new BufferedReader(/*Конструктор принимает инстанс класса Reader,поэтому создадим его*/fr1);
			// fix 2026: абсолютный путь C:\repositories\TMS\TeachMeSkills\... заменён на относительный (запускать из папки TeachMeSkills)
			fw1 = new FileWriter("src/homework_lesson11/task1/task1fileN2.txt");/*Поток вывода, 
			то, куда мы записываем*/ 
			String s = null; 
			StringBuilder strb1 = new StringBuilder();
				while ((s = bf1.readLine()) != null) {
					/*Пишем проверку на палиндром через стрингбилдер, чтобы не возится с переводом каждого слова в символьное пред-
					 *ставление, с последующим сравниваением каждого символа*/
					strb1.append(s);
						if (strb1.toString().equalsIgnoreCase(strb1.reverse().toString())) {
							fw1.write(s + "\n");
							strb1.delete(0, strb1.length());
						} else {
							strb1.delete(0, strb1.length());
						}
				}
		} catch (Exception e) {
			System.out.println("Something goes wrong...");
		} finally {
			// fix 2026: проверка на null перед close() - если файл не открылся, раньше здесь падал NullPointerException
			try {
				if (fr1 != null) fr1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (bf1 != null) bf1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				if (fw1 != null) fw1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
