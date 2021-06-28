package homework_lesson10;

public class Application {
public static void main(String[] args) {
	Car c1 = new Car ("Audi", 200, 15000);
	try {
		c1.start();
	} catch (MyExeption e) {
		System.out.println(e.toString());
	}
}
}
