package homework_lesson11.task1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		BufferedReader bf1 = null;
		FileReader fr1 = null;
		FileWriter fw1 = null;
		try {
			fr1 = new FileReader("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task1\\task1fileN1.txt");/*Поток ввода, то,
			откуда мы читаем*/
			bf1 = new BufferedReader(/*Конструктор принимает инстанс класса Reader,поэтому создадим его*/fr1);
			fw1 = new FileWriter("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task1\\task1fileN2.txt");/*Поток вывода, 
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
			try {
				fr1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				bf1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				fw1.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
