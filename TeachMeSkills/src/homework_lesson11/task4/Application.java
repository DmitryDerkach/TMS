package homework_lesson11.task4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* Описание (2026): демонстрация сериализации — записывает два объекта Car в файл serializator через ObjectOutputStream, затем читает их обратно через ObjectInputStream и выводит в консоль. */
public class Application {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			 // fix 2026: абсолютный путь C:\repositories\TMS\TeachMeSkills\... заменён на относительный (запускать из папки TeachMeSkills)
			 fos = new FileOutputStream("src/homework_lesson11/task4/serializator");
			 oos = new ObjectOutputStream(fos); /*В какой файл будем писать*/
			 // fix 2026: абсолютный путь C:\repositories\TMS\TeachMeSkills\... заменён на относительный (запускать из папки TeachMeSkills)
			 fis = new FileInputStream("src/homework_lesson11/task4/serializator");
			 ois = new ObjectInputStream(fis);
				Car car1 = new Car ("Audi", 250, 25000);
				Car car2 = new Car ("Porsche", 300, 50000);
			oos.writeObject(car1);
			oos.writeObject(car2);
			Car carinput1 = (Car)ois.readObject();
			System.out.println(carinput1.toString());
			Car carinput2 = (Car)ois.readObject();
			System.out.println(carinput2.toString());
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Problem here"); 
		} finally {
			// fix 2026: проверка на null перед close() - если файл не открылся, раньше здесь падал NullPointerException
			try {
				if (fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("fos problem");
			}
			try {
				if (oos != null) oos.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("oos problem");
			}
		}
	
	}

}
