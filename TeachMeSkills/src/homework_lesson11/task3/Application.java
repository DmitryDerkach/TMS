package homework_lesson11.task3;

import java.io.FileReader;
import java.io.IOException;

public class Application {
	public static void main(String[] args) {
		FileReader fr1 = null;
		FileReader fr2 = null;
		try {
			fr2 = new FileReader("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task3\\blacklist");/*Читем запрещенку*/
			int a = 0;/*счетчик№1*/
			int z = 0;/*счетчик№2*/
			int[] array = new int [10]; /*Массив, в ячейках которого будет лежать "код" запрещенки*/
			int arraycounter = 0;
			while ((a = fr2.read()) != -1) {
			if (((char)a == ',') || (char)a == '.') {
				array[arraycounter] = z;
				arraycounter +=1;
				z = 0;
			} else {
				z +=a; /*Получили уникальный "код" запрещенки*/		
			}
			}
			arraycounter = arraycounter-1;
			/*Теперь надо прочесть наш текст на наличие запрещенки*/
			fr1 = new FileReader("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task3\\text.txt"); 
			a = 0;
			z = 0;
			int triggernum = 0;
			String s = "";
			while ((a = fr1.read()) != -1) {
				if (((char)a == ',') || (char)a == '-' || (char)a == ' ' || (char)a == '.'){
					for (int i = 0; i <= arraycounter; i++) {
						if (array[i] == z) {
							triggernum = 1;
							z = 0;
						} else {
							continue;
						}
						
					}
					z = 0;
					s = s.concat(String.valueOf((char)a));
				} else {
					s = s.concat(String.valueOf((char)a));
					z +=a;
				}
				if ((char)a == '.') {
					System.out.println("Проверка предложения: \n" + "<<" + s + ">>");
					if (triggernum == 1) {
						System.out.println("Преложение не прошло цензуру!");
						triggernum = 0;
						s = "";
					} else {
						System.out.println("Предложение  не содержит запретных слов");
						triggernum = 0;
						s = "";
					}
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("Trace #1");
		} finally {
			try {
				fr1.close();
				fr2.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}	
	} 
}
