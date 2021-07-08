package homework_lesson11.task4;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Application {
	public static void main(String[] args) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		
		try {
			 fos = new FileOutputStream("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task4\\serializator");
			 oos = new ObjectOutputStream(fos); /*В какой файл будем писать*/
			 fis = new FileInputStream("C:\\repositories\\TMS\\TeachMeSkills\\src\\homework_lesson11\\task4\\serializator");
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
			try {
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("fos problem");
			}
			try {
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
				System.out.println("oos problem");
			}
		}
	
	}

}
