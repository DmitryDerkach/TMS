package homework_lesson10;

/* Описание (2026): Демонстрация пользовательского проверяемого исключения: создаёт машину Audi, пытается её завести через start() и перехватывает MyExeption, выводя сообщение "Машина не звелась". */
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
